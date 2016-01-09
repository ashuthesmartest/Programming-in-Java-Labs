package grdlab2;
/**
 *
 * @author Ashutosh
 */
public class triangle 
{
    private double tx1,tx2,tx3,ty1,ty2,ty3 ;
    public double Area = 0 ;
    triangle()
    {
        tx1 = 0 ;
        tx2 = 1 ;
        tx3 = 0.5 ;
        ty1 = 0 ;
        ty2 = 0 ;
        ty3 = 0.5 ;
    }        
    public double getX1()
    {
        return tx1 ;
    }
    public double getX2()
    {
        return tx2 ;
    }
    public double getX3()
    {
        return tx3 ;
    }
    public double getY1()
    {
        return ty1 ;
    }
    public double getY2()
    {
        return ty2 ;
    }
    public double getY3()
    {
        return ty3 ;
    }
    public void setFromUser(double a, double b, double c, double d, double e, double f)
    {
        this.tx1 = a ;
        this.ty1 = b ;
        this.tx2 = c ;
        this.ty2 = d ;
        this.tx3 = e ;
        this.ty3 = f ;
    }
    public void getArea()
    {
        Area = (this.tx1*(this.ty2 - this.ty3) + this.tx2*(this.ty3 - this.ty1) + this.tx3*(this.ty1-this.ty2))/2 ;
    }
    public boolean checkIn(double a, double b)
    {
        getArea() ;
        double a1 = (this.tx1*(this.ty2 - b) + this.tx2*(b - this.ty1) + a*(this.ty1-this.ty2))/2 ;
        double a2 = (this.tx2*(this.ty3 - b) + this.tx3*(b - this.ty2) + a*(this.ty2-this.ty3))/2 ;
        double a3 = (this.tx3*(this.ty1 - b) + this.tx1*(b - this.ty3) + a*(this.ty3-this.ty1))/2 ;
        return((a1+a2+a3) == Area) ;
    }
}
