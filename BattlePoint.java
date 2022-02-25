import javax.swing.*;
import java.util.*;

import java.awt.*;

public class BattlePoint extends JFrame {
	
	ArrayList<Point> targets = new ArrayList<Point>();
	
	public BattlePoint() {
		
		createTargets();
		showMap();
		shoot(7, 4);
		shoot(3, 3);
		shoot(9, 2);
		showMap();
		
	}
	
	private void showMap() {
		System.out.println("\n  1 2 3 4 5 6 7 8 9");
		for (int columns = 0; columns < 10; columns++) {
			for (int rows = 0; rows < 10; rows++) {
				if (rows==1) {
					System.out.print(columns + " ");
				}
				System.out.print(" ");
				Point cell = new Point (rows, columns);
				if (targets.indexOf(cell) > -1) {
					System.out.print("X");
				}
				else {
					System.out.print(".");
				}
				System.out.print(" ");
			}
			
		}
		
	}
	
	private void createTargets() {
		
		Point pt = new Point (3, 5);
		targets.add(pt);
		Point pt2 = new Point (4, 7);
		targets.add(pt2);
		Point pt3 = new Point (9, 3);
		targets.add(pt3);
	}
	
	private void shoot(int x, int y) {
		Point shot = new Point (x, y);
		System.out.print("Firing at (" + x + ", " + y + ") ...");
		if (targets.indexOf(shot) > -1) {
			System.out.println("You sank my ship!");
			targets.remove(shot);
		}
		else {
			System.out.println("Miss!");
		}
	}
	
	public static void main(String [] arguments) {
		
		BattlePoint point = new BattlePoint();
	}
}