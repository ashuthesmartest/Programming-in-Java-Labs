package grdlab2;
/**
 *
 * @author Ashutosh
 */
public class point 
{
    private double x , y ;
    point()
    {
        x = y = 0 ;
    }        
    public double getX()
    {
        return x ;
    }
    public double getY()
    {
        return y ;
    }
    public void setFromUser(double a, double b)
    {
        this.x = a ;
        this.y = b ;
    }        
}
