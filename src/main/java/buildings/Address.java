package buildings;

public class Address {
    private double doorNumber;
    private String street;
    private String city;

    public Address(double doorNumber, String street, String city) {
        this.doorNumber = doorNumber;
        this.street = street;
        this.city = city;
    }

    public double getDoorNumber() {
        return doorNumber;
    }

    public void setDoorNumber(double doorNumber) {
        this.doorNumber = doorNumber;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "doorNumber=" + doorNumber +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
