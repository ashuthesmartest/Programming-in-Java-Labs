package pkg5novglab;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Circle extends JPanel 
{
    // static JLabel l = new JLabel() ;
    Circle()
    {
        repaint() ;       
    } 
    
    @Override
    public void paintComponent(Graphics g)
    {
        g.drawOval(100, 100, 75, 75);
    }
    
    public class MyActionListener implements ActionListener
    {
        public MyActionListener()
        {
                
                addMouseMotionListener(new MouseAdapter() {
                        public void mouseMoved(MouseEvent e) 
                        {
                            if ((e.getX() <=175) && (e.getX() >=100))
                            {
                                 JOptionPane.showMessageDialog(null,"Mouse pointer inside the circle");
                            }
                            else
                            {
                                JOptionPane.showMessageDialog(null,"Mouse pointer not inside the circle");
                            }    
                        }
                }) ;        
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }    
    public static void main(String[] args) 
    {
        JFrame f = new JFrame() ;
        f.setVisible(true);
        f.setSize(300, 300);
        Circle c1 = new Circle() ;
        f.add(c1) ;
        f.add(c1.new MyActionListener());
    }   
}
