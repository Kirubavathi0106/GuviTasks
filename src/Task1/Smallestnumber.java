package Task1;
public class Smallestnumber {
    public static void main(String[] args) {
       
        int a = 1000; 
        int b = 766;
        int c = 193;  

        if (a <= b && a <= c) {
            System.out.println(a + " is the smallest number");
        }
        else if (b <= c) { 
            System.out.println(b + " is the smallest number");
        }
        else {
            System.out.println(c + " is the smallest number");
        }
    }
}
