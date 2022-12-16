/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Leman
 */
public class OrderDetail {
    private int quantity;
    private String taxStatus;
    private Order order;
    private Item item;

    public OrderDetail(Order order) {
        this.order = order;
        this.item = new Item();
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getTaxStatus() {
        return taxStatus;
    }

    public void setTaxStatus(String taxStatus) {
        this.taxStatus = taxStatus;
    }

    public void calcSubTotal() {
        System.out.println("Calculating Sub Total...");
    }

    public void calcWeight() {
        System.out.println("Calculating Weight...");
    }

    public void calcTax() {
        System.out.println("Calculating Tax...");
    }
}
