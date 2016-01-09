import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;
public class chkin extends JFrame
{
    chkin.canvas panel = new chkin.canvas();
    public chkin()
    {
        add(panel);
    }
    static class canvas extends JPanel
    {
        boolean isInside = false;
        Point mousePoint = new Point(0, 0);         
        public canvas()
        {
            this.addMouseMotionListener(new MouseAdapter()
            {
                @Override
                public void mouseMoved(MouseEvent e)
                {
                    if(Math.hypot(e.getX() - 110, e.getY()-160) < 50)
                        isInside = true;
                    else
                        isInside = false;
                    mousePoint.x = e.getX();
                    mousePoint.y = e.getY();
                    repaint();
                }
            });
        }
        @Override
        public void paintComponent(Graphics g)
        {
            super.paintComponent(g);
            g.drawRect(10,60,100,50);
            g.drawString(isInside ?"Mouse point is in the rectangle":
                    "Mouse point is not in the rectangle",mousePoint.x, mousePoint.y);
        }
    }
    public static void main(String[] args)
    {
        JFrame frame = new chkin();
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
