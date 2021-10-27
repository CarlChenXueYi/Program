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
	private String global_bexpr   = "";
	private String last_ifOutcome = "";

	private Stack<String> whileIncome = new Stack<String>();
	private Stack<String> ifOutcome   = new Stack<String>();

	private boolean global_in_if    = false;
	private boolean global_in_while = false;


	private Stack<Integer> st = new Stack<Integer>();
	

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
	

	@Override
	public Integer visitMainnode(HelloParser.MainnodeContext ctx) {

		// this.tabs++;
		visit(ctx.getChild(0));
		// this.tabs--;

		return 0;
	}

	@Override
	public Integer visitSequencenode(HelloParser.SequencenodeContext ctx) {

		if (ctx.sequencenode() != null)
		{

			if (ctx.statement(0).assigmentnode() != null)
			{
				visit(ctx.getChild(0));
				String in_pc  = "L" + String.valueOf(label_seq);
				String out_pc = "L" + String.valueOf(++label_seq);

				System.out.println(this.true_varName + "'=" + this.global_varValue + "∧" + "Same("
							+ this.true_varName + ")" + "∧" + "pc=" + in_pc + "∧" + "pc'=" + out_pc + " ∨");
				visit(ctx.getChild(1));
			}

			if (ctx.statement(0).whilenode() != null || ctx.statement(0).ifnode() != null)
			{
				visit(ctx.getChild(0));
				visit(ctx.getChild(1));
			}
		}
		else 
		{

			if ((ctx.statement(0).assigmentnode() != null) && (ctx.statement(1).assigmentnode() != null))
			{
				visit(ctx.getChild(0));
				String in_pc  = "L" + String.valueOf(label_seq);
				String out_pc = "L" + String.valueOf(++label_seq);

				System.out.println(this.true_varName + "'=" + this.global_varValue + "∧" + "Same("
							+ this.true_varName + ")" + "∧" + "pc=" + in_pc + "∧" + "pc'=" + out_pc + " ∨");

				visit(ctx.getChild(1));

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
				
				in_pc = "L" + String.valueOf(label_seq);

				System.out.println(this.true_varName + "'=" + this.global_varValue + "∧" + "Same("
							+ this.true_varName + ")" + "∧" + "pc=" + in_pc + "∧" + "pc'=" + out_pc + " ∨");
				
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
							+ this.true_varName + ")" + "∧" + "pc=" + in_pc + "∧" + "pc'=" + out_pc + " ∨");
			}
			if (ctx.statement(0).ifnode() != null && ctx.statement(1).assigmentnode() != null)
			{
				visit(ctx.getChild(0));
				visit(ctx.getChild(1));
				String in_pc          = last_ifOutcome;
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
							+ this.true_varName + ")" + "∧" + "pc=" + in_pc + "∧" + "pc'=" + out_pc + " ∨");
			}
			if (ctx.statement(0).assigmentnode() != null && ctx.statement(1).whilenode() != null)
			{
				visit(ctx.getChild(0));
				String in_pc  = "L" + String.valueOf(label_seq);
				String out_pc = "L" + String.valueOf(++label_seq);

				System.out.println(this.true_varName + "'=" + this.global_varValue + "∧" + "Same("
							+ this.true_varName + ")" + "∧" + "pc=" + in_pc + "∧" + "pc'=" + out_pc + " ∨");
				visit(ctx.getChild(1));
			}
		}

		this.global_in_if    = false;
		this.global_in_while = false;

		return 0;
	}

	@Override
	public Integer visitIfnode(HelloParser.IfnodeContext ctx) {
		String in_pc = "L" + String.valueOf(label_seq);

		String ifOutcomeLabel = "L" + String.valueOf(++label_seq);
		ifOutcome.push(ifOutcomeLabel);
		last_ifOutcome = ifOutcomeLabel;
		global_bexpr   = "";
		visit(ctx.bexpr());
		String bexpr = this.global_bexpr;
		System.out.println(this.global_bexpr + "∧Same(V)∧pc=" + in_pc + "∧pc'=L" + String.valueOf(++label_seq) + " ∨");
		this.global_in_if = true;
		st.push(2);
		visit(ctx.blocknode(0));
		st.pop();


		System.out.println("!" + bexpr + "∧Same(V)∧pc=" + in_pc + "∧pc'=L" + String.valueOf(++label_seq) + " ∨");
		this.global_bexpr = "";
		this.global_in_if = true;
		st.push(2);
		visit(ctx.blocknode(1));
		st.pop();
		ifOutcome.pop();
		return 0;
	}

	@Override
	public Integer visitWhilenode(HelloParser.WhilenodeContext ctx) {
		String in_pc = "L" + String.valueOf(label_seq);
		whileIncome.push(in_pc);

		this.global_bexpr = "";
		visit(ctx.bexpr());
		String bexpr = this.global_bexpr;
		System.out.println(this.global_bexpr + "∧Same(V)∧pc=" + in_pc + "∧pc'=L" + String.valueOf(++label_seq) + " ∨");

		this.global_in_while = true;
		st.push(1);
		visit(ctx.blocknode());
		st.pop();
		System.out.println("!" + bexpr + "∧Same(V)∧pc=" + in_pc + "∧pc'=L" + String.valueOf(++label_seq) + " ∨");

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
				else if (pos == 2) 
				{
					out_pc = ifOutcome.peek();
				}
				else out_pc = "L" + String.valueOf(++label_seq);
				visit(ctx.statement());

				System.out.println(this.true_varName + "'=" + this.global_varValue + "∧" + "Same(" + this.true_varName
						+ ")" + "∧" + "pc=" + in_pc + "∧" + "pc'=" + out_pc + " ∨");
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
