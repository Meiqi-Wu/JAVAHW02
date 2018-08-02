package p06;

import javax.swing.JFrame;
import javax.swing.OverlayLayout;

public class Pyramid extends JFrame{
	private final int SCREEN_WIDTH = 600;
	private final int SCREEN_HEIGHT = 300;

	/** Width of each brick in pixels */
	private final int BRICK_WIDTH = 30;

	/** Height of each brick in pixels */
	private final int BRICK_HEIGHT = 12;

	/** Number of bricks in the base of the pyramid */
	private final int BRICKS_IN_BASE = 14;
	
	public Pyramid() {
		this.setSize(SCREEN_WIDTH, SCREEN_HEIGHT);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new OverlayLayout(this.getContentPane()));
		this.setVisible(true);
	}
	
	public void run() {
//		double startX = .0;
//		if(BRICKS_IN_BASE % 2 == 0) {
//			startX = this.getWidth()/2 - BRICKS_IN_BASE*BRICK_WIDTH /2;
//		} else{
//			startX = this.getWidth()/2 - (BRICKS_IN_BASE-1)*BRICK_WIDTH /2-BRICK_WIDTH /2;
//		}
		double startX = this.getWidth()/2 - BRICKS_IN_BASE*BRICK_WIDTH /2;
		double startY = this.getHeight() - BRICK_HEIGHT;
		for(int i = BRICKS_IN_BASE; i>0; i--) {
			double startX2 = startX;
			for(int j =0; j<i; j++) {	
				double x = startX2;
				double y = startY;
				GRect rect = new GRect(x, y, BRICK_WIDTH, BRICK_HEIGHT);
				rect.setSize(this.getWidth(), this.getHeight());
				this.add(rect); // REVIEW NOTE: you'd better use this.getContentPane().add(rect) instead of this.add(rect)
				startX2 += BRICK_WIDTH;
			}
			startX += BRICK_WIDTH/2;
			startY -= BRICK_HEIGHT;
		}
		
		this.repaint();
	}
	
	public static void main(String[] args) {
		Pyramid program = new Pyramid();
		program.run();
	}
	
}
