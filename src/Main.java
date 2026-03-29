public class Main {
    public static void main (String[] args) {

        MenuItem menuitem1 = new MenuItem("101010", "a", 10.00,"Coffee");

        System.out.println(menuitem1.toString());


        MenuItem menuitem2 = new MenuItem("101110", "b", 12.50,"Dessert");
        System.out.println(menuitem2.toString());

        MenuItem menuitem3 = new MenuItem("111000", "c", 9.00,"Coffee");
        System.out.println(menuitem3.toString());

        MenuItem menuitem4 = new MenuItem("111000", "d", 8.00,"Coffee");
        System.out.println(menuitem4.toString());


        if(menuitem3.equals(menuitem4)) {
            System.out.println("Warning! Item 3 and item 4 have the same code!");
        }

        System.out.println("Product count: " + MenuItem.productCount);

        CafeCustomer customer = new CafeCustomer (1, "Mary", "Jane", "mjane@gmail.com");

        System.out.println(customer);

        Order order = new Order (customer);

        order.addItem(menuitem1);
        order.addItem(menuitem2);
        order.addItem(menuitem3);

        System.out.println(order);

        System.out.println("Total: " + order.calculateTotal() + " PLN");
        System.out.println("Number of items: " + order.countItems());

        order.markAsPaid();
        System.out.println(order);


    }
}



