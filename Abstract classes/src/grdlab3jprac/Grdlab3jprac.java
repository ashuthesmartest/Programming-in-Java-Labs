package grdlab3jprac;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Ashutosh
 */
public class Grdlab3jprac 
{
    public  static void ComprehensiveCost(ArrayList a, int position)
    {
        if(position==-1)
        {
            for(int i=0; i<a.size() ; i++)
            {
                Colorable colorable = (Colorable) a.get(i);
                System.out.println("cost of "+(i+1)+" is "+colorable.costToColor(50));
            }
        }    
        else 
        {
            Colorable colorable = (Colorable) a.get(position);
            System.out.println("cost of "+ (position+1)+" is " + colorable.costToColor(50));  
        } 
    }    
    public static void main(String[] args) 
    {
        int ind = 0, ch ;
        Scanner sc = new Scanner(System.in) ;
        ArrayList ar = new ArrayList() ;
        do
        {    
            System.out.println("Choose Circle or Concentric circle or Square") ;
            int n1 = sc.nextInt() ;
            switch(n1) 
            {
                case 1 : System.out.println("Enter the radius of the circle");
                         double r1 = sc.nextDouble() ;
                         circle c = new circle(r1) ;
                         ar.add(ind, c) ;
                         ind++ ;
                         c.howToColor();
                         break ;
                case 2 : System.out.println("Enter the inner radius of the Concentric circle");
                         double r1a = sc.nextDouble() ;
                         System.out.println("Enter the outer radius of the Concentric circle");
                         double r1b = sc.nextDouble() ;
                         ConcentricCircles c1 = new ConcentricCircles(r1a,r1b); 
                         ar.add(ind, c1) ;
                         ind++ ;
                         c1.howToColor(); 
                         break ; 
                case 3 : Square s = new Square() ;
                         ar.add(ind, s) ;
                         ind++ ;
                         s.howToColor();
                         break ;    
                default: System.out.println("Invalid Choice") ;
                         break ;
            }  
            System.out.println("Do you want to continue (0/1)");
            ch = sc.nextInt() ;
        }while(ch == 1) ;  
        System.out.println("enter the position");
        int n = sc.nextInt() ;
        ComprehensiveCost(ar,n-1);

    }
}
