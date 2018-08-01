package p07;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;

public class Target extends JFrame{
	private final int SCREEN_WIDTH = 500;
	private final int SCREEN_HEIGHT = 400;
	private final int RADIUS1 = 72;
	private final int RADIUS2 = 47;
	private final int RADIUS3 = 22;
	private JLayeredPane layeredPane;
	
	public Target() {
		this.setSize(SCREEN_WIDTH, SCREEN_HEIGHT);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.layeredPane = new JLayeredPane();
		this.setLayeredPane(this.layeredPane);
		this.setVisible(true);
	}
	
	private GOval makeCenteredOval(Color color, int radius) {
		double x = this.getWidth()/2 - radius;
		double y = this.getHeight()/2 - radius;
		GOval oval = new GOval(x, y, 2*radius, 2*radius);
		oval.setColor(color);
//		oval.setBounds(0, 0, this.getWidth(), this.getHeight());
		oval.setSize(this.getWidth(), this.getHeight());
		return oval;
	}
	
	public void run() {
		GOval oval1 = makeCenteredOval(Color.red, RADIUS1);
		GOval oval2 = makeCenteredOval(Color.white, RADIUS2);
		GOval oval3 = makeCenteredOval(Color.red, RADIUS3);
		this.layeredPane.add(oval1, JLayeredPane.DEFAULT_LAYER);
		this.layeredPane.add(oval2, JLayeredPane.MODAL_LAYER);
		this.layeredPane.add(oval3, JLayeredPane.DRAG_LAYER);
		this.repaint();
	}
	
	
	public static void main(String[] args) {
		Target program = new Target();
		program.run();
	}
}
