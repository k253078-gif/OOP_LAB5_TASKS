package TASK5;

class Account {

    int accountNumber;
    double balance;

    static int totalAccounts = 0;
    static double totalBankBalance = 0;

    Account(int accountNumber, double balance){

        this.accountNumber = accountNumber;
        this.balance = balance;

        totalAccounts++;
        totalBankBalance += balance;
    }

    static void displaySummary(){

        System.out.println("Total Accounts: " + totalAccounts);
        System.out.println("Total Bank Balance: " + totalBankBalance);
    }
}