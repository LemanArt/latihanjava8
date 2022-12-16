
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Leman
 */
public class Item {
    private double shippingWeight;
    private String description;
    private List<OrderDetail> orderDetailList = new ArrayList<OrderDetail>();

    public double getShippingWeight() {
        return shippingWeight;
    }

    public void setShippingWeight(double shippingWeight) {
        this.shippingWeight = shippingWeight;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void addOrderDetail(OrderDetail orderDetail) {
        this.orderDetailList.add(orderDetail);
    }

    public void getPriceForQuantity() {
        System.out.println("Getting price for quantity...");
    }

    public void getTax() {
        System.out.println("Getting Tax...");
    }

    public void inStock() {
        System.out.println("In Stock!");
    }
}
