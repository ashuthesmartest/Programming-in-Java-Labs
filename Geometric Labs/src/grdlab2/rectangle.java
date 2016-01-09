package grdlab2;
/**
 *
 * @author Ashutosh
 */
public class rectangle 
{
    private double rx1,rx2,rx3,rx4,ry1,ry2,ry3,ry4;
    public double Area = 0 ;
    rectangle()
    {
        rx1 = 0 ;
        ry1 = 0 ;
        rx2 = 1 ;
        ry2 = 0 ;
        rx3 = 1 ;
        ry1 = 1 ;
        rx4 = 0 ;
        ry4 = 1 ;
    }  
    public double getX1()
    {
        return rx1 ;
    }
    public double getX2()
    {
        return rx2 ;
    }
    public double getX3()
    {
        return rx3 ;
    }
    public double getX4()
    {
        return rx4 ;
    }
    public double getY1()
    {
        return ry1 ;
    }
    public double getY2()
    {
        return ry2 ;
    }
    public double getY3()
    {
        return ry3 ;
    }
    public double getY4()
    {
        return ry4 ;
    }
    public void setX1(double a)
    {
        this.rx1 = a ;
    }
    public void setX2(double a)
    {
        this.rx2 = a ;
    }
    public void setX3(double a)
    {
        this.rx3 = a ;
    }
    public void setX4(double a)
    {
        this.rx4 = a ;
    }
    public void setFromUser(double a, double b, double c, double d, double e, double f, double g, double h)
    {
        this.rx1 = a ;
        this.ry1 = b ;
        this.rx2 = c ;
        this.ry2 = d ;
        this.rx3 = e ;
        this.ry3 = f ;
        this.rx4 = g ;
        this.ry4 = h ;
    }
    public void getArea()
    {
        double d1 = Math.sqrt(Math.pow((this.rx2 - this.rx1),2) + Math.pow((this.ry2 - this.ry1),2)) ;
        double d2 = Math.sqrt(Math.pow((this.rx3 - this.rx2),2) + Math.pow((this.ry3 - this.ry2),2)) ;
        Area = 2*d1*d2 ;
    }        
    public boolean checkIn(double a, double b)
    {
        getArea() ;
        double a1 = (this.rx1*(b - this.ry4) + a*(this.ry4 - this.ry1) + this.rx4*(this.ry1-b))/2 ;
        double a2 = (this.rx1*(this.ry2 - b) + this.rx2*(b - this.ry1) + a*(this.ry1-this.ry2))/2 ;
        double a3 = (this.rx2*(this.ry3 - b) + this.rx3*(b - this.ry2) + b*(this.ry2-this.ry3))/2 ;
        double a4 = (this.rx3*(this.ry4 - b) + this.ry4*(b - this.ry3) + b*(this.ry3-this.ry4))/2 ;
        return((a1+a2+a3+a4) == Area) ;
    }        
}
