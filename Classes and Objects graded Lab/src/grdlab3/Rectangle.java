package grdlab3;

import java.util.Arrays;

/**
 *
 * @author Ashutosh
 */
public class Rectangle extends GeometricObject implements Comparable
{
    private double s1,s2 ;
    public Rectangle()
    {
        s1 = 1 ;
        s2 = 1 ;
    } 
    public Rectangle(Double a,Double b)
    {
        if(a<=0 || b<=0)
        {
            throw new IllegalArgumentException("Side length should be greater than 0");
        }   
        else
        {
            s1 = a ;
            s2 = b ;
        } 
    }
    public void setSides(Double a,Double b)
    {
        if(a<=0 || b<=0)
        {
            throw new IllegalArgumentException("Side length should be greater than 0");
        }   
        else
        {
            s1 = a ;
            s2 = b ;
        }    
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

    @Override
    public int compareTo(Object o) 
    {
        if (getArea() > ((Rectangle) o).getArea())
            return 1;
        else if (getArea() < ((Rectangle) o).getArea())
            return -1;
        else
            return 0;
    }

}

