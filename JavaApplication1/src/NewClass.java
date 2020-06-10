/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acadmin
 */
public class NewClass {
    /**
     * @param args the command line arguments
     */
    static int balance;
    static int lt;
    public static void main(String[] args) {
    
    System.out.println("Welcome to pipggyBank...");
    //statements();
    balance=3;
    lt=5;
    //statements();
    // TODO code application logic here
    }
    
    static void statements()
    {
    System.out.println("Piggy Bank Statement");
    System.out.println("Balance"+balance);
    System.out.println("Last transaction"+lt);
    }
    
}
