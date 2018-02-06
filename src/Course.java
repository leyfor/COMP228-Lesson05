
//COURSE CLASS

public class Course {
    // PRIVATE INSTANCE VARIABLES
    private String _code;
    private String _courseName;
    private String _description;
    private double _cost;

    public String getCourseName() {
        return this._courseName;
    }

    //CONSTRUCTOR
    public Course(String code, String courseName, String description, double cost) {
        this._code = code;
        this._courseName = courseName;
        this._description = description;
        this._cost = cost;
    }

}
