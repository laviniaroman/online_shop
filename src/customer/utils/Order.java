package customer.utils;

import java.util.List;

public class Order {
    private int orderNumber;
    private List<Product> orderItems;

    public Order(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    /*   public void addItem(String name ){
        orderItems.add(new Product(name));
    }

    public void showOrderItems(List<Product> orderItems){
        for (Product item:orderItems) {
            System.out.println(item + "\n");
        }
    }*/
}
