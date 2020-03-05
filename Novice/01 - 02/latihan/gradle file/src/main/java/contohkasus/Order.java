package contohkasus;

/**
 * order
 */
public class Order {

    private String knows_placemenr_date;
    private String knows_delivery_date;
    private String order_items;
    private int total;
    private int amount;
    private int price_items;
    private String applicable_taxes;
    private String order_number;

    public Order(String order_items, int price_items,int amount) {
        this.order_items = order_items;
        this.price_items = price_items;
        this.amount = amount;
    }

    public void orderItemDetail(){

        total = price_items * amount;

        System.out.println("-------rincian belanja anda-------");
        System.out.println("name item : " + order_items);
        System.out.println("price item : " + price_items);
        System.out.println("amount item : " + amount);
        System.out.println("total : " + total);

    }
}