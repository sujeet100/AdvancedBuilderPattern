package beingprofessional;

/**
 * Created by kamthes on 17/02/17.
 */
public class Address {

    private final String street;
    private final String city;
    private final String state;
    private final String pin;

    public Address(String street, String city, String state, String pin) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.pin = pin;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getPin() {
        return pin;
    }
}
