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
        try {
            return this._address.toString();
        } catch (Exception e) {
            return "Error: Address not initialized";
        }

    }

    //CONSTRUCTOR.....
    public Resident(String name, int age, String gender, double height, double massInPounds, String SIN) {
        super(name, age, gender, height, massInPounds);
        this._SIN = SIN;
    }


}
