package task1_2;

public class Product {
    int pid;
    double price;
    int quantity;

    public Product(int pid, double price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }

    // Method to calculate total cost of the product
    public double getTotalCost() {
        return price * quantity;
    }
}

