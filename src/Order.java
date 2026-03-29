import java.util.ArrayList;

public class Order {

    private int orderNumber;
    private CafeCustomer cafeCustomer;
    private ArrayList<MenuItem> items = new ArrayList<>();
    private boolean paid = false;
    private static int nextOrderNumber;



    public Order(CafeCustomer cafeCustomer) {

        this.orderNumber = 1 + nextOrderNumber;
        nextOrderNumber++;
        this.cafeCustomer = cafeCustomer;


    }

    @Override
    public String toString() {

        String  itemNames = "";

        for (MenuItem item1 : items) {

            if(item1 != null) {

                itemNames = itemNames + item1.getName() + " ";

            }

        } return "Order ID: " + orderNumber + "\t" + "\tCustomer ID: " + cafeCustomer.getCustomerId() + "\t" + "\tItems: " + itemNames + "\t" + "Item count: " + countItems() + "\t" + "Total: " + calculateTotal() + " PLN" + "\t" + "\tPaid?: " + paid;
    }

    public void addItem(MenuItem item) {

        if(item != null) {

            items.add(item);

        }

    } public double calculateTotal() {

        double price = 0.0;

        for(MenuItem item : items) {

            if(item != null) {

                price += item.getPrice();

            }

        } return price;

    } public int countItems() {

        int count = 0;

        for(MenuItem item : items) {

            if(item != null) {

                count ++;

            }


        } return count;

    } public void markAsPaid() {

        this.paid = true;

    } public static int getNextOrderNumber() {

        return nextOrderNumber + 1;

    }


}
