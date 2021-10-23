import java.lang.Integer;
import java.util.Stack;

import javax.lang.model.util.ElementScanner6;

class MyVisitor extends HelloBaseVisitor<Integer> {
	private int label_seq = 0;
	private int if_seq = 0;
	private int while_seq = 0;
	private String global_varValue = "";
	private String global_varName = "";
	private String true_varName;
	private String global_bexpr = "";

	private boolean global_in_if = false;
	private boolean global_in_while = false;

	// 如果是while循环：推入1，如果是if判断：推入2
	private Stack<Integer> st = new Stack<Integer>();
	// Functie rudimentara pentru a printa tab-uri
	// private void printTabs() {
	// for (int i = 0; i < this.tabs; i++) {
	// System.out.print("\t");
	// }
	// }

	public String GetInPC() {
		String in_pc;
		in_pc = "L" + String.valueOf(this.label_seq);
		if (this.global_in_if) {
			in_pc = "I" + String.valueOf(this.if_seq);
			this.global_in_if = false;
		}
		if (this.global_in_while) {
			in_pc = "W" + String.valueOf(this.while_seq);
			this.global_in_while = false;
		}
		return in_pc;
	}

	public String GetLastPC() {
		String out_pc;
		this.label_seq++;
		out_pc = "L" + String.valueOf(label_seq);
		if (st.isEmpty())
			return out_pc;
		int temp = st.peek();
		if (temp == 1) {
			while_seq++;
			out_pc = "W" + String.valueOf(while_seq);
		}
		if (temp == 2) {
			if_seq++;
			out_pc = "I" + String.valueOf(if_seq);
		}
		return out_pc;
	}

	public String GetOutPC(String func) {
		// String out_pc;
		if (func == "seq") {
			this.label_seq++;
			return "L" + String.valueOf(label_seq);
		}
		if (func == "if") {
			this.if_seq++;
			return "I" + String.valueOf(if_seq);
		}
		if (func == "while") {
			this.while_seq++;
			return "W" + String.valueOf(while_seq);
		}
		return "";
		// return out_pc;
	}

	@Override
	public Integer visitMainnode(HelloParser.MainnodeContext ctx) {

		// this.tabs++;
		visit(ctx.getChild(0));
		// this.tabs--;

		return 0;
	}

	@Override
	public Integer visitSequencenode(HelloParser.SequencenodeContext ctx) {
		if (ctx.statement(0) != null && ctx.getChild(1) != null) {
			if (ctx.sequencenode() == null) {
				visit(ctx.getChild(0));
				String in_pc = GetInPC();
				String out_pc = GetLastPC();
				System.out.println(this.true_varName + "'=" + this.global_varValue + "∧" + "Same(" + this.true_varName
						+ ")" + "∧" + "pc=" + in_pc + "∧" + "pc'=" + out_pc);
				this.true_varName = "";
				this.global_varName = "";
				this.global_varValue = "";
				visit(ctx.getChild(1));
				System.out.println(this.true_varName + "'=" + this.global_varValue + "∧" + "Same(" + this.true_varName
						+ ")" + "∧" + "pc=" + in_pc + "∧" + "pc'=" + GetLastPC());
			} else {
				visit(ctx.getChild(0));
				String in_pc = GetInPC();
				String out_pc = GetOutPC("seq");
				System.out.println(this.true_varName + "'=" + this.global_varValue + "∧" + "Same(" + this.true_varName
						+ ")" + "∧" + "pc=" + in_pc + "∧" + "pc'=" + out_pc);
				visit(ctx.getChild(1));
			}
		} else {
			global_varName = "";
			global_varValue = "";

			visit(ctx.getChild(0));
			visit(ctx.getChild(1));
		}

		return 0;
	}

	@Override
	public Integer visitIfnode(HelloParser.IfnodeContext ctx) {
		String in_pc = GetInPC();

		int first_out = ++if_seq;
		int second_out = ++if_seq;

		global_bexpr = "";
		visit(ctx.bexpr());
		String bexpr = this.global_bexpr;
		System.out.println(this.global_bexpr + "∧same(V)∧pc=" + in_pc + "∧pc'=I" + String.valueOf(first_out));
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

		System.out.println("¬" + bexpr + "∧same(V)∧pc=" + in_pc + "∧pc'=I" + String.valueOf(second_out));
		this.global_bexpr = "";
		this.global_in_if = true;
		st.push(2);
		visit(ctx.blocknode(1));
		st.pop();
		// System.out.println(
		// true_varName + "'=" + global_varValue + "∧same(" + true_varName + ")∧pc=" +
		// in_pc + "pc'=" + out_pc);
		return 0;
	}

	@Override
	public Integer visitWhilenode(HelloParser.WhilenodeContext ctx) {
		String in_pc = GetInPC();
		int first_out = ++while_seq;

		this.global_bexpr = "";
		visit(ctx.bexpr());
		String bexpr = this.global_bexpr;
		System.out.println(this.global_bexpr + "∧Same(V)∧pc=" + in_pc + "∧pc'=W" + String.valueOf(first_out));

		this.global_in_while = true;
		st.push(1);
		visit(ctx.blocknode());
		st.pop();
		int second_out = ++label_seq;
		System.out.println("¬" + bexpr + "∧Same(V)∧pc=" + in_pc + "∧pc'=W" + String.valueOf(first_out));
		// System.out.println("pc=" + in_pc + "∧pc'=L" + String.valueOf(second_out) +
		// "∧¬" + bexpr + "∧Same(V)");

		// 带出来的最后的结果要显示
		// if (global_varName!="")
		// {
		// System.out.println(true_varName+"'="+global_varValue+"∧same("+true_varName+")∧pc="+in_pc+"pc'="+out_pc);
		// }

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
			if (ctx.getChild(0) != null && ctx.getChild(1) == null)
			{
				这里可以做一些操作了？
			}
			System.out.println("hi?look");
			visit(ctx.statement());
		}
		return 0;
	}

	@Override
	public Integer visitAssigmentnode(HelloParser.AssigmentnodeContext ctx) {
		global_varName = "";
		true_varName = "";
		visit(ctx.getChild(0));
		true_varName = global_varName;
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

			global_bexpr += "+";
			global_varValue += "+";

			visit(ctx.expr(1));

		}

		if (ctx.minusnode() != null) {

			visit(ctx.expr(0));

			global_bexpr += "-";
			global_varValue += "-";
			visit(ctx.expr(1));

		}
		if (ctx.timesnode() != null) {

			visit(ctx.expr(0));
			global_bexpr += "*";
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
			global_bexpr += "!";
			global_varValue += "!";
			visit(ctx.bexpr(0));
		}

		if (ctx.andnode() != null) {
			visit(ctx.bexpr(0));
			global_bexpr += "&";
			global_varValue += "&";
			visit(ctx.bexpr(1));
		}

		if (ctx.ornode() != null) {
			// isit(ctx.ornode());
			visit(ctx.bexpr(0));

			global_bexpr += "|";
			global_varValue += "|";
			visit(ctx.bexpr(1));
		}

		if (ctx.lessernode() != null) {
			visit(ctx.expr(0));
			global_bexpr += "<";
			global_varValue += "<";
			visit(ctx.expr(1));
		}
		if (ctx.equalnode() != null) {
			visit(ctx.equalnode());
			visit(ctx.expr(0));
			global_bexpr += "==";
			global_varValue += "==";
			visit(ctx.expr(1));
		}

		return 0;
	}

	@Override
	public Integer visitIntnode(HelloParser.IntnodeContext ctx) {
		global_varName += ctx.getText();
		global_varValue += ctx.getText();
		global_bexpr += ctx.getText();

		return 0;
	}

	@Override
	public Integer visitVarnode(HelloParser.VarnodeContext ctx) {
		global_varName += ctx.getText();
		global_varValue += ctx.getText();
		global_bexpr += ctx.getText();

		return 0;
	}

	@Override
	public Integer visitBoolnode(HelloParser.BoolnodeContext ctx) {

		global_bexpr += ctx.getText();
		global_varValue += ctx.getText();

		return 0;
	}
}
