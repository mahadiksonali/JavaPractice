
package javaapplication1;
import javax.swing.*;

public class JavaApplication1 {
     static private int balance;
    static private int[]  lt = new int[10];
    static int count;
   public static void main(String[] args)
   {
        boolean flag = true;
        String ch = "Q";
         while (flag) {
            ch = read(
                  " Welcome to PiggyBank With Transaction\n"
                  + " D - Deposit" + "\n"
                  + " W - Withdraw" + "\n"
                  + " S - Statement" + "\n"
                  + " Q - Quit" + "\n"
            );
   }
         switch(ch)
         {
             case "d" :
             case "D" :  
                 break;
                 
             case "q" :
             case "Q" :
                 JOptionPane.showMessageDialog(null,"Thank you for using piggy bank");
                 flag = false;
                 break;
         }
   }
   
         static String read(String s)
         {
             String r = JOptionPane.showInputDialog(s);
         return (r == null ) ? "Q" : r;
         }

}
   



