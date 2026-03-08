package TASK5;

import java.util.Scanner;

public class Bank {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of accounts: ");
        int n = sc.nextInt();

        Account[] accounts = new Account[n];

        for(int i=0;i<n;i++){

            System.out.print("Enter account number: ");
            int accNo = sc.nextInt();

            System.out.print("Enter balance: ");
            double bal = sc.nextDouble();

            accounts[i] = new Account(accNo, bal);
        }

        Account.displaySummary();
    }
}