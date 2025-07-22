package entityclassassignment2;

public class ProductDemo {
	public static void main(String[] args) {
        Product p1 = new Product(201, "Laptop", 55000.00);
        Product p2 = new Product(202, "Smartphone", 20000.00);
        Product p3 = new Product(203, "Headphones", 1500.00);
        Product p4 = new Product(204, "Monitor", 7500.00);

        System.out.println("Product Details:");
        p1.displayDetails();
        p2.displayDetails();
        p3.displayDetails();
        p4.displayDetails();
    }
}
