/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculator; // use small case

import javax.swing.*;

/**
 *
 * @author acadmin
 */
public class Calculator {
    
    public static void main(String[] args)
   {
  
  String number1 = JOptionPane.showInputDialog("Enter Number1");
  String number2 = JOptionPane.showInputDialog("Enter Number2");
  String Operation = JOptionPane.showInputDialog("Enter 1 for addition \n"+"Enter 2 for substraction\n"+"Enter 3 for multiplication\n"+"Enter 4 for division\n");
  
  int num1= Integer.parseInt(number1);
  int num2=Integer.parseInt(number2);
  int op =  Integer.parseInt(Operation);
  int result=0;
  
  switch(op)
    {
        case 1:result = num1 + num2; break;
        case 2:result = num1 - num2;break;
        case 3:result = num1 * num2; break;
        case 4:result = num1 / num2; break;
    }
  
  JOptionPane.showMessageDialog(null,"Result =" + result);
  
   }
    
}
