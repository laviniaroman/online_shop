package customer;

import customer.utils.DeliveryAddress;

public class CustomerUsage {
    public static void main(String[] args) {
        Customer customer = new Customer("John", "Trevor", "jt@gmmail.com", "123");

        //modify profile
        customer.setFirstname("Tom");
        customer.setEmailAddress("tt@gmail.com");
        customer.setPassword("myPassword");

        //check orders
        customer.addOrder(1);
        customer.addOrder(2);
        customer.showOrders();

        //check wishlist
        customer.addToWishlist("water");
        customer.addToWishlist("phone");
        customer.addToWishlist("dress");
        customer.showWishlist();

        //return a product
        customer.addReturn(1, "car");
        customer.addReturn(1, "pen");
        customer.showReturns();

        //modify addresses
        DeliveryAddress deliveryAddress = new DeliveryAddress("Main", 5, "Bologna");
        customer.changeDeliveryAddress(deliveryAddress);
        System.out.println(deliveryAddress);

    }
}
