// STUDENT CLASS

import java.util.ArrayList;

public class Student extends Resident {

    //PRIVATE INSTANCE VARIABLES
    private String _studentID;
    private ArrayList<Course> _courses = new ArrayList<>();

    // CONSTRUCTOR
    public Student(String name, int age, String gender, double height, double massInPounds, String SIN, String studentID) {
        super(name, age, gender, height, massInPounds, SIN);
        this._studentID = studentID;
    }

    public void addCourse(String courseCode, String courseName, String courseDescription, double coursesCost) {
        this._courses.add(new Course(courseCode, courseName, courseDescription, coursesCost));
    }

    public void dropCourse(String courseName) {
        for (Course course : this._courses) {
            if(course.getCourseName().equals(courseName)) {
               // boolean index = _courses.contains(courseName);
                this._courses.remove(course);
            }

        }

    }

    @Override
    public String toString() {
        String output = "";
        output += "Student Name: " + this._name + " Student ID: " + this._studentID + "\n";
        if (this._courses.size() > 0) {
            output += "Courses: \n";
            output += "+++++++++++++++++++++";
            for ( Course course : this._courses) {
                output += course.getCourseName() + "\n";

            }
            output += "+++++++++++++++++++++";

        }


        return output;
    }
}
