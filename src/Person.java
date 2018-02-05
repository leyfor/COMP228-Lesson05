// Super that we'll use for this example
public class Person {
    protected String _name;
    protected int _age;
    protected String _gender;
    protected double _heightInInches;
    protected double _massInPounds;
    public Person() {

    }

     Person(String name, int age, String gender, double height, double massInPounds) {
        this._name = name;
        this._age = age;
        this._gender = gender;
        this._heightInInches = height;
        this._massInPounds = massInPounds;
    }

    // THE ACCESSOR METHOD FOR NAME
    public String getName() {
        return this._name;
    }

    // THE ACCESSOR METHOD FOR AGE
    public int getAge() {
        return this._age;
    }

    // THE ACCESSOR METHOD FOR GENDER
    public String getGender() {
        return this._gender;
    }

    // THE ACCESSOR METHOD FOR HEIGHT
    public double getHeightInInches() {
        return this._heightInInches;
    }

    // THE ACCESSOR METHOD MASS
    public double getMassInPounds() {
        return this._massInPounds;
    }

    // PUBLIC EVENT METHOD

    public void eats() {
        System.out.println(this._name + " is eating");
    }

    // PUBLIC EVENT METHOD
    public void walks() {
        System.out.println(this._name + " is walking");
    }

    // PUBLIC EVENT METHOD
    public void talks() {
        System.out.println(this._name + " is talking");
    }
}
