package Demo.Student;




public class Address {
    private String street;
    private String city;
    private String state;


    // Getter and Setter methods for street
    public String getStreet() {
        return street;
    }


    public void setStreet(String street) {
        this.street = street;
    }


    // Getter and Setter methods for city
    public String getCity() {
        return city;
    }


    public void setCity(String city) {
        this.city = city;
    }


    // Getter and Setter methods for state
    public String getState() {
        return state;
    }


    public void setState(String state) {
        this.state = state;
    }


    @Override
    public String toString() {
        return "Address: " + street + ", " + city + ", " + state;
    }
}


