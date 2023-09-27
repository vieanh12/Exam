package Exam;

import java.util.ArrayList;

public class Order {
    private String customerName;
    private String transactionTime;
    private ArrayList<LineItem> lineItems;

    public Order() {
        this.lineItems = new ArrayList<>();
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getTransactionTime() {
        return transactionTime;
    }

    public void setTransactionTime(String transactionTime) {
        this.transactionTime = transactionTime;
    }

    public ArrayList<LineItem> getLineItems() {
        return lineItems;
    }

    public double cost() {
        double totalCost = 0.0;
        for (LineItem lineItem : lineItems) {
            totalCost += lineItem.cost();
        }
        return totalCost;
    }

    public boolean addProduct(Product product, int quantity) {
        if (quantity <= product.getQuantity()) {
            LineItem lineItem = new LineItem(product, quantity);
            lineItems.add(lineItem);
            product.setQuantity(product.getQuantity() - quantity);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Order [customerName=" + customerName + ", transactionTime=" + transactionTime + ", lineItems="
                + lineItems + "]";
    }
}
