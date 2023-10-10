import java.util.Scanner;

class BankAccount 
{
    private double balance; 

    public BankAccount(double initialBalance) 
    {
        balance = initialBalance; 
    }

    public double getBalance() 
    {
        return balance; 
    }

    public void deposit(double amount) 
    {
        if (amount > 0) 
        {
            balance = balance + amount; 
            System.out.println("Deposit successful. New balance: $" + balance);
        } 
        else 
        {
            System.out.println("Invalid deposit amount.");
        }
    }

    public boolean withdraw(double amount) 
    {
        if (amount > 0 && amount <= balance) 
        {
            balance -= amount; 
            System.out.println("Withdrawal successful. New balance: $" + balance);
            return true;
        } 
        else 
        {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
            return false;
        }
    }
}

public class ATM 
{
    private BankAccount account; 

    public ATM(BankAccount account) 
    {
        this.account = account; 
    }

    public void displayMenu() 
    {
        System.out.println("Welcome to the ATM!");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
    }

    public void run() 
    {
        Scanner sc = new Scanner(System.in);

        while (true) 
        {
            displayMenu();
            System.out.print("Please select an option: ");
            int choice = sc.nextInt();

            switch (choice) 
            {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public void checkBalance() 
    {
        System.out.println("Your balance is: $" + account.getBalance());
    }

    public void deposit() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount to deposit: $");
        double amount = sc.nextDouble();
        account.deposit(amount);
    }

    public void withdraw() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount to withdraw: $");
        double amount = sc.nextDouble();
        account.withdraw(amount);
    }

    public static void main(String[] args) 
    {
        BankAccount userAccount = new BankAccount(1000.0); 
        ATM atm = new ATM(userAccount); 
        atm.run(); 
    }
}
