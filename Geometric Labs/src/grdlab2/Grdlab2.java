package grdlab2;
import java.util.Scanner;

/**
 *
 * @author Ashutosh
 */
public class Grdlab2 
{
    public static void main(String[] args) 
    {
        boolean cont = true ;
        Scanner sc = new Scanner(System.in) ;
        point p = new point() ;
        rectangle r = new rectangle() ;
        triangle t = new triangle() ;
        while(cont)
        {
           System.out.println("Checking a given point is in a triangle or a rectangle. Continue 1/0");
           int choice = sc.nextInt() ;
           if(choice == 1)
           {
               System.out.println("Enter x coordinate of point ");
               double x = sc.nextDouble() ;
               System.out.println("Enter y coordinate of point ");
               double y = sc.nextDouble() ;
               p.setFromUser(x, y);               
           } 
           else
           {
               System.exit(0);
           }
           System.out.println("Press 1 for Rectangle or 2 for Triangle");
           int choice1 = sc.nextInt() ;
           if(choice1 == 1)
           {
               System.out.println("Enter x coordinate of point 1 ");
               double rx1 = sc.nextDouble() ;
               System.out.println("Enter y coordinate of point 1 ");
               double ry1 = sc.nextDouble() ;
               System.out.println("Enter x coordinate of point 2 ");
               double rx2 = sc.nextDouble() ;
               System.out.println("Enter y coordinate of point 2 ");
               double ry2 = sc.nextDouble() ;
               System.out.println("Enter x coordinate of point 3 ");
               double rx3 = sc.nextDouble() ;
               System.out.println("Enter y coordinate of point 3 ");
               double ry3 = sc.nextDouble() ;
               System.out.println("Enter x coordinate of point 4 ");
               double rx4 = sc.nextDouble() ;
               System.out.println("Enter y coordinate of point 4 ");
               double ry4 = sc.nextDouble() ;
               r.setFromUser(rx1, ry1, rx2, ry2, rx3, ry3, rx4, ry4);
               double l = p.getX() ;
               double m = p.getY() ;
               System.out.println(r.checkIn(l, m)); 
               
           }  
           else if(choice1 == 2)
           {
               System.out.println("Enter x coordinate of point 1 ");
               double tx1 = sc.nextDouble() ;
               System.out.println("Enter y coordinate of point 1 ");
               double ty1 = sc.nextDouble() ;
               System.out.println("Enter x coordinate of point 2 ");
               double tx2 = sc.nextDouble() ;
               System.out.println("Enter y coordinate of point 2 ");
               double ty2 = sc.nextDouble() ;
               System.out.println("Enter x coordinate of point 3 ");
               double tx3 = sc.nextDouble() ;
               System.out.println("Enter y coordinate of point 3 ");
               double ty3 = sc.nextDouble() ;
               t.setFromUser(tx1, ty1, tx2, ty2, tx3, ty3);
               double l = p.getX() ;
               double m = p.getY() ;
               System.out.println(t.checkIn(l, m)); 

           }  
           else
           {
              break ;
           }    
        }    
    }
    
}
