package SNU.geometryUtil;

/**
 *
 * @author Ashutosh
 */
public class circle extends GeometricObject  
{
    public static int ctr = 0 ;
    private double radius ;    
    public circle()
    {
        radius = 1.0 ;
    }  
    public void setRadius(Double r)
    {
        if(radius < 0.0)
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

}
