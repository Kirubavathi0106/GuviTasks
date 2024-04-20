package Task1;
import java.util.Scanner; 
public class Purchaseamount {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the purchase amount: ");
	        double purchaseAmount = scanner.nextDouble();
	        double discount = 0;

	         if (purchaseAmount < 500) {
	            System.out.println("No discount is applied.");
	        } else if (purchaseAmount >= 500 && purchaseAmount <= 1000) {
	            discount = purchaseAmount * 0.10;
	            System.out.println("A 10% discount is applied.");
	        } else if (purchaseAmount > 1000) {
	            discount = purchaseAmount * 0.20;
	            System.out.println("A 20% discount is applied.");
	        }
	        double finalAmount = purchaseAmount - discount;
	        System.out.println("The final amount to be paid is: " + finalAmount);
	        scanner.close();
	    }
	}



