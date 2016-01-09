package Jng3;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;

public class coin extends JFrame
{
    coin()
    {
        setLayout(new GridLayout(3,3)) ;
        for(int i = 0 ; i< 9 ; i++)
        {
            cell ce = new cell("H") ;
            add(ce) ;
            ce.setBorder(new LineBorder(Color.black,1));
            ce.setFont(new Font("TimeRoman",Font.BOLD,24));
            ce.setHorizontalAlignment(JLabel.CENTER);
        }    
    }        
    public static void main(String[] args)
    {
        coin c = new coin() ;
        c.setLocationRelativeTo(null);
        c.setSize(250,250);
        c.setVisible(true);
    }        
}

class cell extends JLabel
{
    cell(String str)
    {
        super(str) ;
        addMouseListener(new MouseAdapter() 
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                if(getText().equals("H"))
                {
                     if(Math.random() < 0.50)
                     {
                         setText("T") ;
                     }    
		}
                     else
                     {
                        setText("H");
                     }   
            }        
        }) ;
    }
}    