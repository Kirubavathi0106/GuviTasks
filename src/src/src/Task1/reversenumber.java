package Task1;

public class reversenumber {
	    public static void main(String[] args) {
	        int number = 876;  
	        int reversedNumber = 0;  

	        while (number != 0) {
	            int lastDigit = number % 10; 
	            reversedNumber = reversedNumber * 10 + lastDigit;  
	            number /= 10;  
	        }

	        System.out.println("The reversed number is: " + reversedNumber);
	    }
	}
