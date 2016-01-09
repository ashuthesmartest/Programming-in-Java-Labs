package javalab2;

import java.util.Scanner;

public class Javalab21 {
    
    public static void main(String[] args) 
    {
        float a,b,c,r1,r2,D,x ;
        System.out.println("Please enter the value of a,b and c");
        Scanner sc = new Scanner(System.in) ;
        a = sc.nextFloat() ;
        b = sc.nextFloat() ;
        c = sc.nextFloat() ;
        x = ((b*b) - (4*a*c)) ;
        D = (float) Math.pow(x, 0.5) ;
        if(x<0)
        {
            System.out.println("No real root exists for a,b and c you entered");
        }    
        else if(x == 0)
        {
            System.out.println("1 real root exists ! Calculating...");
            r1 = ((-b) + (D))/(2*a) ;
            System.out.println("Real root = " + r1) ;
        }    
        else
        {
            System.out.println("2 real roots exists ! Calculating...");
            r1 = ((-b) + (D))/(2*a) ;
            r2 = ((-b) - (D))/(2*a) ;
            System.out.println("Real roots =  " + r1 +", "+ r2) ;
        }    
    }
    
}
