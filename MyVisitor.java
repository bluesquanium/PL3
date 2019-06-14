// Generated from Kotlin.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link KotlinParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public class MyVisitor extends KotlinBaseVisitor<String> implements KotlinVisitor<String> {
   public String name = "default";
   public String result = "";
   public String parameters = "";

   public void setName(String name) {
      this.name = name;
   }

   @Override public String visitProg(KotlinParser.ProgContext ctx) {
      //System.out.println("Name is " + name);
      //String s = "visitProg";
      //System.out.println(s);

      this.visit(ctx.piPart());
      result += "\npublic class " + name + " {\n";
      this.visit(ctx.mainPart());
      result += "}";
      return result;
   }

   @Override public String visitPackagePar(KotlinParser.PackageParContext ctx) {
      String s = "visitPackagePar";
      System.out.println(s);
      
      result += ctx.PACKAGE() + " " + this.visit(ctx.piID()) + ";\n";
      return "";
   }

   @Override public String visitImportPar(KotlinParser.ImportParContext ctx) {
      result += ctx.IMPORT() + " " + this.visit(ctx.piID()) + ";\n";
      return "";
   }

   @Override public String visitPiID(KotlinParser.PiIDContext ctx) {
      return ctx.getText();
   }

   @Override public String visitMainPart(KotlinParser.MainPartContext ctx) {
      this.visitChildren(ctx);
      return "";
   }

   @Override public String visitFunMain(KotlinParser.FunMainContext ctx) {
      result += "\npublic static void main(String[] args) {\n";
      this.visit(ctx.inFun());
      result += "\n}\n";
      return "";
   }

   @Override public String visitFunPar(KotlinParser.FunParContext ctx) {
      //TODO: prefixDef

      result += "public static ";
      if( ctx.colontype() != null ) {
         result += this.visit(ctx.colontype()) + " ";
      }
      else {
         if(ctx.inFun().shortReturn != null) {
            result += "Object ";
         }
         else {
            result += "void ";
         }
      }
      result += ctx.ID() + " ( ";
      if(ctx.parameters() != null) {
         result += this.visit(ctx.parameters());
      }
      result += " ) {\n";
      this.visit(ctx.inFun());
      result += "\n}\n";
      return "";
   }

   @Override public String visitReturnPar(KotlinParser.ReturnParContext ctx) {
      result += "return ";
      if(ctx.expr()!=null) {
         this.visit(ctx.expr());
      }
      else {
         result += ";";
      }

      return "";
   }

   @Override public String visitNum(KotlinParser.NumContext ctx) {
      result += ctx.getText();
      return "";
   }

   @Override public String visitFun(KotlinParser.FunContext ctx) {
      //System.out.println("FunName : " + ctx.funName().getText());
      //System.out.println("FunName : " + "println");
      String temp = "";
      if(ctx.funName().getText().equals("println") || ctx.funName().getText().equals("print")) {
         temp += "System.out.";
      }
      temp += ctx.getText();
      return temp;
   }

   @Override public String visitCon(KotlinParser.ConContext ctx) {
      result += ctx.getText();
      return "";
   }

   @Override public String visitAssn(KotlinParser.AssnContext ctx) {
      if(ctx.varPar()!=null) {
         this.visit(ctx.varPar());
      }
      else if(ctx.valPar()!=null) {
         this.visit(ctx.valPar());
      }
      else {
         result += ctx.getText() + ";";
      }
      return "";
   }

   @Override public String visitValPar(KotlinParser.ValParContext ctx) {
      if(ctx.type() != null) {
         result += this.visit(ctx.type()) + " ";
      }
      else {
         if(ctx.initialize != null) {
            if(ctx.expr()!=null) {
               if(ctx.expr().STRING() != null) {
                  result += "String ";
               }
               else {
                  result += "Object ";
               }
            }
            else { //ctx.con()
               result += "boolean ";
            }
         }
         else {
            result += "Object ";
         }
      }
      result += ctx.ID().getText();
      if(ctx.initialize != null) {
         result += " = " + ( ctx.expr()!=null ? ctx.expr().getText() : ctx.con().getText() ) + ";";
      }
      else {
         result += ";";
      }
      return "";
   }

   @Override public String visitVarPar(KotlinParser.VarParContext ctx) {
      if(ctx.type() != null) {
         result += this.visit(ctx.type()) + " ";
      }
      else {
         result += "Object ";
      }
      result += ctx.ID().getText();
      if(ctx.initialize != null) {
         result += " = " + ( ctx.expr()!=null ? ctx.expr().getText() : ctx.con().getText() ) + ";";
      }
      else {
         result += ";";
      }
      return "";
   }

   @Override public String visitExpr(KotlinParser.ExprContext ctx) {
      //System.out.println("Expr : " + ctx.getText());
      if(ctx.fun()!=null) {
         result += this.visit(ctx.fun()) + ";";
      }
      else {
         result += ctx.getText() + ";";
      }
      return "";
   }

   @Override public String visitInFun(KotlinParser.InFunContext ctx) {
      String temp = "";
      if(ctx.shortReturn != null) {
         result += "return ";
      }
      this.visitChildren(ctx);
      return temp;
   }

   @Override public String visitParameter(KotlinParser.ParameterContext ctx) {
      parameters += this.visit(ctx.type()) + " " + ctx.ID() + ", ";
      return "";
   }

   @Override public String visitParameters(KotlinParser.ParametersContext ctx) {
      parameters = "";
      this.visitChildren(ctx);
      return parameters.substring(0, parameters.length()-2);
   }

   @Override public String visitColontype(KotlinParser.ColontypeContext ctx) {
      String type = this.visit(ctx.type());
      if(type.equals("any")) {
         type = "Object";
      }
      return type;
   }

   @Override public String visitType(KotlinParser.TypeContext ctx) {
      String type = ctx.getText().toLowerCase();
      //System.out.println("Type : " + type);
      if(type.equals("any")) {
         type = "Object";
      }
      return type;
   }

   @Override public String visitPrefixDef(KotlinParser.PrefixDefContext ctx) {
      return (ctx.OVERRIDE()==null?"":"override ") + (ctx.ABSTRACT()==null?"":"abstract ");
   }
/*
con_expr : IF '(' con ')' ( '{' (expr | assn | con_expr | loop | whenPar)* returnPar? '}' | (expr | assn | whenPar | returnPar) )
	( ELSE IF '(' con ')' ( '{' (expr | assn | con_expr | loop | whenPar)* returnPar? '}' | (expr | assn | whenPar | returnPar) ) )*
	( ELSE ( '{' (expr | assn | con_expr | loop | whenPar)* returnPar? '}' | (expr | assn | whenPar | returnPar) ) )?; // Ambiguous for "con_expr, loop" when the case of non "{}"
*/

   @Override public String visitCon_expr(KotlinParser.Con_exprContext ctx) {
      visitChildren(ctx);
      return "";
   }

   @Override public String visitCon_expr_if(KotlinParser.Con_expr_ifContext ctx) {
      result += "if ( ";
      this.visit(ctx.con());
      result += " ) {\n";
      this.visit(ctx.inCon_expr());
      result += "\n}\n";
      return "";
   }
   @Override public String visitCon_expr_elseif(KotlinParser.Con_expr_elseifContext ctx) {
      result += "else if ( ";
      this.visit(ctx.con());
      result += " ) {\n";
      this.visit(ctx.inCon_expr());
      result += "\n}\n";
      return "";
   }
   @Override public String visitCon_expr_else(KotlinParser.Con_expr_elseContext ctx) {
      result += "else";
      result += " {\n";
      this.visit(ctx.inCon_expr());
      result += "\n}\n";
      return "";
   }

   @Override public String visitInCon_expr(KotlinParser.InCon_exprContext ctx) {
      return visitChildren(ctx);
   }

   @Override public String visitLoop(KotlinParser.LoopContext ctx) {
      return visitChildren(ctx);
   }
	/*
	
	
	@Override public T visitCommentPar(KotlinParser.CommentParContext ctx) { return visitChildren(ctx); }
	
	@Override public T visitType2Par(KotlinParser.Type2ParContext ctx) { return visitChildren(ctx); }
	
	@Override public T visitRange(KotlinParser.RangeContext ctx) { return visitChildren(ctx); }
	
	@Override public T visitWhen_expr(KotlinParser.When_exprContext ctx) { return visitChildren(ctx); }
	
	@Override public T visitWhenPar(KotlinParser.WhenParContext ctx) { return visitChildren(ctx); }
	
	@Override public T visitClassPar(KotlinParser.ClassParContext ctx) { return visitChildren(ctx); }
	
	@Override public T visitInterfacePar(KotlinParser.InterfaceParContext ctx) { return visitChildren(ctx); }
   */

}
