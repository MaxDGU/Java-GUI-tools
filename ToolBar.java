import javax.swing.*;
import java.awt.*;

public class ToolBar extends JFrame {
	
	public ToolBar () {
		
		super("ToolBar");
		setSize(370, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLookAndFeel();
		
		ImageIcon image1 = new ImageIcon("images copy.jpeg");
		JButton button = new JButton(image1);
		ImageIcon image2 = new ImageIcon("images copy2.jpeg");
		JButton button2 = new JButton (image2);
		ImageIcon image3 = new ImageIcon("images-3.jpeg");
		JButton button3 = new JButton(image3);
		
		JToolBar bar = new JToolBar ();
		bar.add(button);
		bar.add(button2);
		bar.add(button3);
		
		JTextArea edit = new JTextArea (8, 40);
		JScrollPane scroll = new JScrollPane(edit);
		
		BorderLayout border = new BorderLayout();
		setLayout(border);
		add("North", bar);
		add("Center", scroll);
		setVisible(true);
	}
	


private static void setLookAndFeel() {
	try {
		UIManager.setLookAndFeel(
		"sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
	} catch (Exception exc) {
		
	}
}


public static void main(String[] arguments) {
	
	ToolBar tool = new ToolBar();
}
}