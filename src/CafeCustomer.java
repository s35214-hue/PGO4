import java.util.Objects;

public class CafeCustomer {

    private int customerId;
    private String firstName;
    private String lastName;
    private String email;

    public CafeCustomer(int customerId, String firstName, String lastName, String email) {

        this.customerId =  customerId;
        this.firstName = firstName.toUpperCase();
        this.lastName = lastName.toUpperCase();
        this.email = email;

    }

    @Override
    public String toString() {

        return customerId + "\t" + firstName + " " + lastName + "\t" + email;

    }

    @Override
    public boolean equals(Object o) {

        if (o == null || getClass() != o.getClass()) return false;
        CafeCustomer that = (CafeCustomer) o;
        return customerId == that.customerId || Objects.equals(email, that.email);

    }

    @Override
    public int hashCode() {

        return Objects.hash(customerId, email);

    }

    public int getCustomerId() {

        return customerId;

    } public String getFirstName() {

        return firstName;

    } public String getLastName() {

        return lastName;

    } public String getEmail() {

        return email;

    } public void displayCustomerData() {

        System.out.println(customerId + "\t" + firstName + " " + lastName + "\t" + email);

    }

}
