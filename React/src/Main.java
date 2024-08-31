import classes.Program;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import antlr.ReactGrammarLexer;
import antlr.ReactGrammarParser;

import java.io.IOException;

public class Main {
    private static String source = "React/test1.txt";

    public static void main(String[] args) {
        try {
            CharStream cs = CharStreams.fromFileName(source);
            ReactGrammarLexer lexer = new ReactGrammarLexer(cs);
            CommonTokenStream token = new CommonTokenStream(lexer);
            ReactGrammarParser parser = new ReactGrammarParser(token);
            ReactGrammarParser.ProgramContext tree = parser.program();
            Program doc = (Program) new BaseVisitor().visit(tree);
            System.out.print(doc);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getSource() {
        return source;
    }
}
///////
//////