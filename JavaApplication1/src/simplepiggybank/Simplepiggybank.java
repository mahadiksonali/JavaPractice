/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplepiggybank;

/**
 *
 * @author acadmin
 */
public class Simplepiggybank {
     static int balance;

    static int lt;



    public static void main(String[] args) {

        System.out.println("Welcome to Procedural PiggyBank");

        deposit(100);

        deposit(200);

        statement();

        withdraw(50);

        statement();

    }



    static void deposit(int v) {

        balance = balance + v;

        lt = v;

    }



    static void withdraw(int v) {

        if (balance >= v) {

            balance = balance - v;

            lt = -v;

        }



    }



    static void statement() {

        System.out.println("Balance = " + balance);

        System.out.println("Last Transaction = " + lt);

    }
}
