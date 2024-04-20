package Task1;
import java.util.Scanner;
//write a program to find a given number is negative or positive using branching r looping

public class Number {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in); 
	        
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();  

	        if (number > 0) {
	            System.out.println("The number is positive.");
	        } else if (number < 0) {
	            System.out.println("The number is negative.");
	        } else {
	            System.out.println("The number is zero.");
	        }
	        
	        scanner.close();  
	    }
	}


