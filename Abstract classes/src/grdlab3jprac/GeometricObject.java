package grdlab3jprac;

/**
 *
 * @author Ashutosh
 */
abstract class GeometricObject implements Comparable
{
    protected GeometricObject()     
    {
    }
    abstract public double getArea() ;
    abstract public double getPerimeter() ;
    abstract public double costOfPaintingashape() ;
    @Override
    public int compareTo(Object o) 
    {
	 double i= this.getArea();
	 double j= ((GeometricObject)o).getArea();		 
	 if(i>j)
	  return 1;
         else if ( i<j)
	  return -1;
	 else
	  return 0;
    }
	
    public static GeometricObject max (GeometricObject o, GeometricObject o2 ) 
    {
    if(o.compareTo(o2) > 0)
	return o;
    else
	return o2;
    }
}
