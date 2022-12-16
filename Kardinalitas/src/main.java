
import java.time.LocalDate;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Leman
 */
public class main {
    public static void main(String[] args) {

        Customer leman = new Customer();
        leman.setName("Lemandowski");
        leman.setAddress("Desa Dubai, Kec.Hayalan, Kab.Mimpi");
        System.out.println("Pelanggan atas nama " + leman.getName() + " dipersilahkan masuk!");
        System.out.println("Pesanan atas nama " + leman.getName() + " siap dikirimkan ke alamat " + leman.getAddress());

        System.out.println();

        Order kfc = new Order();
        leman.addOrder(kfc);
        kfc.calcSubTotal();
        kfc.calcTax();
        kfc.calcTotal();
        kfc.calcTotalWeight();
        kfc.setDate(LocalDate.now());
        kfc.setStatus("Shipping...");
        System.out.println("Pesanan pada tanggal : " + kfc.getDate());
        System.out.println("Status : " + kfc.getStatus());

        System.out.println();

        OrderDetail detailOrder = new OrderDetail(kfc);
        detailOrder.calcSubTotal();
        detailOrder.calcWeight();
        detailOrder.calcTax();
        detailOrder.setQuantity(7);
        detailOrder.setTaxStatus("Dipotong pajak");
        kfc.addOrderDetail(detailOrder);
        System.out.println("Jumlah item yang dibeli: " + detailOrder.getQuantity());
        System.out.println("Status Pajak: " + detailOrder.getTaxStatus());

        System.out.println();

        Item item = new Item();
        item.getPriceForQuantity();
        item.getTax();
        item.inStock();
        item.setShippingWeight(8);
        item.setDescription("Pembelian barang dengan kondisi baru.");
        item.addOrderDetail(detailOrder);
        System.out.println("Total berat pengiriman sebesar: " + item.getShippingWeight() + " Kg");
        System.out.println("Deskripsi barang: " + item.getDescription());

        Cash cash = new Cash();
        cash.setCashTendered(10000.0F);
        kfc.addCashList(cash);
        System.out.println("Pembayaran ongkos kirim sebesar: Rp." + (int) cash.getCashTendered());

        System.out.println();

        Check check = new Check();
        check.setName("Lemandowski");
        check.setBankID("312110148");
        check.authorized();
        kfc.addCheckList(check);
        System.out.println("Pembayaran atas nama " + check.getName() + " dengan IDBank " + check.getBankID());

        System.out.println();

        Credit credit = new Credit();
        credit.authorized();
        credit.setNumber("12345678910");
        credit.setType("Debit");
        credit.setExpDate(LocalDate.now());
        kfc.addCreditList(credit);
        System.out.println("Nomor kartu credit " + credit.getNumber() + " dengan tipe " + credit.getType() + " akan berakhir pada " + credit.getExpDate());

        System.out.println("Terima kasih telah melakukan pesanan, Happy Shopping :)");
    }
}
