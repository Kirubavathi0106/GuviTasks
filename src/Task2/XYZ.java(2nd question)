package Task2;
import java.util.Scanner;


class Product {
    private int pid;  
    private double price;  
    private int quantity;  
    
    public Product(int pid, double price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }

    public int getPid() {
        return pid;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}

// class XYZ 
public class XYZ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Product[] products = new Product[5];  // Array to store Product objects

        System.out.println("Enter the details of products (ID, price, quantity) for 5 products:");
        for (int i = 0; i < products.length; i++) {
            System.out.print("Product " + (i + 1) + " (ID Price Quantity): ");
            int pid = scanner.nextInt();
            double price = scanner.nextDouble();
            int quantity = scanner.nextInt();
            products[i] = new Product(pid, price, quantity);
        }
    
        int highestPricePid = findProductWithHighestPrice(products);
        System.out.println("The product ID with the highest price is: " + highestPricePid);
  
        double totalAmt = calculateTotalAmt(products);
        System.out.println("Total amount spent on all products: " + String.format("%.2f", totalAmt));

        scanner.close();
    }

    // Method to find the product with the highest price 
    public static int findProductWithHighestPrice(Product[] products) {
        if (products == null || products.length == 0) {
            return -1;  
        }
        
        int maxPricePid = products[0].getPid();
        double maxPrice = products[0].getPrice();
        for (int i = 1; i < products.length; i++) {
            double currentPrice = products[i].getPrice();
            if (currentPrice > maxPrice) {
                maxPrice = currentPrice;
                maxPricePid = products[i].getPid();
            }
        }
        return maxPricePid;
    }

    //  calculating the total amount spent on all products
    public static double calculateTotalAmt(Product[] products) {
        double total = 0;
        for (Product product : products) {
            double amountForProduct = product.getPrice() * product.getQuantity();
            System.out.println("Product ID: " + product.getPid() + " - ₹" + amountForProduct);
            total += amountForProduct;
        }
        return total;
    }

    }

