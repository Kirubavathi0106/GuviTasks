package Task2;

	import java.util.Scanner;

	public class Account {
	    private double balance;
	    private int accountNumber;

	    // No-argument constructor
	    public Account() {
	        this.balance=0.0;
	        this.accountNumber=0; // Default account number for demonstration
	    }

	    // two arguments constructor
	    public Account(double initialBalance, int accountNumber) {
	        this.balance = initialBalance;
	        this.accountNumber = accountNumber;
	    }

	    // Method to deposit money 
	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            System.out.println("Deposited: " + amount);
	        } else {
	            System.out.println("Cannot deposit non-positive amount.");
	        }
	    }

	    // Method to withdraw money 
	    public void withdraw(double amount) {
	        if (amount > 0 && balance >= amount) {
	            balance -= amount;
	            System.out.println("Withdrew: " + amount);
	        } else {
	            System.out.println("Cannot withdraw amount larger than balance or non-positive amount.");
	        }
	    }
        // Method to display the balance
	    public void displayBalance() {
	        System.out.println("Account Number: " + accountNumber + " | Current Balance: " + balance);
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter initial balance: ");
	        double initialBalance = scanner.nextDouble();
	        System.out.print("Enter account number: ");
	        int accountNumber = scanner.nextInt();
	        
	        // Creating new account with user provided initial balance and account number
	        Account myAccount = new Account(initialBalance, accountNumber);

	        System.out.print("Enter amount to deposit: ");
	        double depositAmount = scanner.nextDouble();
	        myAccount.deposit(depositAmount);
	        
	        System.out.print("Enter amount to withdraw: ");
	        double withdrawAmount = scanner.nextDouble();
	        myAccount.withdraw(withdrawAmount);
	        myAccount.displayBalance();

	        scanner.close();
	    }
	}

