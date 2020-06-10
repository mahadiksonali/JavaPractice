/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package valueTypeAndReferenceType;// use small case

/**
 *
 * @author acadmin
 */
public class valueTypeAndReferenceType {


    public static void main(String[] args) {
        
        /* value type */
        
        int i = 1;
        int j = 2;
        
        System.out.println(" i = " + i);
        System.out.println(" j = " + j); 
       
        j = i;
        
        System.out.println(" i = " + i);
        System.out.println(" j = " + j);
        
        i = 9;
        
        System.out.println(" i = " + i);
        System.out.println(" j = " + j);
        
        /* reference type */
        
        String str1 = "Hello";
        String str2 = "bye";
        
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
        
        str2 = str1;
        
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
        
        str1 = "ok";
        
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);

    }
    
}
