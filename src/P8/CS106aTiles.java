package P8;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.OverlayLayout;

public class CS106aTiles extends JFrame{
	private final int TILE_WIDTH = 100;
	private final int TILE_HEIGHT = 60;
	private final int WINDOW_WIDTH = 400;
	private final int WINDOW_HEIGHT = 360;
	private final int TILE_SPACE = 20;
//	private final int LABEL_WIDTH = 50;
//	private final int LABEL_HEIGHT = 10;
	private final String TEXT = "CS106a";
	
	public CS106aTiles() {
//		this.setSize(new Dimension(WINDOW_WIDTH, WINDOW_HEIGHT));
		this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new OverlayLayout(this.getContentPane()));
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		CS106aTiles program = new CS106aTiles(); 
		program.run();
	}
	
	public void run() {
		int rectX = (WINDOW_WIDTH-TILE_SPACE)/2-TILE_WIDTH;
		int rectY = (WINDOW_HEIGHT-TILE_SPACE)/2-TILE_HEIGHT;
		GRect rect = new GRect(rectX, rectY, TILE_WIDTH, TILE_HEIGHT);
		this.getContentPane().add(rect);
		

		
		int rect2X = (WINDOW_WIDTH+TILE_SPACE)/2;
		int rect2Y = rectY;
		GRect rect2 = new GRect(rect2X, rect2Y, TILE_WIDTH, TILE_HEIGHT);
		this.getContentPane().add(rect2);
		
		int rect3X = rectX;
		int rect3Y = (WINDOW_HEIGHT+TILE_SPACE)/2;
		GRect rect3 = new GRect(rect3X, rect3Y, TILE_WIDTH, TILE_HEIGHT);
		this.getContentPane().add(rect3);
		
		int rect4X = rect2X;
		int rect4Y = rect3Y;
		GRect rect4 = new GRect(rect4X, rect4Y, TILE_WIDTH, TILE_HEIGHT);
		this.getContentPane().add(rect4);
		
		GLabel label = new GLabel(TEXT);
//		int labelX = rectX + TILE_WIDTH/2 - label.getWidth()/2;
//		int labelY = rectY + TILE_HEIGHT/2 + label.getHeight()/2;
//		int labelX = rectX + TILE_WIDTH/2 - LABEL_WIDTH/2;
//		int labelY = rectY + TILE_HEIGHT/2 + LABEL_HEIGHT/2;
		int labelX = rectX + TILE_WIDTH/2;
		int labelY = rectY + TILE_HEIGHT/2 ;
		println("Width: "+label.getWidth());
		println("Height: "+label.getHeight());
		label.setLocation(labelX, labelY);
		this.getContentPane().add(label);
		
		GLabel label2 = new GLabel(TEXT);
//		int label2X = rectX + 3*TILE_WIDTH/2 + TILE_SPACE - label2.getWidth()/2;
//		int label2X = rect2X + TILE_WIDTH/2 - LABEL_WIDTH/2;
		int label2X = rect2X + TILE_WIDTH/2;
		int label2Y = labelY;
		println("Width: "+label2.getWidth());
		println("Height: "+label2.getHeight());
		label2.setLocation(label2X, label2Y);
		this.getContentPane().add(label2);
		
		GLabel label3 = new GLabel(TEXT);
		int label3X = labelX;
//		int label3Y = rectY + 3*TILE_HEIGHT/2 + TILE_SPACE + label3.getHeight()/2;
//		
		int label3Y = rect3Y + TILE_HEIGHT/2;
		println("Width: "+label3.getWidth());
		println("Height: "+label3.getHeight());
		label3.setLocation(label3X, label3Y);
		this.getContentPane().add(label3);
		
		GLabel label4 = new GLabel(TEXT);
		int label4X = label2X;
		int label4Y = label3Y;
		println("Width: "+label4.getWidth());
		println("Height: "+label4.getHeight());
		label4.setLocation(label4X, label4Y);
		this.getContentPane().add(label4);
		
		this.revalidate();
		this.repaint();
	}
	
	
	private void println(String string) {
		System.out.println(string);
	}
}
