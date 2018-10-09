import java.awt.Toolkit;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Arrays;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
public class main {
	public static ParseTree makeASTtree(HelloParser parser){
		ParseTree tree = parser.program();
		JFrame frame = new JFrame("Antlr AST");
		JPanel panel = new JPanel();
		TreeViewer viewr = new TreeViewer(Arrays.asList(
				parser.getRuleNames()),tree);
		viewr.setScale(1.5);
		panel.add(viewr);
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(Toolkit.getDefaultToolkit().getScreenSize().width,Toolkit.getDefaultToolkit().getScreenSize().height);
		frame.setVisible(true);

		return tree;
	}
	
	public static void main(String[] args) {
		try{
			HelloLexer lexer = new HelloLexer( new ANTLRFileStream("test.c"));
			CommonTokenStream tokens = new CommonTokenStream( lexer );
			HelloParser parser = new HelloParser( tokens );
			//makeASTtree(parser);
			ParseTree tree = parser.program();

			new JavaBytecodeVisitor().visit(tree);
		
		} catch (IOException e){
			e.printStackTrace();
		}
	}

}
