package SNU.geometryUtil;

import java.util.Arrays;

/**
 *
 * @author Ashutosh
 */
public class Square extends GeometricObject
{
    public static int ctr ;
    private double s ;
    public Square()
    {
        ctr++ ;
        s = 1 ;
    } 
    public void setSides(Double a)
    {
        s = a ;
    }      
    public double getSides()
    {
        return s ;
    }     
    @Override
    public double getPerimeter()
    {
        return (4*s) ;
    }        
    @Override
    public double getArea()
    {
        return s*s ;
    }
    @Override
    public double costOfPaintingashape()
    {
        return (4*s)*50 ;
    }    
}
