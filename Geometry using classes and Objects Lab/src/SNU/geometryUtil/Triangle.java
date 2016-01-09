package SNU.geometryUtil;

import java.util.Arrays;

/**
 *
 * @author Ashutosh
 */
public class Triangle extends GeometricObject
{
    public static int ctr ;
    private double s1,s2,s3,s ;
    public Triangle()
    {
        ctr++ ;
        s1 = 1 ;
        s2 = 1 ;
        s3 = 1 ;
    } 
    public void setSides(Double a,Double b, Double c)
    {
        s1 = a ;
        s2 = b ;
        s3 = c ;
    }      
    public String getSides()
    {
        double[] arr = new double[3] ;
        arr[0] = s1 ; 
        arr[1] = s2 ;
        arr[1] = s3 ;
        return Arrays.toString(arr) ;
    }     
    @Override
    public double getPerimeter()
    {
        return (s1+s2+s3) ;
    }        
    @Override
    public double getArea()
    {
        s = (s1+s2+s3)/2 ;
        return Math.sqrt(s*(s-s1)*(s-s2)*(s-s3)) ;
    }    
    @Override
    public double costOfPaintingashape()
    {
        return (s1+s2+s3)*50 ;
    }    
}
