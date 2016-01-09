package grdlab3;
/**
 *
 * @author Ashutosh
 */
public class Hexagon extends GeometricObject implements Comparable 
{
    private double hx1,hx2,hx3,hx4,hx5,hx6,hy1,hy2,hy3,hy4,hy5,hy6 , a , r ;
    private double d1,d2,d3,d4,d5,d6 ;
    public Hexagon()
    {
        
    }
    public Hexagon(Double hx1,Double hx2,Double hx3,Double hx4,Double hx5,Double hx6,Double hy1,Double hy2,Double hy3,Double hy4,Double hy5,Double hy6)
    {
        d1 = distance(hx1,hx2,hy1,hy2) ;
        d2 = distance(hx2,hx3,hy2,hy3) ;
        d3 = distance(hx3,hx4,hy3,hy4) ;
        d4 = distance(hx4,hx5,hy4,hy5) ;
        d5 = distance(hx5,hx6,hy5,hy6) ;
        d6 = distance(hx6,hx1,hy6,hy1) ;
        if(((d1==d2)&& (d2==d3)&& (d3==d4)&&(d4==d5)&&(d5==d6))||(((d1-d2)<0.01)&&((d2-d3)<0.01)&&((d3-d4)<0.01)&&((d4-d5)<0.01)&&((d5-d6)<0.01)))
        {
            this.d1 = d1 ;
            this.d2 = d2 ;
            this.d3 = d3 ;
            this.d4 = d4 ;
            this.d5 = d5 ;
            this.d6 = d6 ;
        }    
        else if((d1<=0)||(d2<=0)||(d3<=0)||(d4<=0)||(d5<=0)||(d6<=0))
        {
            throw new IllegalArgumentException("Side length should be atleast greater than 0");
        }  
        else
        {
            throw new IllegalArgumentException("Side lengths should be equal to each other");
        }    
    }
    
    public double distance(double x1, Double x2, Double y1, double y2)
    {
        return (Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2))) ;
    }        
    @Override
    public double getArea() 
    {
        r = Math.cos((Math.PI/6)) ;
        a = 2*r ;
        return ((3*(Math.sqrt(3)))/2)*(a*a) ;
    }

    @Override
    public double getPerimeter() 
    {
        return 6*d1 ;
    }

    @Override
    public double costOfPaintingashape() {
        return (this.getArea()) * 50 ;
    }

    @Override
    public int compareTo(Object o) 
    {
        if (getArea() > ((Hexagon) o).getArea())
            return 1;
        else if (getArea() < ((Hexagon) o).getArea())
            return -1;
        else
            return 0;
    }
}
