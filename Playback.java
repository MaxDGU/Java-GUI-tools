import java.awt.*;
import javax.swing.*;

public class Playback extends JFrame {
	public Playback () {
	
	super("Playback");
	setLookAndFeel();
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setSize(350, 350);
	
	JLabel Singer = new JLabel ("Singer");
	JTextField SingerName = new JTextField(20);
	
	
	FlowLayout Text = new FlowLayout (); 
	setLayout(Text);
	
		add(Singer);
			add(SingerName);
			
			//for some reason the JCheckBox feature isn't being added
			
	JCheckBox Bass = new JCheckBox ("Bass", true);
	JCheckBox HDClarity = new JCheckBox ("HD-Clarity");
	JCheckBox Earphones = new JCheckBox ("Earphones", true);
	JCheckBox Headphones = new JCheckBox ("Headphones");
	ButtonGroup Preferences = new ButtonGroup ();
	
	FlowLayout Boxes = new FlowLayout ();
	setLayout(Boxes);
	
	Preferences.add(Bass);
	Preferences.add(HDClarity);
	Preferences.add(Earphones);
	Preferences.add(Headphones);
	

	
	JButton Play = new JButton("Play");
	JButton Pause = new JButton("Pause");
	JButton Stop = new JButton("Stop");
	FlowLayout flo = new FlowLayout ();
	
		setLayout(flo);
		
	add(Play);
	add(Pause);
	add(Stop);
	
	
	JComboBox Genre = new JComboBox ();

		Genre.addItem("Pop");
		Genre.addItem("Classical");
		Genre.addItem("Alternative");
		Genre.addItem("Electric");
		Genre.addItem("Dance");
		Genre.addItem("Country");
		Genre.addItem("Rap/Hip-Hop");
		add(Genre);
		
		
		JTextArea Comments = new JTextArea ("Comment on the software here: ", 10, 25);
		
		Comments.setLineWrap(true);
		Comments.setWrapStyleWord(true);
		
		JScrollPane Scroll = new JScrollPane (Comments,
		JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
		JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		
		add(Scroll);
		add(Comments);
		
	

	setVisible(true);
	
	
	
	}	
	
	private void setLookAndFeel () {
		
		try {
			UIManager.setLookAndFeel(
				"sun.java.swing.plaf.nimbus.NimbusLookAndFeel"
			);
			
		 }
			catch (Exception exc) {
			//ignore error
		}
	}
	
	public static void main(String[] arguments) {
		
		Playback Frame = new Playback ();
	}
}