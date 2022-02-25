import java.awt.*;
import javax.swing.*;

public class Lotto extends JFrame {
	
	LottoEvent lotto = new LottoEvent(this);
	
	
	JPanel row1 = new JPanel ();
	ButtonGroup group = new ButtonGroup ();
	JCheckBox Selection = new JCheckBox ("Quick Selection");
	JCheckBox Personal = new JCheckBox ("Personal", true);
	
	JPanel row2 = new JPanel ();
	JLabel picks = new JLabel ("Your Pick: ", JLabel.RIGHT);
	JTextField pickstxt [] = new JTextField [6];
	JLabel winner = new JLabel ("Winners: ", JLabel.RIGHT);
	JTextField winnertxt [] = new JTextField [6];
	
	JPanel row3 = new JPanel ();
	JButton stop = new JButton ("Stop");
	JButton play = new JButton ("Play");
	JButton reset = new JButton ("Reset");
	
	JPanel row4 = new JPanel ();
	JLabel three = new JLabel ("3 out of 6: ", JLabel.RIGHT);
	JTextField threetxt = new JTextField ("0");
	JLabel four = new JLabel ("4 out of 6: ", JLabel.RIGHT);
	JTextField fourtxt = new JTextField ("0");
	JLabel five = new JLabel ("5 out of 6: ", JLabel.RIGHT);
	JTextField fivetxt = new JTextField ("0");
	JLabel six = new JLabel ("6 out of 6: ", JLabel.RIGHT);
	JTextField sixtxt = new JTextField ("0");
	JLabel drawings = new JLabel ("Drawings: ", JLabel.RIGHT);
	JTextField drawingstxt = new JTextField ("0");
	JLabel years = new JLabel ("Years: ", JLabel.RIGHT);
	JTextField yearstxt = new JTextField ("0");
	
	public Lotto () {
		
		super("Lotto");
		setSize(600, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		FlowLayout flo = new FlowLayout (FlowLayout.CENTER, 10, 10);
		setLayout(flo);
		
		//add listeners
		Selection.addItemListener(lotto);
		Personal.addItemListener(lotto);
		stop.addActionListener(lotto);
		play.addActionListener(lotto);
		reset.addActionListener(lotto);
		
		
		GridLayout grid1 = new GridLayout (5, 1, 10, 10);
		row1.setLayout(grid1);
		group.add(Selection);
		group.add(Personal);
		row1.add(Selection);
		row1.add(Personal);
		
		add(row1);
		
		GridLayout grid2 = new GridLayout (2, 7, 10, 10);
		row2.setLayout(grid2);
		row2.add(picks);
		for (int i = 0; i < 6; i++) {
			pickstxt[i] = new JTextField ();
			row2.add(pickstxt[i]);
		}
		
		row2.add(winner);
		for (int i = 0; i < 6; i++) {
			winnertxt[i] = new JTextField ();
			row2.add(winnertxt[i]);
		}
		
		add(row2);
		
		FlowLayout flow = new FlowLayout (FlowLayout.CENTER, 10, 10);
		row3.setLayout(flow);
		stop.setEnabled(false);
		row3.add(stop);
		row3.add(reset);
		row3.add(play);
		
		add(row3);
		
		GridLayout grid3 = new GridLayout (2, 3, 20, 10);
		row4.setLayout(grid3);
		row4.add(three);
		threetxt.setEditable(false);
		row4.add(threetxt);
		row4.add(four);
		fourtxt.setEditable(false);
		row4.add(fourtxt);
		row4.add(five);
		fivetxt.setEditable(false);
		row4.add(fivetxt);
		row4.add(six);
		sixtxt.setEditable(false);
		row4.add(sixtxt);
		row4.add(drawings);
		drawingstxt.setEditable(false);
		row4.add(drawingstxt);
		row4.add(years);
		yearstxt.setEditable(false);
		row4.add(yearstxt);
		
		add(row4);
		
		setVisible(true);
		
	}
	
	private static void setLookAndFeel() {
		try {
			UIManager.setLookAndFeel(
			"sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Exception exc) {
			//ignore error
		}
	}
	
	public static void main(String [] arguments) {
		Lotto.setLookAndFeel();
		new Lotto();
	}
	
	
	
}