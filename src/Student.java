// STUDENT CLASS

import java.util.ArrayList;

public class Student extends Resident implements SchoolID {

    //PRIVATE INSTANCE VARIABLES
    private String _schoolID;
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
        int index = -1;
        for (Course course : this._courses) {
            if(course.getCourseName() == courseName) {
                index  = this._courses.indexOf(course);
                System.out.println(course.getCourseName());

            }

        }


        if (index >= 0) {
            this._courses.remove(index);
        }


         //boolean index = _courses.contains(courseName);
       //this._courses.remove(this._courses.contains(courseName));

    }

    @Override
    public String toString() {
       
        String output = "";
        output += "Student Name: " + this._name + " Student ID: " + this._studentID + "\n";
        if (this._courses.size() > 0) {
            output += "Courses: \n";
            output += "+++++++++++++++++++++\n";
            for ( Course course : this._courses) {
                output += course.getCourseName() + "\n";

            }
            output += "+++++++++++++++++++++";

        }


        return output;
    }

    @Override
    public void addSchool(String schoolName) {
        this._schoolID = schoolName;
    }
}
