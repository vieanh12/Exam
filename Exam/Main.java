package Exam;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("F523", "Tomato", "Food", 1.5, 589);
        Product product2 = new Product("A763", "Zara shirt", "Appearance", 12.0, 90);
        Product product3 = new Product("H320", "Kitchen table", "Household", 299.0, 13);
        Product product4 = new Product("E092", "IPhone", "Electronic", 1000.0, 4);
        Product product5 = new Product("S108", "Football", "Sport", 19.9, 2);

        Order order1 = new Order();
        order1.setCustomerName("Mike Tyson");
        order1.setTransactionTime("2023-08-08 11:30:00");

        System.out.println("Adding 5 Tomato to the order:");
        if (order1.addProduct(product1, 5)) {
            System.out.println("Product added successfully!");
        } else {
            System.out.println("Failed to add product to the order.");
        }
        System.out.println("Total cost of the order: $" + order1.cost());

        System.out.println("\nAdding 2 IPhone to the order:");
        if (order1.addProduct(product4, 2)) {
            System.out.println("Product added successfully!");
        } else {
            System.out.println("Failed to add product to the order.");
        }
        System.out.println("Total cost of the order: $" + order1.cost());

        System.out.println("\nAdding 4 Football to the order:");
        if (order1.addProduct(product5, 4)) {
            System.out.println("Product added successfully!");
        } else {
            System.out.println("Failed to add product to the order.");
        }
        System.out.println("Total cost of the order: $" + order1.cost());

        System.out.println("\nOrder information:");
        System.out.println(order1);

        DeliveryOrder order2 = new DeliveryOrder();
        order2.setCustomerName("Chris Evans");
        order2.setTransactionTime("2023-08-09 13:14:00");
        order2.setAddress("123 Cau Giay");

        System.out.println("\nAdding 3 Zara shirt to the delivery order:");
        if (order2.addProduct(product2, 3)) {
            System.out.println("Product added successfully!");
        } else {
            System.out.println("Failed to add product to the order.");
        }
        System.out.println("Total cost of the order: $" + order2.cost());

        System.out.println("\nAdding 3 IPhone to the delivery order:");
        if (order2.addProduct(product4, 3)) {
            System.out.println("Product added successfully!");
        } else {
            System.out.println("Failed to add product to the order.");
        }
        System.out.println("Total cost of the order: $" + order2.cost());

        System.out.println("\nDelivery order information:");
        System.out.println(order2);
    }
}
