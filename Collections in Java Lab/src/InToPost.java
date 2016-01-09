import java.io.IOException;
import java.util.Stack;
import javax.swing.JOptionPane;

public class InToPost 
{
   private Stack s;
   private String s1;
   private String s2 = "";
   public InToPost(String in) 
   {
      s1 = in;
      int size = s1.length();
      s = new Stack();
   }
   public String oper() 
   {
      for (int j = 0; j < s1.length(); j++) {
         char ch = s1.charAt(j);
         switch (ch) {
            case '+': 
            case '-':
            gotOper(ch, 1); 
            break; 
            case '*': 
            case '/':
            gotOper(ch, 2); 
            break; 
            case '(': 
            s.push(ch);
            break;
            case ')': 
            gotParen(ch); 
            break;
            default: 
            s2 = s2 + ch; 
            break;
         }
      }
      while (!s.isEmpty()) {
         s2 = s2 + s.pop();
      }
      System.out.println(s2);
      return s2; 
   }
   public void gotOper(char opThis, int prec1) {
      while (!s.isEmpty()) {
         char opTop = (char) s.pop();
         if (opTop == '(') {
            s.push(opTop);
            break;
         }
         else {
            int prec2;
            if (opTop == '+' || opTop == '-')
            prec2 = 1;
            else
            prec2 = 2;
            if (prec2 < prec1) { 
               s.push(opTop);
               break;
            }
		    else
            s2 = s2 + opTop;
         }
      }
      s.push(opThis);
   }
   public void gotParen(char ch){ 
      while (!s.isEmpty()) {
         char chx = (char) s.pop();
         if (chx == '(') 
         break; 
         else
         s2 = s2 + chx; 
      }
   }
   public static void main(String[] args) 
   throws IOException {
      String s1 = JOptionPane.showInputDialog(null, "Enter s1 string");
      String s2;
      InToPost rex = new InToPost(s1);
      s2 = rex.oper(); 
      JOptionPane.showMessageDialog(null,"Postfix is " + s2);
   }
}