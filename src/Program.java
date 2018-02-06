
// DRIVER CLASS .....
public class Program {

    // MAIN STATIC METHOD
    public static void main(String[] args) {
     Resident resident = new Resident("Tim", 25, "male", 5.7, 8.4, "x23490000y");
     resident.setAddress("35", "Main Street", "Madrid", "Madrid");
        System.out.println(resident.getAddress());
        resident.changeAdress("23", "Mahadahoda", "Madrid", "Madrid" );

        resident.eats();

        System.out.println(resident.getAddress());


    }
}
