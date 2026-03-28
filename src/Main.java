public class Main {
    public static void main (String[] args) {

        MenuItem menuitem1 = new MenuItem("101010", "a", 10.00, "Coffee");


        MenuItem menuitem2 = new MenuItem("101110", "b", 12.50, "Dessert");


        MenuItem menuitem3 = new MenuItem("111000", "c", 9.00, "Coffee");


        System.out.println(menuitem1.toString());

        MenuItem.returnNumberOfProducts();

        if(menuitem2.equals(menuitem3)) {

            System.out.println("object1 has the same code as object2!");

        } else {

            System.out.println("object1 and object2 have different codes.");

        }

        CafeCustomer customer1 = new CafeCustomer(1, "John", "Doe", "jdoe@gmail.com");

        CafeCustomer customer2 = new CafeCustomer(2, "Alex", "Brown", "abrown@gmail.com");


        if(customer1.equals(customer2)) {

            System.out.println("object1 has the same code as object2!");

        } else {

            System.out.println("object1 and object2 have different codes.");

        }

        customer1.displayCustomerData();
        customer2.displayCustomerData();
    }
}



