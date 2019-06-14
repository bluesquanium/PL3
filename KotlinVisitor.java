// Generated from Kotlin.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link KotlinParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface KotlinVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link KotlinParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(KotlinParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#piPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPiPart(KotlinParser.PiPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#mainPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainPart(KotlinParser.MainPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#packagePar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackagePar(KotlinParser.PackageParContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#importPar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportPar(KotlinParser.ImportParContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#piID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPiID(KotlinParser.PiIDContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#prefixDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefixDef(KotlinParser.PrefixDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(KotlinParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(KotlinParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#commentPar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommentPar(KotlinParser.CommentParContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#type2Par}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType2Par(KotlinParser.Type2ParContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(KotlinParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#funMain}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunMain(KotlinParser.FunMainContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#funPar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunPar(KotlinParser.FunParContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#colontype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColontype(KotlinParser.ColontypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#inFun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInFun(KotlinParser.InFunContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#returnPar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnPar(KotlinParser.ReturnParContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#valPar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValPar(KotlinParser.ValParContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#varPar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarPar(KotlinParser.VarParContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(KotlinParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#assn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssn(KotlinParser.AssnContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#con}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCon(KotlinParser.ConContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#fun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFun(KotlinParser.FunContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#funName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunName(KotlinParser.FunNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#num}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum(KotlinParser.NumContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange(KotlinParser.RangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#con_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCon_expr(KotlinParser.Con_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#con_expr_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCon_expr_if(KotlinParser.Con_expr_ifContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#con_expr_elseif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCon_expr_elseif(KotlinParser.Con_expr_elseifContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#con_expr_else}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCon_expr_else(KotlinParser.Con_expr_elseContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#inCon_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInCon_expr(KotlinParser.InCon_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop(KotlinParser.LoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#when_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhen_expr(KotlinParser.When_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#whenPar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhenPar(KotlinParser.WhenParContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#classPar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassPar(KotlinParser.ClassParContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#interfacePar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfacePar(KotlinParser.InterfaceParContext ctx);
}