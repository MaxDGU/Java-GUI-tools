import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.net.*;
import javax.swing.*;

public class LinkRotator2 extends JFrame implements Runnable, ActionListener {
	
	Thread go;
	String [] siteName = new String [3];
	JLabel displayName = new JLabel();
	URI [] siteLink = new URI [3];
	int current = 0;
	
	public LinkRotator2 () {
		
		setSize(500, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLookAndFeel();
		FlowLayout flo = new FlowLayout();
		setLayout(flo);
		add(displayName);
		siteName = new String [] {
			"Yahoo",
			"Apple",
			"Facebook"
		};
		siteLink[0] = getURI("http://yahoo.com");
		siteLink[1] = getURI("http://apple.com");
		siteLink[2] = getURI("http://facebook.com");
		Button goToPage = new Button("Visit Page");
		goToPage.addActionListener(this);
		add(goToPage);
		setVisible(true);
		start();
		
	}
	
	private URI getURI (String urlText) {
		URI pageURI = null;
		try {
			pageURI = new URI(urlText);
		} catch (URISyntaxException ex) {
			//do nothing
		}
		return pageURI;
	}
	
	
	public void start () {
		if(go == null) {
			go = new Thread(this);
			go.start();
		}
	}
	
	public void run () {
		Thread thisThread = Thread.currentThread();
		while(go == thisThread) {
			current++;
			if(current > 2) {
				current = 0;
			}
			displayName.setText(siteName[current]);
			repaint();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException exc) {
				//do nothing
			}
		}
	}
	
	public void actionPerformed(ActionEvent event) {
		
		Desktop desktop = Desktop.getDesktop();
		if (siteLink[current] != null) {
			try {
				desktop.browse(siteLink[current]);
				go = null;
				System.exit(0);
			} catch (IOException exc) {
				//do nothing
			}
		}
	}
	
	private static void setLookAndFeel() {
		try {
			UIManager.setLookAndFeel("sun.java.swing.nimbus.NimbusLookAndFeel");
		} catch (Exception e) {
			//do nothing
		}
	}
	
	public static void main(String[] arguments) {
		LinkRotator2 rotator = new LinkRotator2();
	}
		
	
}