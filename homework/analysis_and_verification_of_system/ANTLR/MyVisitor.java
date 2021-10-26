import java.lang.Integer;
import java.util.Stack;

import javax.lang.model.util.ElementScanner6;
import javax.print.DocFlavor.STRING;

class MyVisitor extends HelloBaseVisitor<Integer> {
	private int label_seq          = 0;
	private int if_seq             = 0;
	private int while_seq          = 0;
	private String global_varValue = "";
	private String global_varName  = "";
	private String true_varName;
	private String global_bexpr = "";
	private String last_ifOutcome = "";
	//解决while回到循环重新开始，添加一个栈来存String global_whileIncome
	private Stack<String> whileIncome = new Stack<String>();
	private Stack<String> ifOutcome = new Stack<String>();

	private boolean global_in_if    = false;
	private boolean global_in_while = false;

	// 如果是while循环：推入1，如果是if判断：推入2
	private Stack<Integer> st = new Stack<Integer>();
	// Functie rudimentara pentru a printa tab-uri
	// private void printTabs() {
	// for (int i = 0; i < this.tabs; i++) {
	// System.out.print("\t");
	// }
	// }

	// public String GetInPC() {
	// 	String in_pc;
	// 	in_pc = "L" + String.valueOf(this.label_seq);
	// 	if (this.global_in_if) {
	// 		in_pc             = "I" + String.valueOf(this.if_seq);
	// 		this.global_in_if = false;
	// 	}
	// 	if (this.global_in_while) {
	// 		in_pc                = "W" + String.valueOf(this.while_seq);
	// 		this.global_in_while = false;
	// 	}
	// 	return in_pc;
	// }

	// public String GetLastPC() {
	// 	String out_pc;
	// 	out_pc = "L" + String.valueOf(++this.label_seq);
	// 	if (st.isEmpty())
	// 		return out_pc;

	// 	int temp = st.pop();

	// 	if (st.isEmpty()) {
	// 		st.push(temp);
	// 		return out_pc;
	// 	}

	// 	temp = st.peek();
	// 	if (temp == 1) {
	// 		while_seq++;
	// 		out_pc = "W" + String.valueOf(while_seq);
	// 	}
	// 	if (temp == 2) {
	// 		if_seq++;
	// 		out_pc = "I" + String.valueOf(if_seq);
	// 	}
	// 	return out_pc;
	// }

	//返回0代表什么里面都不在，返回1代表在while中，返回2代表再if中
	public int GetPosition()
	{
		int temp;
		if (!st.isEmpty())
		{
			temp = st.peek();
			return temp;
		}
		return 0;
	}
	//statement：statement情况下获取pc'
	// public String judgeIsWhileOutPC() {
	// 	String out_pc;
	// 	if (!this.whileIncome.isEmpty())
	// 	{
	// 		out_pc = this.whileIncome.peek();
	// 		this.whileIncome.pop();
	// 		return out_pc;
	// 	}
	// 	//这里能++吗？如果是if第一个，那么就有问题了
	// 	return "L" + String.valueOf(++label_seq);
	// }

	// public String GetOutPC(String func) {
	// 	// String out_pc;
	// 	if (func == "seq") {
	// 		return "L" + String.valueOf(++this.label_seq);
	// 	}
	// 	if (func == "if") {
	// 		this.if_seq++;
	// 		return "I" + String.valueOf(if_seq);
	// 	}
	// 	if (func == "while") {
	// 		this.while_seq++;
	// 		return "W" + String.valueOf(while_seq);
	// 	}
	// 	return "";
	// 	// return out_pc;
	// }

	@Override
	public Integer visitMainnode(HelloParser.MainnodeContext ctx) {

		// this.tabs++;
		visit(ctx.getChild(0));
		// this.tabs--;

		return 0;
	}

	@Override
	public Integer visitSequencenode(HelloParser.SequencenodeContext ctx) {
		// System.out.println("seq");
		// System.out.println(ctx.getChild(0));
		// System.out.println(ctx.getChild(1));
		//new content
		//statement：seq与statement：statement区别：   后一个节点是不是要输出
		if (ctx.sequencenode() != null)
		{
			//assign与while/if区别，这里是不是要处理
			if (ctx.statement(0).assigmentnode() != null)
			{
				visit(ctx.getChild(0));
				String in_pc = "L" + String.valueOf(label_seq);
				String out_pc = "L" + String.valueOf(++label_seq);

				System.out.println(this.true_varName + "'=" + this.global_varValue + "∧" + "Same("
							+ this.true_varName + ")" + "∧" + "pc=" + in_pc + "∧" + "pc'=" + out_pc);
				visit(ctx.getChild(1));
			}
			// case 3   while/if:while/if
			if (ctx.statement(0).whilenode() != null || ctx.statement(0).ifnode() != null)
			{
				visit(ctx.getChild(0));
				visit(ctx.getChild(1));
			}
		}
		else //statement : statement
		{
			//都是assign，都需要输出
			// 特殊点，这是某个最后的地方为ass：ass的情况，如果是在while里面，那么是不往下面走的，而是要回while起点
			//if (ctx.statement(0).assigmentnode())

			if ((ctx.statement(0).assigmentnode() != null) && (ctx.statement(1).assigmentnode() != null))
			{
				visit(ctx.getChild(0));
				String in_pc = "L" + String.valueOf(label_seq);
				String out_pc = "L" + String.valueOf(++label_seq);

				System.out.println(this.true_varName + "'=" + this.global_varValue + "∧" + "Same("
							+ this.true_varName + ")" + "∧" + "pc=" + in_pc + "∧" + "pc'=" + out_pc);

				visit(ctx.getChild(1));

				int pos = GetPosition();
				if (pos == 1)
				{
					out_pc = whileIncome.peek();
				}
				else if (pos == 2) //表明在第一个if里面，则label_seq
				{
					out_pc = ifOutcome.peek();
				}
				else out_pc = "L" + String.valueOf(++label_seq);
				
				in_pc = "L" + String.valueOf(label_seq);

				System.out.println(this.true_varName + "'=" + this.global_varValue + "∧" + "Same("
							+ this.true_varName + ")" + "∧" + "pc=" + in_pc + "∧" + "pc'=" + out_pc);
				
			}

			if ((ctx.statement(0).whilenode() != null) && ctx.statement(1).assigmentnode() != null)
			{
				visit(ctx.getChild(0));
				visit(ctx.getChild(1));
				String in_pc = "L" + String.valueOf(label_seq);
				String out_pc;
				int pos = GetPosition();
				if (pos == 1)
				{
					out_pc = whileIncome.peek();
				}
				else if (pos == 2)
				{
					out_pc = ifOutcome.peek();
				}
				else out_pc = "L" + String.valueOf(++label_seq);
				System.out.println(this.true_varName + "'=" + this.global_varValue + "∧" + "Same("
							+ this.true_varName + ")" + "∧" + "pc=" + in_pc + "∧" + "pc'=" + out_pc);
			}
			if (ctx.statement(0).ifnode() != null && ctx.statement(1).assigmentnode() != null)
			{
				visit(ctx.getChild(0));
				visit(ctx.getChild(1));
				String in_pc = last_ifOutcome;
				last_ifOutcome = "";
				String out_pc;
				int pos = GetPosition();
				if (pos == 1)
				{
					out_pc = whileIncome.peek();
				}
				else if (pos == 2)
				{
					out_pc = ifOutcome.peek();
				}
				else out_pc = "L" + String.valueOf(++label_seq);
				System.out.println(this.true_varName + "'=" + this.global_varValue + "∧" + "Same("
							+ this.true_varName + ")" + "∧" + "pc=" + in_pc + "∧" + "pc'=" + out_pc);
			}
			if (ctx.statement(0).assigmentnode() != null && ctx.statement(1).whilenode() != null)
			{
				visit(ctx.getChild(0));
				String in_pc = "L" + String.valueOf(label_seq);
				String out_pc = "L" + String.valueOf(++label_seq);

				System.out.println(this.true_varName + "'=" + this.global_varValue + "∧" + "Same("
							+ this.true_varName + ")" + "∧" + "pc=" + in_pc + "∧" + "pc'=" + out_pc);
				visit(ctx.getChild(1));
			}
		}

		this.global_in_if = false;
		this.global_in_while = false;



		//old content
		// if (ctx.statement(0) != null && ctx.getChild(1) != null) {
		// 	if (ctx.sequencenode() == null) {

		// 		// if (ctx.getChild(1) == )
		// 		if (ctx.statement(0).assigmentnode() == null) {
		// 			visit(ctx.getChild(0));
		// 			String in_pc = GetInPC();
		// 			visit(ctx.getChild(1));
		// 			System.out.println(this.true_varName + "'=" + this.global_varValue + "∧" + "Same("
		// 					+ this.true_varName + ")" + "∧" + "pc=" + in_pc + "∧" + "pc'=" + GetLastPC());
		// 		} else if (ctx.statement(1).assigmentnode() == null) {
		// 			visit(ctx.getChild(0));
		// 			String in_pc  = GetInPC();
		// 			String out_pc = GetLastPC();
		// 			System.out.println(this.true_varName + "'=" + this.global_varValue + "∧" + "Same("
		// 					+ this.true_varName + ")" + "∧" + "pc=" + in_pc + "∧" + "pc'=" + out_pc);
		// 			this.true_varName    = "";
		// 			this.global_varName  = "";
		// 			this.global_varValue = "";
		// 			visit(ctx.getChild(1));
		// 		} else {
		// 			visit(ctx.getChild(0));
		// 			String in_pc = GetInPC();
		// 			System.out.println(this.true_varName + "'=" + this.global_varValue + "∧" + "Same("
		// 					+ this.true_varName + ")" + "∧" + "pc=" + in_pc + "∧" + "pc'=" + GetLastPC());
		// 			this.true_varName    = "";
		// 			this.global_varName  = "";
		// 			this.global_varValue = "";
		// 			visit(ctx.getChild(1));
		// 			System.out.println(this.true_varName + "'=" + this.global_varValue + "∧" + "Same("
		// 					+ this.true_varName + ")" + "∧" + "pc=" + in_pc + "∧" + "pc'=" + GetLastPC());
		// 		}
		// 	} else {
		// 		visit(ctx.getChild(0));
		// 		String in_pc  = GetInPC();
		// 		String out_pc = GetOutPC("seq");
		// 		System.out.println(this.true_varName + "'=" + this.global_varValue + "∧" + "Same(" + this.true_varName
		// 				+ ")" + "∧" + "pc=" + in_pc + "∧" + "pc'=" + out_pc);
		// 		visit(ctx.getChild(1));
		// 	}
		// } else {
		// 	global_varName  = "";
		// 	global_varValue = "";
		// 	System.out.println("hi");
		// 	visit(ctx.getChild(0));
		// 	visit(ctx.getChild(1));
		// }

		return 0;
	}

	@Override
	public Integer visitIfnode(HelloParser.IfnodeContext ctx) {
		String in_pc = "L" + String.valueOf(label_seq);

		String ifOutcomeLabel = "L" + String.valueOf(++label_seq);
		ifOutcome.push(ifOutcomeLabel);
		last_ifOutcome = ifOutcomeLabel;
		global_bexpr = "";
		visit(ctx.bexpr());
		String bexpr = this.global_bexpr;
		System.out.println(this.global_bexpr + "∧same(V)∧pc=" + in_pc + "∧pc'=L" + String.valueOf(++label_seq));
		this.global_in_if = true;
		st.push(2);
		visit(ctx.blocknode(0));
		st.pop();

		// String out_pc = GetOutPC("if");
		// if(st.peek()==1)
		// out_pc = while_seq;
		// if(st.peek()==2)
		// out_pc = if_seq;

		// System.out.println(
		// true_varName + "'=" + global_varValue + "∧same(" + true_varName + ")∧pc=" +
		// in_pc + "pc'=" + out_pc);


		System.out.println("¬" + bexpr + "∧same(V)∧pc=" + in_pc + "∧pc'=L" + String.valueOf(++label_seq));
		this.global_bexpr = "";
		this.global_in_if = true;
		st.push(2);
		visit(ctx.blocknode(1));
		st.pop();
		// System.out.println(
		// true_varName + "'=" + global_varValue + "∧same(" + true_varName + ")∧pc=" +
		// in_pc + "pc'=" + out_pc);
		ifOutcome.pop();
		return 0;
	}

	@Override
	public Integer visitWhilenode(HelloParser.WhilenodeContext ctx) {
		//new content
		String in_pc = "L" + String.valueOf(label_seq);
		whileIncome.push(in_pc);

		this.global_bexpr = "";
		visit(ctx.bexpr());
		String bexpr = this.global_bexpr;
		System.out.println(this.global_bexpr + "∧Same(V)∧pc=" + in_pc + "∧pc'=L" + String.valueOf(++label_seq));

		this.global_in_while = true;
		st.push(1);
		visit(ctx.blocknode());
		st.pop();
		// if (ctx.blocknode().sequencenode() == null) {
		// 	++label_seq;
		// }
		System.out.println("¬" + bexpr + "∧Same(V)∧pc=" + in_pc + "∧pc'=L" + String.valueOf(++label_seq));

		//old content 
		// String in_pc     = GetInPC();
		// int    first_out = ++while_seq;

		// this.global_bexpr = "";
		// visit(ctx.bexpr());
		// String bexpr = this.global_bexpr;
		// System.out.println(this.global_bexpr + "∧Same(V)∧pc=" + in_pc + "∧pc'=W" + String.valueOf(first_out));

		// this.global_in_while = true;
		// st.push(1);
		// visit(ctx.blocknode());
		// st.pop();
		// if (ctx.blocknode().sequencenode() == null) {
		// 	++label_seq;
		// }
		// System.out.println("¬" + bexpr + "∧Same(V)∧pc=" + in_pc + "∧pc'=L" + String.valueOf(label_seq));
		whileIncome.pop();
		return 0;
	}

	@Override
	public Integer visitStatement(HelloParser.StatementContext ctx) {
		visit(ctx.getChild(0));

		return 0;
	}

	@Override
	public Integer visitBlocknode(HelloParser.BlocknodeContext ctx) {

		if (ctx.getChild(0) == null)
			return 0;

		if (ctx.sequencenode() != null) {
			visit(ctx.sequencenode());

		}
		if (ctx.statement() != null) {
			if (ctx.statement().assigmentnode() != null) {
				String in_pc = "L" + String.valueOf(label_seq);
				String out_pc;
				int pos = GetPosition();
				if (pos == 1)
				{
					out_pc = whileIncome.peek();
				}
				else if (pos == 2) //表明在第一个if里面，则label_seq
				{
					out_pc = ifOutcome.peek();
				}
				else out_pc = "L" + String.valueOf(++label_seq);
				visit(ctx.statement());

				System.out.println(this.true_varName + "'=" + this.global_varValue + "∧" + "Same(" + this.true_varName
						+ ")" + "∧" + "pc=" + in_pc + "∧" + "pc'=" + out_pc);
				this.true_varName    = "";
				this.global_varName  = "";
				this.global_varValue = "";
			} else {
				visit(ctx.statement());
			}
		}
		return 0;
	}

	@Override
	public Integer visitAssigmentnode(HelloParser.AssigmentnodeContext ctx) {
		global_varName = "";
		true_varName   = "";
		visit(ctx.getChild(0));
		true_varName    = global_varName;
		global_varValue = "";
		visit(ctx.getChild(2));

		return 0;
	}
	// 以下好像都没有用到
	// @Override
	// public Integer visitPlusnode(HelloParser.PlusnodeContext ctx) {
	// this.printTabs();
	// System.out.println("<PlusNode> +");

	// return 0;
	// }

	// @Override
	// public Integer visitMinusnode(HelloParser.MinusnodeContext ctx) {
	// this.printTabs();
	// System.out.println("<MinusNode> -");

	// return 0;
	// }

	// @Override
	// public Integer visitTimesnode(HelloParser.TimesnodeContext ctx) {
	// this.printTabs();
	// System.out.println("<TimesNode> *");

	// return 0;
	// }

	// @Override
	// public Integer visitLessernode(HelloParser.LessernodeContext ctx) {
	// this.printTabs();
	// // System.out.println("<LesserNode> <");

	// return 0;
	// }

	// @Override
	// public Integer visitAndnode(HelloParser.AndnodeContext ctx) {
	// this.printTabs();
	// // System.out.println("<AndNode> &&");

	// return 0;
	// }

	// @Override
	// public Integer visitNotnode(HelloParser.NotnodeContext ctx) {
	// this.printTabs();
	// System.out.println("<NotNode> !");

	// return 0;
	// }

	// @Override
	// public Integer visitOrnode(HelloParser.OrnodeContext ctx) {
	// this.printTabs();
	// System.out.println("<OrNode> ||");

	// return 0;
	// }

	@Override
	public Integer visitBracketnode(HelloParser.BracketnodeContext ctx) {

		if (ctx.expr() != null)
			visit(ctx.expr());

		else if (ctx.bexpr() != null) {
			global_bexpr += "(";
			visit(ctx.bexpr());
			global_bexpr += ")";
		}

		return 0;
	}

	@Override
	public Integer visitExpr(HelloParser.ExprContext ctx) {
		if (ctx.varnode() != null)
			visit(ctx.varnode());

		if (ctx.intnode() != null)
			visit(ctx.intnode());

		if (ctx.bracketnode() != null)
			visit(ctx.bracketnode());

		if (ctx.plusnode() != null) {
			visit(ctx.expr(0));

			global_bexpr    += "+";
			global_varValue += "+";

			visit(ctx.expr(1));

		}

		if (ctx.minusnode() != null) {

			visit(ctx.expr(0));

			global_bexpr    += "-";
			global_varValue += "-";
			visit(ctx.expr(1));

		}
		if (ctx.timesnode() != null) {

			visit(ctx.expr(0));
			global_bexpr    += "*";
			global_varValue += "*";
			visit(ctx.expr(1));

		}
		return 0;
	}

	@Override
	public Integer visitBexpr(HelloParser.BexprContext ctx) {
		if (ctx.boolnode() != null)
			visit(ctx.boolnode());

		if (ctx.bracketnode() != null)
			visit(ctx.bracketnode());

		if (ctx.notnode() != null) {
			global_bexpr    += "!";
			global_varValue += "!";
			visit(ctx.bexpr(0));
		}

		if (ctx.andnode() != null) {
			visit(ctx.bexpr(0));
			global_bexpr    += "&";
			global_varValue += "&";
			visit(ctx.bexpr(1));
		}

		if (ctx.ornode() != null) {
			// isit(ctx.ornode());
			visit(ctx.bexpr(0));

			global_bexpr    += "|";
			global_varValue += "|";
			visit(ctx.bexpr(1));
		}

		if (ctx.lessernode() != null) {
			visit(ctx.expr(0));
			global_bexpr    += "<";
			global_varValue += "<";
			visit(ctx.expr(1));
		}
		if (ctx.equalnode() != null) {
			visit(ctx.equalnode());
			visit(ctx.expr(0));
			global_bexpr    += "==";
			global_varValue += "==";
			visit(ctx.expr(1));
		}

		return 0;
	}

	@Override
	public Integer visitIntnode(HelloParser.IntnodeContext ctx) {
		global_varName  += ctx.getText();
		global_varValue += ctx.getText();
		global_bexpr    += ctx.getText();

		return 0;
	}

	@Override
	public Integer visitVarnode(HelloParser.VarnodeContext ctx) {
		global_varName  += ctx.getText();
		global_varValue += ctx.getText();
		global_bexpr    += ctx.getText();

		return 0;
	}

	@Override
	public Integer visitBoolnode(HelloParser.BoolnodeContext ctx) {

		global_bexpr    += ctx.getText();
		global_varValue += ctx.getText();

		return 0;
	}
}
