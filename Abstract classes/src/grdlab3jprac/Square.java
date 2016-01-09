package grdlab3jprac;
/**
 *
 * @author Ashutosh
 */
public class Square extends GeometricObject implements Colorable
{
    public int side ;

    Square() 
    {
        side = 1 ;
    }

    @Override
    public double getArea() 
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getPerimeter() 
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double costOfPaintingashape() 
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double costToColor(double c) 
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void howToColor() 
    {
        System.out.println( "Color all four sides");
    }
    
}
