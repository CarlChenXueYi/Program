// Generated from Hello.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HelloParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HelloVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HelloParser#mainnode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainnode(HelloParser.MainnodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(HelloParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#bexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBexpr(HelloParser.BexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#sequencenode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequencenode(HelloParser.SequencenodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#lessernode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessernode(HelloParser.LessernodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#equalnode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualnode(HelloParser.EqualnodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#andnode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndnode(HelloParser.AndnodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#notnode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotnode(HelloParser.NotnodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#ornode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrnode(HelloParser.OrnodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#plusnode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusnode(HelloParser.PlusnodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#minusnode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinusnode(HelloParser.MinusnodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#timesnode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimesnode(HelloParser.TimesnodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#bracketnode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracketnode(HelloParser.BracketnodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#blocknode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlocknode(HelloParser.BlocknodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#assigmentnode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssigmentnode(HelloParser.AssigmentnodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(HelloParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#ifnode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfnode(HelloParser.IfnodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#whilenode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhilenode(HelloParser.WhilenodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#boolnode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolnode(HelloParser.BoolnodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#varnode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarnode(HelloParser.VarnodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#intnode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntnode(HelloParser.IntnodeContext ctx);
}