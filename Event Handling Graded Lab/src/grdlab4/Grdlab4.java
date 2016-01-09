
package Grdlab4;
 
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
 
public class Grdlab4 extends JFrame implements KeyListener
{
    public int angle=0;
    Grdlab4()
    {
        setSize(600,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
    }
    
    @Override
    public void keyPressed(KeyEvent evt
    ){
     }
    @Override
    public void keyReleased(KeyEvent evt)
    {                                                                           
        if(evt.getKeyCode()==KeyEvent.VK_LEFT)
        {
            angle+=20;
            repaint();
        }
        if(evt.getKeyCode()==KeyEvent.VK_RIGHT)
        {
            angle-=20;
            repaint();
        }
    }
   
    @Override
    public void keyTyped(KeyEvent evt) 
    {
       
    }
   
    @Override
    public void paint(Graphics g)
    {
       super.paint(g);
       g.drawOval(200, 200, 200, 200);
       g.fillArc(210, 210, 180, 180,angle, 45);
       g.fillArc(210, 210, 180, 180, angle+90, 45);
       g.fillArc(210, 210, 180, 180, angle+180, 45);
       g.fillArc(210, 210, 180, 180, angle+270, 45);
    }
   
    public static void main(String[] args) 
    {
        new Grdlab4();
    }
}