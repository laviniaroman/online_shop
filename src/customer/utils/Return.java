package customer.utils;

public class Return {
    private int orderNumber;
    private String productName;

    public Return(int orderNumber, String productName) {
        this.orderNumber = orderNumber;
        this.productName = productName;
    }

    @Override
    public String toString() {
        return "Return{" +
                "orderNumber=" + orderNumber +
                ", productName='" + productName + '\'' +
                '}';
    }
}
