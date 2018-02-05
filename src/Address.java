
public class Address {
    // PRIVATE INSTANCE VARIABLE

    private String _streetNumber;
    private String _streetName;
    private String _cityName;
    private String _provinceName;

    // CONSTRUCTOR ....
    Address() {

    }

     Address(String streetNumber, String streetName, String cityName, String province) {
        this._streetNumber = streetNumber;
        this._streetName = streetName;
        this._cityName = cityName;
        this._provinceName = province;
    }

    @Override
    public String toString() {
        return "Address{" +
                "streetNumber='" + this._streetNumber + '\'' +
                ", streetName='" + this._streetName + '\'' +
                ", cityName='" + this._cityName + '\'' +
                ", provinceName='" + this._provinceName + '\'' +
                '}';
    }
}
