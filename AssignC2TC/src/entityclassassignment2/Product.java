package entityclassassignment2;

public class Product {
	int productId;
    String productName;
    double price;

    // Constructor
    public Product(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    // Method to display product details
    public void displayDetails() {
        System.out.println("Product ID: " + productId + ", Name: " + productName + ", Price: ₹" + price);
    }
}
