/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonaccino;// use small case

/**
 *
 * @author acadmin
 */
public class fibonaccino {
    
public static void main(String[] args)
   {
       fibonacci(5);
   }
   

public static void fibonacci(int n)
   {
   
   int a = 0;
   int b = 1;
   
  do
  {
  
  int c = a+b;
  System.out.println(c + " ");
  a=b;
  b=c;
  n--;
  }while(n>2);
  
   }
}