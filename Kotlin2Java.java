import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.FileWriter;
import org.antlr.v4.runtime.ANTLRInputStream;
import java.io.IOException;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;


public class Kotlin2Java {
   public static void main(String[] args) throws IOException {
      System.out.println("** Expression Eval w/ antlr-listener **");

      File ifile = new File(args[0]);
      String o;
      try {
         o = "./" + args[1];
      }
      catch (Exception e) {
         e.printStackTrace();
         o = "./output.java";
      }
      File ofile = new File(o);
      FileInputStream fis = new FileInputStream(ifile);
      FileOutputStream fout = new FileOutputStream(ofile);
      
      // Walk parse-tree and attach our listener
      ParseTreeWalker walker = new ParseTreeWalker();
      MyVisitor visitor = new MyVisitor();
      visitor.setName(o.substring(2, o.length()-5));
         
      ANTLRInputStream input = new ANTLRInputStream(fis);
      // Get lexer
      KotlinLexer lexer = new KotlinLexer(input);
      // Get a list of matched tokens
      CommonTokenStream tokens = new CommonTokenStream(lexer);
      // Pass tokens to parser
      KotlinParser parser = new KotlinParser(tokens);
      KotlinParser.ProgContext tree = parser.prog(); // root of grammar

      String result = visitor.visit(tree);

      // walk from the root of parse tree
      //walker.walk(listener, parser.prog());
      /*
      if(listener.mode == 0) {
         listener.resetMode();
         System.out.println(listener.getResult());
      }
      */

      /*
      fis = new FileInputStream(ifile);
      try {
         int tmp = 0;
         while((tmp = fis.read()) != -1) {
            fout.write(tmp);
         }

         //FileWriter fw = new FileWriter(ofile, true);
         //fw.write(fis);
         //fw.close();
      }
      catch (IOException e) {
         e.printStackTrace();
      }
      */

      try {
         if(result == null) {
            result = "null :(";
         }
         OutputStream out = new FileOutputStream(ofile);
         byte[] by = result.getBytes();
         out.write(by);
      }
      catch (Exception e) {
         e.printStackTrace();
      }

   }
} 

