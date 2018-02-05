// Super that we'll use for this example
public class Person {
    private String _name;
    private int _age;
    private int _gender;
    private double _heightInInches;
    private double _massInPounds;
    public Person() {

    }

    public Person(String name, int age, int gender, double height, double massInPounds) {
        this._name = name;
        this._age = age;
        this._gender = gender;
        this._heightInInches = height;
        this._massInPounds = massInPounds;
    }

    public String get_name() {
        return _name;
    }

    public int get_age() {
        return _age;
    }

    public int get_gender() {
        return _gender;
    }

    public double get_heightInInches() {
        return _heightInInches;
    }

    public double get_massInPounds() {
        return _massInPounds;
    }

    // PUBLIC METHOD

    public void eats() {
        System.out.println(this._name + " is eating");
    }

    public void walks() {
        System.out.println(this._name + " is walking");
    }

    public void talks() {
        System.out.println(this._name + " is talking");
    }
}
