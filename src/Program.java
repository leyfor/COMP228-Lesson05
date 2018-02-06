
// DRIVER CLASS .....
public class Program {

    // MAIN STATIC METHOD
    public static void main(String[] args) {
     Student student = new Student("Tim", 25, "male", 5.7, 8.4, "x23490000y", "15T12345");
     student.setAddress("35", "Main Street", "Madrid", "Madrid");
        System.out.println(student.getAddress());
        student.changeAdress("23", "Mahadahoda", "Madrid", "Madrid" );

        student.eats();

        System.out.println(student.getAddress());

        student.addCourse("COMP101", "Programming fundamental", "First Computer Course", 600.35);

        System.out.println(student.toString());

    }
}
