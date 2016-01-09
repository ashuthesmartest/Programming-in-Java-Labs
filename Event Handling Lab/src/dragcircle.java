import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class dragcircle extends JFrame
{	
	public static void main(String[] args) 
        {
	    dragcircle frame = new dragcircle();
	    frame.setSize(300, 150);
	    frame.setLocationRelativeTo(null); // Center the frame
	    frame.setVisible(true);
	}
	
        public dragcircle() 
        {
		add(new MovingCircle());
	}
	
	class MovingCircle extends JPanel 
        {	
		  private int x = 20;
		  private int y = 20;
		  public  int RADIUS = 10;

		  public MovingCircle() 
                  {    
		    this.addMouseMotionListener(new MouseAdapter() 
                    {
                      @Override
		      public void mouseDragged(MouseEvent evt) { 
		        if (isinside(evt.getX(), evt.getY(),x,y)) {
		          x = evt.getX();
		          y = evt.getY();
		          repaint();
		        }
		      }
		    });
		  }
                  
		  public boolean isinside(double x1,double y1,double x2,double y2)
                  {
			  return Math.sqrt((x2-x2)*(x2-x1)+(y2-y1)*(y2-y1)) < RADIUS;
		  }

		

                  @Override
		  public void paintComponent(Graphics g) 
                  {
		    super.paintComponent(g);
		    g.drawOval(x - RADIUS, y - RADIUS, 2 * RADIUS, 2 * RADIUS);
		  }
		}


}
