import java.lang.Integer;

import javax.lang.model.util.ElementScanner6;

class MyVisitor extends HelloBaseVisitor<Integer> {
	private int tabs = 0;

	// Functie rudimentara pentru a printa tab-uri
	private void printTabs() {
		for (int i = 0; i < this.tabs; i++) {
			System.out.print("\t");
		}
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
		// this.printTabs();
		// this.tabs++;
		// visit(ctx.statement(0));
		// if(ctx.statement(1) == null && ctx.sequencenode() != null)
		// visit(ctx.sequencenode());
		// else
		// visit(ctx.statement(1));
		if (ctx.statement(0) != null && ctx.getChild(1) != null) {
			visit(ctx.getChild(0));
			System.out.println("L’’:");
			visit(ctx.getChild(1));
		} else {
			visit(ctx.getChild(0));
			visit(ctx.getChild(1));
		}

		// this.tabs--;

		return 0;
	}

	@Override
	public Integer visitIfnode(HelloParser.IfnodeContext ctx) {
		// this.printTabs();
		// System.out.println("<IfNode> if");
		// this.tabs++;
		System.out.printf("if (");
		visit(ctx.bexpr());
		System.out.println(" ) then L₁:");
		visit(ctx.blocknode(0));
		System.out.println("else L₂:");
		visit(ctx.blocknode(1));
		// this.tabs--;

		return 0;
	}

	@Override
	public Integer visitWhilenode(HelloParser.WhilenodeContext ctx) {
		// this.printTabs();
		// System.out.println("<WhileNode> while");
		System.out.printf("while (");
		// this.tabs++;
		visit(ctx.bexpr());
		System.out.println(" )");
		System.out.printf("do L₁:\n");
		visit(ctx.blocknode());
		// this.tabs--;

		return 0;
	}

	@Override
	public Integer visitStatement(HelloParser.StatementContext ctx) {

		visit(ctx.getChild(0));

		return 0;
	}

	@Override
	public Integer visitBlocknode(HelloParser.BlocknodeContext ctx) {
		// this.printTabs();
		// System.out.println("<BlockNode> {}");
		if (ctx.getChild(0) == null)
			return 0;

		// this.tabs++;
		System.out.println("{");
		if (ctx.sequencenode() != null) {
			visit(ctx.sequencenode());
		}
		if (ctx.statement() != null) {
			visit(ctx.statement());
		}
		// this.tabs--;
		System.out.println("\n}");
		return 0;
	}

	@Override
	public Integer visitAssigmentnode(HelloParser.AssigmentnodeContext ctx) {
		this.printTabs();
		// System.out.println("<AssignmentNode> pStart :=");

		// this.tabs++;
		// this.printTabs();
		visit(ctx.getChild(0));
		System.out.printf(" := ");
		visit(ctx.getChild(2));
		// this.tabs--;
		System.out.printf(";");
		return 0;
	}

	@Override
	public Integer visitPlusnode(HelloParser.PlusnodeContext ctx) {
		this.printTabs();
		System.out.println("<PlusNode> +");

		return 0;
	}

	@Override
	public Integer visitMinusnode(HelloParser.MinusnodeContext ctx) {
		this.printTabs();
		System.out.println("<MinusNode> -");

		return 0;
	}

	@Override
	public Integer visitTimesnode(HelloParser.TimesnodeContext ctx) {
		this.printTabs();
		System.out.println("<TimesNode> *");

		return 0;
	}

	@Override
	public Integer visitLessernode(HelloParser.LessernodeContext ctx) {
		this.printTabs();
		// System.out.println("<LesserNode> <");

		return 0;
	}

	@Override
	public Integer visitAndnode(HelloParser.AndnodeContext ctx) {
		this.printTabs();
		// System.out.println("<AndNode> &&");

		return 0;
	}

	@Override
	public Integer visitNotnode(HelloParser.NotnodeContext ctx) {
		this.printTabs();
		System.out.println("<NotNode> !");

		return 0;
	}

	@Override
	public Integer visitOrnode(HelloParser.OrnodeContext ctx) {
		this.printTabs();
		System.out.println("<OrNode> ||");

		return 0;
	}

	@Override
	public Integer visitBracketnode(HelloParser.BracketnodeContext ctx) {
		// this.printTabs();
		// System.out.println("<BracketNode> ()");

		// this.tabs++;
		if (ctx.expr() != null)
			visit(ctx.expr());

		else if (ctx.bexpr() != null)
			visit(ctx.bexpr());

		// this.tabs--;
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
			// visit(ctx.plusnode());
			// this.tabs++;
			visit(ctx.expr(0));
			System.out.printf(" + ");
			visit(ctx.expr(1));
			// this.tabs--;
		}

		if (ctx.minusnode() != null) {
			// visit(ctx.minusnode());

			// this.tabs++;
			visit(ctx.expr(0));
			System.out.printf(" - ");
			visit(ctx.expr(1));
			// this.tabs--;
		}
		if (ctx.timesnode() != null) {
			// visit(ctx.timesnode());

			// this.tabs++;
			visit(ctx.expr(0));
			System.out.printf(" * ");
			visit(ctx.expr(1));
			// this.tabs--;
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
			visit(ctx.notnode());
			this.tabs++;
			visit(ctx.bexpr(0));
			this.tabs--;
			System.out.println();
		}

		if (ctx.andnode() != null) {
			visit(ctx.andnode());

			this.tabs++;
			visit(ctx.bexpr(0));
			visit(ctx.bexpr(1));
			this.tabs--;
			System.out.println();
		}

		if (ctx.ornode() != null) {
			visit(ctx.ornode());

			this.tabs++;
			visit(ctx.bexpr(0));
			visit(ctx.bexpr(1));
			this.tabs--;
			System.out.println();
		}

		if (ctx.lessernode() != null) {
			// visit(ctx.lessernode());

			// this.tabs++;
			// this.printTabs();
			visit(ctx.expr(0));
			System.out.printf(" < ");
			visit(ctx.expr(1));
			// this.tabs--;
			// System.out.println();
		}
		if (ctx.equalnode() != null) {
			visit(ctx.equalnode());

			this.tabs++;
			visit(ctx.expr(0));
			visit(ctx.expr(1));
			this.tabs--;
			System.out.println();
		}

		return 0;
	}

	@Override
	public Integer visitIntnode(HelloParser.IntnodeContext ctx) {

		System.out.printf(ctx.getText());
		return 0;
	}

	@Override
	public Integer visitVarnode(HelloParser.VarnodeContext ctx) {

		System.out.printf(ctx.getText());

		return 0;
	}

	@Override
	public Integer visitBoolnode(HelloParser.BoolnodeContext ctx) {

		System.out.printf(ctx.getText());
		return 0;
	}
}
