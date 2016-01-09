package runmethod;
import SNU.geometryUtil.GeometricObject;
import SNU.geometryUtil.Rectangle;
import SNU.geometryUtil.Square;
import SNU.geometryUtil.Triangle;
import SNU.geometryUtil.circle;
import java.util.Scanner;
/**
 *
 * @author Ashutosh
 */
public class mainclass 
{
    public static void main(String[] args) 
    {   
        int ch,ch1,i=0,ctr=1 ;
        double rad ;
        GeometricObject[] geo = new GeometricObject[10] ;
        System.out.println("Hi there! Please choose one of the following: ");
        System.out.println("1.Circle");
        System.out.println("2.Triangle");
        System.out.println("3.Square");
        System.out.println("4.Rectangle");
        Scanner sc = new Scanner(System.in) ;
        ch = sc.nextInt() ;
        do
        {    
            switch(ch)
            {
                case 1 : circle c = new circle() ;
                         System.out.println("Enter the radius of the circle");
                         rad = sc.nextDouble() ;
                         c.setRadius(rad);
                         geo[i].getArea() ;
                case 2 : Triangle t = new Triangle() ;
                         System.out.println("Enter the three sides of the triangle");
                         double s1 = sc.nextDouble() ;
                         double s2 = sc.nextDouble() ;
                         double s3 = sc.nextDouble() ;
                         t.setSides(s1, s2, s3);
                         geo[i].getArea() ;
                case 3 : Square s = new Square() ;
                         System.out.println("Enter the side of the square");
                         double s4 = sc.nextDouble() ;
                         s.setSides(s4) ;
                         geo[i].getArea() ;
                case 4 : Rectangle r = new Rectangle() ;
                         System.out.println("Enter the two sides of the rectangle");
                         double s5 = sc.nextDouble() ;
                         double s6 = sc.nextDouble() ;
                         r.setSides(s5, s6);
                         geo[i].getArea() ;    
            }
            i++ ;
            ctr++ ;
            System.out.println("Do you want to continue(1/0)");
            ch1 = sc.nextInt() ;
        }while(ctr<=10 || ch1 != 0);
}
}    