// TEACHER CLASS

public class Teacher extends Resident implements SchoolID {

    // CONSTRUCTOR
    private String _schoolID;
    public Teacher(String name, int age, String gender, double height, double massInPounds, String SIN) {
        super(name, age, gender, height, massInPounds, SIN);
    }


    @Override
    public void addSchool(String schoolName) {
      this._schoolID = schoolName;
    }
}
