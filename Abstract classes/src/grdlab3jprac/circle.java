package grdlab3jprac;
/**
 *
 * @author Ashutosh
 */
public class circle extends GeometricObject implements Colorable 
{
    public static int ctr = 0 ;
    private double radius ;    
    public circle()
    {
        radius = 1.0 ;
    }  
    public circle(Double r)
    {
        if(r <= 0.0)
        {
            throw new IllegalArgumentException("Radius " + radius + " cannot be negative");
        }    
        else
        radius = r;
    }
    public void setRadius(Double r)
    {
        if(r <= 0.0)
        {
            throw new IllegalArgumentException("Radius " + radius + " cannot be negative");
        }    
        else
        radius = r ;
    }     
    public double getRadius()
    {
        return radius ;
    } 
    public double getDiameter()
    {
        return 2*radius ;
    }    
    @Override
    public double getPerimeter()
    {
        return 2*3.14*radius ;
    }    
    @Override
    public double getArea()
    {
        return 3.14*radius*radius ;
    }    
    @Override
    public double costOfPaintingashape()
    {
        return 2*3.14*radius*50 ;
    }        

    @Override
    public double costToColor(double c) 
    {
        return 2*3.14*radius*c ;
    }

    @Override
    public void howToColor() {
        System.out.println( "Color the entire circle");
    }
}

