// RESIDENT SUB CLASS OF THE PERSON SUPERCLASS

public class Resident extends Person {
    // PRIVATE INSTANCE VARIABLES
    private String _SIN;
    private Address _address;

    //GETTERS AND SETTERS
    public String getSIN() {
        return _SIN;
    }

    public void setAddress(String streetNumber, String streetName, String cityName, String province) {
        this._address = new Address(streetNumber, streetName,  cityName, province);
    }

    public String getAddress() {
        return this._address.toString();
    }

    //CONSTRUCTOR.....
    public Resident(String name, int age, int gender, double height, double massInPounds, String SIN) {
        super(name, age, gender, height, massInPounds);
        this._SIN = SIN;
    }


}
