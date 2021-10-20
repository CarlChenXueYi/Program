// Generated from Hello.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HelloParser}.
 */
public interface HelloListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HelloParser#mainnode}.
	 * @param ctx the parse tree
	 */
	void enterMainnode(HelloParser.MainnodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#mainnode}.
	 * @param ctx the parse tree
	 */
	void exitMainnode(HelloParser.MainnodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(HelloParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(HelloParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#bexpr}.
	 * @param ctx the parse tree
	 */
	void enterBexpr(HelloParser.BexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#bexpr}.
	 * @param ctx the parse tree
	 */
	void exitBexpr(HelloParser.BexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#sequencenode}.
	 * @param ctx the parse tree
	 */
	void enterSequencenode(HelloParser.SequencenodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#sequencenode}.
	 * @param ctx the parse tree
	 */
	void exitSequencenode(HelloParser.SequencenodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#lessernode}.
	 * @param ctx the parse tree
	 */
	void enterLessernode(HelloParser.LessernodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#lessernode}.
	 * @param ctx the parse tree
	 */
	void exitLessernode(HelloParser.LessernodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#equalnode}.
	 * @param ctx the parse tree
	 */
	void enterEqualnode(HelloParser.EqualnodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#equalnode}.
	 * @param ctx the parse tree
	 */
	void exitEqualnode(HelloParser.EqualnodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#andnode}.
	 * @param ctx the parse tree
	 */
	void enterAndnode(HelloParser.AndnodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#andnode}.
	 * @param ctx the parse tree
	 */
	void exitAndnode(HelloParser.AndnodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#notnode}.
	 * @param ctx the parse tree
	 */
	void enterNotnode(HelloParser.NotnodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#notnode}.
	 * @param ctx the parse tree
	 */
	void exitNotnode(HelloParser.NotnodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#ornode}.
	 * @param ctx the parse tree
	 */
	void enterOrnode(HelloParser.OrnodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#ornode}.
	 * @param ctx the parse tree
	 */
	void exitOrnode(HelloParser.OrnodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#plusnode}.
	 * @param ctx the parse tree
	 */
	void enterPlusnode(HelloParser.PlusnodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#plusnode}.
	 * @param ctx the parse tree
	 */
	void exitPlusnode(HelloParser.PlusnodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#minusnode}.
	 * @param ctx the parse tree
	 */
	void enterMinusnode(HelloParser.MinusnodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#minusnode}.
	 * @param ctx the parse tree
	 */
	void exitMinusnode(HelloParser.MinusnodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#timesnode}.
	 * @param ctx the parse tree
	 */
	void enterTimesnode(HelloParser.TimesnodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#timesnode}.
	 * @param ctx the parse tree
	 */
	void exitTimesnode(HelloParser.TimesnodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#bracketnode}.
	 * @param ctx the parse tree
	 */
	void enterBracketnode(HelloParser.BracketnodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#bracketnode}.
	 * @param ctx the parse tree
	 */
	void exitBracketnode(HelloParser.BracketnodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#blocknode}.
	 * @param ctx the parse tree
	 */
	void enterBlocknode(HelloParser.BlocknodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#blocknode}.
	 * @param ctx the parse tree
	 */
	void exitBlocknode(HelloParser.BlocknodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#assigmentnode}.
	 * @param ctx the parse tree
	 */
	void enterAssigmentnode(HelloParser.AssigmentnodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#assigmentnode}.
	 * @param ctx the parse tree
	 */
	void exitAssigmentnode(HelloParser.AssigmentnodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(HelloParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(HelloParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#ifnode}.
	 * @param ctx the parse tree
	 */
	void enterIfnode(HelloParser.IfnodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#ifnode}.
	 * @param ctx the parse tree
	 */
	void exitIfnode(HelloParser.IfnodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#whilenode}.
	 * @param ctx the parse tree
	 */
	void enterWhilenode(HelloParser.WhilenodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#whilenode}.
	 * @param ctx the parse tree
	 */
	void exitWhilenode(HelloParser.WhilenodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#boolnode}.
	 * @param ctx the parse tree
	 */
	void enterBoolnode(HelloParser.BoolnodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#boolnode}.
	 * @param ctx the parse tree
	 */
	void exitBoolnode(HelloParser.BoolnodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#varnode}.
	 * @param ctx the parse tree
	 */
	void enterVarnode(HelloParser.VarnodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#varnode}.
	 * @param ctx the parse tree
	 */
	void exitVarnode(HelloParser.VarnodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#intnode}.
	 * @param ctx the parse tree
	 */
	void enterIntnode(HelloParser.IntnodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#intnode}.
	 * @param ctx the parse tree
	 */
	void exitIntnode(HelloParser.IntnodeContext ctx);
}