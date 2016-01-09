
package javalab2;

import java.util.Scanner;

public class javalab23 {
    public static void main(String[] args)
    {
        int b=10000,k,l,k1,k2,l1,l2 ;
        double r ;
        r = Math.random() ;
        k = (int) (r * 100) ;
        k1 = (k/10) % 10 ;
        k2 = k % 10 ;
        while(b>0)
        {    
        System.out.println("Choose a lucky number ! ");
        Scanner sc = new Scanner(System.in) ;
        l = sc.nextInt();
        l1 = (l/10) % 10 ;
        l2 = l % 10 ;
        System.out.println("The lucky number was"+k);        
        if(k == l)
        {
            b=b-2000 ;
            System.out.println("Balance="+b);
            System.out.println("Congratulations ! You have won $10000 !");
            b = b*10000 ;
        }    
        else if((k1==l1)&&(k2==l2))
        {
            System.out.println("Balance="+b);
            b=b-2000 ;
            System.out.println("Congratulations ! You have won $3000 !");
            b = b*3000 ;
        }    
        else if((k1==l1)||(k2==l1)||(l2==k2)||(l2==k1))
        {
            System.out.println("Balance="+b);
            b = b-1000 ;
            System.out.println("Congratulations ! You have won $1000 !");
            b = b*1000 ;
        }    
        else
        {
            b = b-2000 ;
            System.out.println("Balance="+b);
            System.out.println("Sorry ! You couldn't win any prize. Better luck next time.");
        }  
        }
    }
}
