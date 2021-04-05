package atm;

import java.util.Scanner;

public class Account {
    // method for account balance
    public void Balance(double balance)
    {
        System.out.println("Your Account Balance : " + balance);
        System.out.println();
    }
    // method that withdraw a valid amount to the balance
    public void Withdrawal(double balance, double AmountWithdrawal)
    {
        System.out.println("Withdraw.....");
        System.out.println("How much do you wish to withdraw? : " +  AmountWithdrawal);

        if (balance >= AmountWithdrawal)
        {
            balance = balance - AmountWithdrawal;
            System.out.println("Withdrawing your money... \nPlease be patience ...");
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thank you for using this service.");
            System.out.println("Please collect your Card and Money.");
            Balance(balance);
        } else{
            System.out.println("Processing...");
            System.out.println("Insufficient Funds...\n Please Deposit some money and try again");
            System.out.println("Thank you for using this service.");
            System.out.println("Please collect your Card.");
        }
    }
    //method that deposits a valid amount to the balance
    public void Deposit(double balance, double AmountDeposit)
    {
        System.out.println("Deposit...");
        System.out.println("How much do you wish to deposit? : " +  AmountDeposit);
        balance = balance + AmountDeposit;
        System.out.println("Depositing your money... \nPlease be patience ...");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Your deposit was Successful.");
        Balance(balance);
    }

    /**MAIN CLASS where methods are called**/
    public static void main(String[] args) {
        //Declaration and Assignment
	Scanner input = new Scanner(System.in);
    Account obj = new Account();
    double balance = 5000.0;
    double withdraw = 2045.0;
    double deposit = 4032.3;

        System.out.println("ATM Machine..." + "\n");
        System.out.println("Your Current Balance: " + balance + "\n");
        System.out.println("Select Option 1 for Withdrawal");
        System.out.println("Select Option 2 for Deposit");
        System.out.println("Select Option 3 for Check Account Balance");
        System.out.println("Select Option 4 for Exit");
        int num = input.nextInt();

        switch (num) {
            case 1 -> obj.Withdrawal(balance, withdraw);
            case 2 -> obj.Deposit(balance, deposit);
            case 3 -> obj.Balance(balance);
            case 4 -> {
                System.out.println("Thank you for using this service");
                System.exit(0);
            }
        }
    
    }

}
