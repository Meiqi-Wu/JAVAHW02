package p10;

import javax.swing.JFrame;
import javax.swing.OverlayLayout;

public class SevenPetalRosette extends JFrame{
	// Each circle has this radius
	private static final int RADIUS = 100;
	
	// There should be this many circles around the center circle
	private static final int N_OUTER_CIRCLES = 7;

	private final int SCREEN_WIDTH = 800;
	private final int SCREEN_HEIGHT = 600;
	public static void main(String[] args) {
		SevenPetalRosette program = new SevenPetalRosette();
		program.run();
		
	}
	
	public void run() {
		GOval oval= makeCenteredOval();
		this.add(oval);
		drawOutterOval();
		this.repaint();
	}
	
	public SevenPetalRosette() {
		this.setSize(SCREEN_WIDTH, SCREEN_HEIGHT);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new OverlayLayout(this.getContentPane()));
		this.setVisible(true);
	}
	
	private void drawOutterOval() {
		double angle = 0;
		for(int i = 1; i< N_OUTER_CIRCLES; i++) {
			double delta = 360 /(N_OUTER_CIRCLES-1);
			angle += delta;
			GOval oval = makeCenteredOval();
			oval.movePolar(RADIUS, angle);
			this.add(oval);
		}
	}
	
	
	private GOval makeCenteredOval() {
		double x = this.getWidth()/2 - RADIUS;
		double y = this.getHeight()/2 - RADIUS;
		GOval oval = new GOval(x, y, 2*RADIUS, 2*RADIUS);
		oval.setFilled(false);
		oval.setSize(this.getWidth(), this.getHeight());
//		System.out.println("width: "+oval.getWidth());
//		System.out.println("height: "+oval.getHeight());
		oval.setLineWidth(5);
		return oval;
	}
}
