import java.util.Objects;

public class MenuItem {

    public static int productCount;
    private String code;
    private String name;
    private double price;
    private String category;

    public MenuItem(String code, String name, double price, String category) {

        productCount++;
        this.code = code;
        this.name = name;
        this.price = price;
        this.category = category;

    }

    @Override
    public String toString() {

        return code + "\t" + name + "\t" + price + " PLN" + "\t" + category;

    }

    @Override
    public boolean equals(Object o) {

        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return Objects.equals(code, menuItem.code);

    }

    @Override
    public int hashCode() {

        return Objects.hashCode(code);

    }

    public String getCode() {

        return code;

    } public String getName() {

        return name;

    } public double getPrice() {

        return price;

    } public String getCategory() {

        return category;

    } public static void returnNumberOfProducts() {

        System.out.println("The current number of products is: " + productCount);

    }
}
