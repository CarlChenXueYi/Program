import java.lang.Integer;

import javax.lang.model.util.ElementScanner6;

class MyVisitor extends HelloBaseVisitor<Integer> {
	private int label_seq = 0;
	private int if_seq = 0;
	private int while_seq = 0;
	private String global_varValue = "";
	private String global_varName = "";

	private String global_bexpr = "";
	
	private boolean global_in_if = false;
	private boolean global_in_while = false;
	
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
		if (ctx.statement(0) != null && ctx.getChild(1) != null) {
			visit(ctx.getChild(0));
			label_seq++;
			String in_pc = "L" + (label_seq+"");
			if (global_in_if)
			{
				String str_if_seq = if_seq+"";
				in_pc = "I" + str_if_seq;
				label_seq--;
				global_in_if = false;
			}
			if (global_in_while)
			{
				String str_while_seq = while_seq+"";
				in_pc = "W" + str_while_seq;
				label_seq--;
				global_in_while = false;
			}
			label_seq++;
			String str_label_seq = label_seq+"";
			System.out.println(this.global_varName+"'="+this.global_varValue+"∧"+"Same("+this.global_varName+")"+"∧"+"pc="+in_pc+"∧"+"pc'="+"L"+str_label_seq);
			visit(ctx.getChild(1));
		} else {
			visit(ctx.getChild(0));
			visit(ctx.getChild(1));
		}
		return 0;
	}

	@Override
	public Integer visitIfnode(HelloParser.IfnodeContext ctx) {
		String in_pc = "L" + (label_seq+"");
		if (global_in_if)
		{
			String str_if_seq = if_seq+"";
			in_pc = "I" + str_if_seq;
			global_in_if = false;
		}
		if (global_in_while)
		{
			String str_while_seq = while_seq+"";
			in_pc = "W" + str_while_seq;
			global_in_while = false;
		}

		//control if_seq
		if_seq++;

		visit(ctx.bexpr());

		//output the content after if(bexpr) then ???
		System.out.println("("+global_bexpr+")"+"∧same(V)∧pc="+in_pc+"pc'="+"I"+String.valueOf(if_seq));
		
		global_in_if = true;
		visit(ctx.blocknode(0));
		//
		//用一个全局变量把最后一次赋值语句，无论是【赋值】还是【条件判断】还是【循环】最后一句肯定是赋值，并且最后一句肯定不是顺序类型，是可以打标签的
		//struct {varName,varValue}
		//前面一个pc也要带出来，设置一个全局变量，frontLabel，进入block时，把I1带进去，同时在block中判断全局I1是否有值，有的话如果里面有变化就随时修改I1
		//varName'=varValue & same{varName} & pc=global_i1 & pc'=i2

		//control if_seq
		if_seq++;

		System.out.println("¬("+global_bexpr+")"+"∧same(V)∧pc="+in_pc+"pc'="+"I"+String.valueOf(if_seq));

		global_in_if = true;
		visit(ctx.blocknode(1));

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
		visit(ctx.getChild(0));
		System.out.printf(" := ");
		visit(ctx.getChild(2));
		// this.tabs--;
		System.out.printf(";");
		return 0;
	}
	//以下好像都没有用到
	// @Override
	// public Integer visitPlusnode(HelloParser.PlusnodeContext ctx) {
	// 	this.printTabs();
	// 	System.out.println("<PlusNode> +");

	// 	return 0;
	// }

	// @Override
	// public Integer visitMinusnode(HelloParser.MinusnodeContext ctx) {
	// 	this.printTabs();
	// 	System.out.println("<MinusNode> -");

	// 	return 0;
	// }

	// @Override
	// public Integer visitTimesnode(HelloParser.TimesnodeContext ctx) {
	// 	this.printTabs();
	// 	System.out.println("<TimesNode> *");

	// 	return 0;
	// }

	// @Override
	// public Integer visitLessernode(HelloParser.LessernodeContext ctx) {
	// 	this.printTabs();
	// 	// System.out.println("<LesserNode> <");

	// 	return 0;
	// }

	// @Override
	// public Integer visitAndnode(HelloParser.AndnodeContext ctx) {
	// 	this.printTabs();
	// 	// System.out.println("<AndNode> &&");

	// 	return 0;
	// }

	// @Override
	// public Integer visitNotnode(HelloParser.NotnodeContext ctx) {
	// 	this.printTabs();
	// 	System.out.println("<NotNode> !");

	// 	return 0;
	// }

	// @Override
	// public Integer visitOrnode(HelloParser.OrnodeContext ctx) {
	// 	this.printTabs();
	// 	System.out.println("<OrNode> ||");

	// 	return 0;
	// }

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
			global_varValue += "+";
			visit(ctx.expr(1));
			// this.tabs--;
		}

		if (ctx.minusnode() != null) {
			// visit(ctx.minusnode());

			// this.tabs++;
			visit(ctx.expr(0));
			System.out.printf(" - ");
			global_varValue += "-";
			visit(ctx.expr(1));
			// this.tabs--;
		}
		if (ctx.timesnode() != null) {
			// visit(ctx.timesnode());

			// this.tabs++;
			visit(ctx.expr(0));
			System.out.printf(" * ");
			global_varValue += "*";
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
			global_varValue += "<";
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
		global_varValue += ctx.getText();
		//System.out.printf(ctx.getText());
		return 0;
	}

	@Override
	public Integer visitVarnode(HelloParser.VarnodeContext ctx) {
		global_varValue += ctx.getText();
		//System.out.printf(ctx.getText());

		return 0;
	}

	@Override
	public Integer visitBoolnode(HelloParser.BoolnodeContext ctx) {
		global_varValue += ctx.getText();
		//System.out.printf(ctx.getText());
		return 0;
	}
}
