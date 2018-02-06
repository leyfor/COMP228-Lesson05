
public class Address {
    // PRIVATE INSTANCE VARIABLE

    private String _streetNumber;
    private String _streetName;
    private String _cityName;
    private String _provinceName;
    private boolean _hasChanged = false;

    // CONSTRUCTOR ....
    Address() {

    }

     Address(String streetNumber, String streetName, String cityName, String province) {
         this._set(streetNumber, streetName, cityName,  province);
    }

    @Override
    public String toString() {
        String output = "";
        if(this._hasChanged) {
            output +=   "New Address: \n";

        } else {

            output +=   "Address: \n";


        }
        output +=  "+++++++++++++++++++++++++++++ \n";
        output +=  this._streetNumber + ", " + this._streetName + "\n";
        output += this._cityName + ", " + this._provinceName + "\n";




        return output;
    }

    public void change(String streetNumber, String streetName, String cityName, String province) {
      this._set(streetNumber, streetName, cityName,  province);
      this._hasChanged = true;
    }

    private void _set(String streetNumber, String streetName, String cityName, String province) {
        this._streetNumber = streetNumber;
        this._streetName = streetName;
        this._cityName = cityName;
        this._provinceName = province;
    }


}
