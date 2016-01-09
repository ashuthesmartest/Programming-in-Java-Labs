package SNU.geometryUtil;

import java.util.Arrays;

/**
 *
 * @author Ashutosh
 */
public class Rectangle extends GeometricObject
{
    public static int ctr ;
    private double s1,s2 ;
    public Rectangle()
    {
        ctr++ ;
        s1 = 1 ;
        s2 = 1 ;
    } 
    public void setSides(Double a,Double b)
    {
        s1 = a ;
        s2 = b ;
    }      
    public String getSides()
    {
        double[] arr = new double[3] ;
        arr[0] = s1 ; 
        arr[1] = s2 ;
        return Arrays.toString(arr) ;
    }     
    @Override
    public double getPerimeter()
    {
        return (2*(s1+s2)) ;
    }        
    @Override
    public double getArea()
    {
        return s1*s2 ;
    }
    @Override
    public double costOfPaintingashape()
    {
        return (2*(s1+s2))*50 ;
    }    
}
