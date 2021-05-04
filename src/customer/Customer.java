package customer;

import customer.utils.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Customer {
    private String firstname;
    private String lastName;
    private String emailAddress;
    private String password;
    private BillingAddress billingAddress;
    private DeliveryAddress deliveryAddress;
    private List<Order> ordersList = new ArrayList<>();
    private List<Product> wishlist = new ArrayList<>();
    private List<Return> returnsList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public Customer(String firstname, String lastName, String emailAddress, String password) {
        this.firstname = firstname;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.password = password;
    }

    //change name, email address, password
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public BillingAddress getBillingAddress() {
        return billingAddress;
    }

    public DeliveryAddress getDeliveryAddress() {
        return deliveryAddress;
    }


    //manage orders
    public void addOrder(int orderNumber) {
        ordersList.add(new Order(orderNumber));
    }

    public void showOrders() {
        System.out.println("My orders:");
        for (Order order : ordersList) {
            int number = order.getOrderNumber();
            System.out.println(number);
        }
    }

    // manage wishlist
    public void addToWishlist(String name) {
        wishlist.add(new Product(name));
    }

    public void showWishlist() {
        System.out.println("My wishlist:");
        for (Product item : wishlist) {
            System.out.println(item.getName());
        }
    }

    //manage returns
    public void addReturn(int orderNumber, String productName) {
        returnsList.add(new Return(orderNumber, productName));
        System.out.println("Item " + productName + " from order no." + orderNumber + " returned");

    }

    public void showReturns() {
        System.out.println("My returns:");
        for (Return item : returnsList) {
            System.out.println(item.toString());
        }
    }

    //manage addresses
    public void changeDeliveryAddress(DeliveryAddress deliveryAddress) {
        System.out.println("Enter the street name: ");
        String streetName = scanner.nextLine();
        System.out.println("Enter the street number: ");
        int streetNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the city name: ");
        String city = scanner.nextLine();
        deliveryAddress.setStreet(streetName);
        deliveryAddress.setStreetNumber(streetNumber);
        deliveryAddress.setCity(city);

    }
}
