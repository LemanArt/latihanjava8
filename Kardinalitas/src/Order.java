
import java.time.LocalDate;
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
public class Order {
    private LocalDate date;
    private String status;
    private Customer customer;
    private List<Cash> cashList;
    private List<Check> checkList;
    private List<Credit> creditList;
    private List<OrderDetail> orderDetailList;

    public Order() {
        this.cashList = new ArrayList<Cash>();
        this.checkList = new ArrayList<Check>();
        this.creditList = new ArrayList<Credit>();
        this.orderDetailList = new ArrayList<OrderDetail>();
        this.customer = new Customer();
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void addCashList(Cash cash) {
        this.cashList.add(cash);
    }

    public void addCheckList(Check check) {
        this.checkList.add(check);
    }

    public void addCreditList(Credit credit) {
        this.creditList.add(credit);
    }

    public void addOrderDetail(OrderDetail orderDetail) {
        this.orderDetailList.add(orderDetail);
    }

    public void calcSubTotal() {
        System.out.println("Calculating Sub Total...");
    }

    public void calcTax() {
        System.out.println("Calculating Tax...");
    }

    public void calcTotal() {
        System.out.println("Calculating Total...");
    }

    public void calcTotalWeight() {
        System.out.println("Calculating Total Weight...");
    }
}

