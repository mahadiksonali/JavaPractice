/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FirstPackage;

/**
 *
 * @author acadmin
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
/**
     * @param args the command line arguments
     */
    static int balance;
    static int lt;
    public static void main(String[] args) {
    
    System.out.println("Welcome to pipggyBank...");
    statements();
    balance=3;
    lt=5;
    statements();
deposit(33);    
withdraw(5);
// TODO code application logic here
    }
    
    static void statements()
    {
    System.out.println("Piggy Bank Statement");
    System.out.println("Balance= "+balance);
    System.out.println("Last transaction= "+lt);
    }
    
static void deposit(int v)
    {
        balance=balance+v;
        lt=v;
    System.out.println("Piggy Bank Statement");
    System.out.println("Balance= "+balance);
    System.out.println("Last transaction= "+lt);
    }    
   static void withdraw(int v)
{
if(balance>=v)
{balance=balance-v;
        lt=-v;
}
        System.out.println("Piggy Bank Statement");
    System.out.println("Balance= "+balance);
    System.out.println("Last transaction= "+lt);
} 
}

