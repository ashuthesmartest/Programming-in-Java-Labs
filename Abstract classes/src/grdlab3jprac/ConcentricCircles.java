package grdlab3jprac;

/**
 *
 * @author Ashutosh
 */
public class ConcentricCircles extends GeometricObject implements Colorable
{
    private double r1,r2 ;
    ConcentricCircles()
    {
        r1 = 1.0 ;
        r2 = 2.0 ; 
    }
    ConcentricCircles(Double r1, Double r2)
    {
        if(r1 <= 0.0)
        {
            throw new IllegalArgumentException("Radius " + r1 + " cannot be negative");
        }    
        else
        {
            this.r1 = r1 ;
        }    
        if((r2<=0.0)||(r2<r1))
        {
            throw new IllegalArgumentException("Radius of outer circle cannot be less than inner circle");
        }
        else
        {
            this.r2 = r2 ;
        }
    }
    public void setRadius(Double r1,Double r2 )
    {
        if(r1 < 0.0)
        {
            throw new IllegalArgumentException("Radius " + r1 + " cannot be negative");
        }    
        else
        {
            this.r1 = r1 ;
        }    
        if((r2<0.0)||(r2<r1))
        {
            throw new IllegalArgumentException("Radius of outer circle cannot be less than inner circle");
        }
        else
        {
            this.r2 = r2 ;
        }
    }
    
    @Override
    public double getArea() 
    {
        return 3.14*((r2*r2)-(r1*r1)) ;
    }

    @Override
    public double getPerimeter() 
    {
        return 2*3.14*r2 ;
    }

    @Override
    public double costOfPaintingashape() 
    {
        return (this.getArea())*50 ;
    }

    @Override
    public double costToColor(double c) 
    {
        return (this.getArea())*c ;
    }

    @Override
    public void howToColor() {
        System.out.println( "Color the area between the 2 sides");
    }
    
}
