import java.awt.*;
import javax.swing.*;

public class Panic extends JFrame   {
		
		JButton panic = new JButton ("Panic");
		JButton media = new JButton ("Alert Media");
		JButton call = new JButton ("Call Police");
		JButton run = new JButton ("Run Away");
		JButton dont = new JButton ("Don't Panic");
		
		public Panic () {
			super("Crisis");
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			setSize(350, 350);
			setLookAndFeel();
			BorderLayout border = new BorderLayout ();
			setLayout(border);
			add(panic, BorderLayout.NORTH);
			add(media, BorderLayout.WEST);
			add(call, BorderLayout.CENTER);
			add(run, BorderLayout.EAST);
			add(dont, BorderLayout.SOUTH);
			setVisible(true);
		}
		
		private void setLookAndFeel () {
			try { UIManager.setLookAndFeel (
				"sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
			} catch (Exception exc) {
				
			}
		}
		
		public static void main(String[] arguments) {
			Panic p = new Panic ();
		}
}
