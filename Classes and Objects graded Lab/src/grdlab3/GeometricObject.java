package grdlab3;

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
    public boolean equals(Object o) 
    {
	 double i= this.getArea();
	 double j= ((GeometricObject)o).getArea();		 
	 if(i==j)
	  return true ;
         else 
	  return false ;
    }

}
