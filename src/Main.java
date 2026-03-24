public class Main {
    public static void main (String[] args) {

        MenuItem menuitem1 = new MenuItem("101010", "a", 10.00, "Coffee");


        MenuItem menuitem2 = new MenuItem("101110", "b", 12.50, "Dessert");


        MenuItem menuitem3 = new MenuItem("111000", "c", 9.00, "Coffee");


        System.out.println(menuitem1.toString());

        MenuItem.returnNumberOfProducts();

        if(menuitem2.equals(menuitem3)) {

            System.out.println("item1 has the same code as item2!");

        } else {

            System.out.println("item1 and item2 have different codes.");

        }


    }
}



