
package javalab2;

import java.util.Scanner;

public class javalab22 
{
    public static void main(String[] args)
    {
        float r=10,x,y,k,d ;
        System.out.println("Enter the value of x and y ");
        Scanner sc = new Scanner(System.in) ;
        x = sc.nextFloat() ;
        y = sc.nextFloat() ;    
        d = (x*x) + (y*y) ;
        k = (float) Math.pow(d, 0.5) ;
        if(k<r)
        {
            System.out.println("The point lies inside the circle");
        }    
        else if(k>r)
        {
            System.out.println("The point lies outside the circle");
        }      
        else
        {
            System.out.println("Bingo ! The point lies on the circle");
        }    
    }        
}
