/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package counter;// use small case

/**
 *
 * @author acadmin
 */
public class Counter {
    
    private static int count;
   public static void main(String[] args)
   {
       increment();
       System.out.println("Counter = " + getCount());
       decrement();
       System.out.println("Counter = " + getCount());
   }
   
   static void increment()
   {
       if(count < 100) count++;
   }
   
   static void decrement()
   {
       if(count > 0)count--;
   }
   
   static int getCount()
   {
       return count;
   }
         
}
