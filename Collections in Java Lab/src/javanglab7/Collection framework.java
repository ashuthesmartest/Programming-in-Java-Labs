package javanglab7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Iterator;
import java.util.Stack;

/**
 *
 * @author Ashutosh
 */
public class Javanglab7 
{
    public static void main(String[] args) throws IOException 
    {
        int i = 0,j=0 ;
        String input ;
        BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter a paragraph.") ;
        StringBuilder paragraph = new StringBuilder("");
        while (!((input = buffer.readLine())).equals(""))
        {
            paragraph.append(input);
            paragraph.append(" ");
        }
        Stack s = new Stack() ;
        while( i != paragraph.length())
        {
            char c = paragraph.charAt(i) ;
            s.push(c) ;
            i++ ;
        }
        System.out.print("The stack is:\n"+ s);
        System.out.println() ;
        System.out.print("a occurs ");
        System.out.println(Collections.frequency(s, 'a')); 
        System.out.print("e occurs ");
        System.out.println(Collections.frequency(s, 'e'));
        System.out.print("i occurs ");
        System.out.println(Collections.frequency(s, 'i'));
        System.out.print("o occurs ");
        System.out.println(Collections.frequency(s, 'o'));
        System.out.print("u occurs ");
        System.out.println(Collections.frequency(s, 'u'));
        String str = paragraph.toString() ;
        String k = str.replaceAll("the", "THE") ;
        Stack m = new Stack() ;
        while( j != k.length())
        {
            char c = k.charAt(j) ;
            m.push(c) ;
            j++ ;
        }
        System.out.println(m);
    }
    
}
