package n;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class StickmanDrawing extends JFrame {
	private static final long serialVersionUID = 1L;

	public StickmanDrawing() {
		setTitle("StickmanPainting");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,650);
		
		JPanel panel = new JPanel();
        panel.setBackground(Color.white);
        
        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                int x = e.getX(); 
                int y = e.getY(); 
                System.out.println("Mouse pressed at: (" + x + ", " + y + ")");
            }
        });
        
        
        add(panel);
        
        setVisible(true);
	}

	@Override
	public void paint(Graphics g) {
	g.drawLine(140, 180, 140, 210);
	//g.drawLine(50, 90, 30, 22);
	Graphics2D g2 = (Graphics2D)g;
	
	g2.setColor(new Color(238, 197, 145));
	g2.fillOval(100, 100, 80, 80);
	
	 int[] xPoints = {140, 82, 199}; 
     int[] yPoints = {306, 489, 489}; 
	Graphics2D g4 = (Graphics2D)g;
	g4.setColor(Color.blue);
	g4.fillPolygon(xPoints, yPoints, 3);
	
	Graphics2D g3 = (Graphics2D)g;
	g3.setColor(Color.red);
	g3.fillRect(80, 210, 120, 180);
	
	Graphics2D g5 = (Graphics2D)g;
	g5.setColor(Color.black);
	g5.drawLine(192, 220, 237, 270);
	
	Graphics2D g6 = (Graphics2D)g;
	g6.drawLine(90, 220, 30, 270);
	}

}
