package Task1;

public class Pattern {
//	write a java program to print belowed pattern->i and j and k=>5                
//			55555   54444 54333  54322  54321

	    public static void main(String[] args) {
	        int k = 5;

	       //outer loop
	        for (int i = k; i >= 1; i--) {
	            // Inner loop
	            for (int j = k; j >= 1; j--) {
	                if (j > i) {
	                    System.out.print(j);
	                } else {
	                    System.out.print(i);
	                }
	            }
	           
	            System.out.println();
	        }
	    }
	}
