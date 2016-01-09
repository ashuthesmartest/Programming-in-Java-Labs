package grdlab3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ashutosh
 */
public class Grdlab3 implements Comparable
{
    static int ind = 0 ;
    static GeometricObject[] geo = new GeometricObject[10] ;
    public static GeometricObject max (ArrayList al) 
    {
        Object o = null ; ;
        for(int i=0; i<al.size() ; i++)
            {
                geo[i] = (GeometricObject)al.get(i) ;
            }
        for(int i=0 ; i<ind+1 ; i++ )
        {
            if(geo[i].getArea() > geo[i+1].getArea())
            {
                o = geo[i] ;
            }    
        }
        return (GeometricObject)o ;
    }
    
    public static void main(String[] args) 
    {
        int ch ;
        Scanner sc = new Scanner(System.in) ;
        ArrayList ar = new ArrayList() ;
        do
        {    
            System.out.println("Choose Rectangle or Hexagon") ;
            int n1 = sc.nextInt() ;
            switch(n1) 
            {
                case 1 : System.out.println("Enter the sides of the Rectangle");
                         double s1 = sc.nextDouble() ;
                         double s2 = sc.nextDouble() ;
                         Rectangle r = new Rectangle(s1,s2) ;
                         ar.add(ind, r) ;
                         ind++ ;
                         break ;
                case 2 : System.out.println("Enter the coordinates for the 1st side");
                         double hx1 = sc.nextDouble() ;
                         double hy1 = sc.nextDouble() ;
                         System.out.println("Enter the coordinates for the 2nd side");
                         double hx2 = sc.nextDouble() ;
                         double hy2 = sc.nextDouble() ;
                         System.out.println("Enter the coordinates for the 3rd side");
                         double hx3 = sc.nextDouble() ;
                         double hy3 = sc.nextDouble() ;
                         System.out.println("Enter the coordinates for the 4th side");
                         double hx4 = sc.nextDouble() ;
                         double hy4 = sc.nextDouble() ;
                         System.out.println("Enter the coordinates for the 5th side");
                         double hx5 = sc.nextDouble() ;
                         double hy5 = sc.nextDouble() ;
                         System.out.println("Enter the coordinates for the 6th side");
                         double hx6 = sc.nextDouble() ;
                         double hy6 = sc.nextDouble() ;
                         Hexagon h = new Hexagon(hx1,hx2,hx3,hx4,hx5,hx6,hy1,hy2,hy3,hy4,hy5,hy6); 
                         ar.add(ind, h) ;
                         ind++ ;
                default: System.out.println("Invalid Choice") ;
                         break ;
            }  
            System.out.println("Do you want to continue (0/1)");
            ch = sc.nextInt() ;
        }while(ch == 1) ;
       /* System.out.println("Choose 1 for comparing 2 objects or 2 for finding the max");
        int n2 = sc.nextInt() ;
        switch(n2)
        {
            case 1: System.out.println("Enter the objects to be compared") ;
                    int x = sc.nextInt() ;
                    int y = sc.nextInt() ;
                    compareTo(ar.get(y-1)) ;
        }  */  
        max(ar) ;
    }

    @Override
    public int compareTo(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}    
