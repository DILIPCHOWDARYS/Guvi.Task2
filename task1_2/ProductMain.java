package task1_2;

import java.util.Scanner;

public class ProductMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Product[] products = new Product[5]; 
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for Product " + (i + 1) + ":");
            System.out.print("Enter Product ID: ");
            int pid = scanner.nextInt();

            System.out.print("Enter Product Price: ");
            double price = scanner.nextDouble();

            System.out.print("Enter Product Quantity: ");
            int quantity = scanner.nextInt();

            products[i] = new Product(pid, price, quantity);
        }

       
        Product highestPriceProduct = products[0];
        for (int i = 1; i < products.length; i++) {
            if (products[i].price > highestPriceProduct.price) {
                highestPriceProduct = products[i];
            }
        }

        System.out.println("\nProduct with highest price:");
        System.out.println("Product ID: " + highestPriceProduct.pid);

       
        double totalAmount = calculateTotalAmount(products);
        System.out.println("\nTotal amount spent on all products: " + totalAmount);

        scanner.close();
    }

    // Method to calculate total amount spent on all products
    public static double calculateTotalAmount(Product[] products) {
        double total = 0;
        for (Product product : products) {
            total += product.getTotalCost();
        }
        return total;
    }
}
