import javax.print.attribute.standard.PrinterMakeAndModel;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nMy Mini Java Projects: ");
        System.out.println("*************************************\n");

        //01
        phoneNumberGenerator ph = new phoneNumberGenerator();
        System.out.println("[*Program] Random Phone Number generator: " + phoneNumberGenerator.generatorPhoneNumber());

        // 02
        System.out.println("[*Program] Sum of Cubes: ");
        SumOfCube cube = new SumOfCube();
        //cube.findCubes();

        // 03
        System.out.println("[*Program] Username: ");
        UsernameGenerator ug = new UsernameGenerator();
        //ug.generateUsername();

        // 04
        System.out.println("[*Program] Distance between coordinates: ");
        DistanceBetweenCoOrds dbc = new DistanceBetweenCoOrds();
        //dbc.findDistanceOfCoordinates();

        // 07
        System.out.println("[*Program] Random sin/cos/tan values: ");
        SinCosTanRandomValue sct = new SinCosTanRandomValue();
        //sct.randTriginometricVal();

        // 08
        System.out.println("[*Program] Volume and Area of Cylinder: ");
        Cylinder cdr = new Cylinder();
        //cdr.calculateCylinder();

        // 11
        System.out.println("[*Program] Sphere: ");
        /*
        Sphere spr = new Sphere(5);
        System.out.println("Entered diameter is: "+spr.getDiameter());
        System.out.println("Volume of Sphere: "+spr.getVolume());
        System.out.println("Area of Sphere: "+spr.getArea());
        */

        // 12
        System.out.println("[*Program 12] Dog Class: ");
        Dog dog = new Dog("Vaau",3);
        System.out.println(dog);
        System.out.println("Age in human years: "+dog.ageInHumanYears());

        // 13
        System.out.println("[*Program 13] Car Class: ");
        Car car = new Car("Ford", "Escape",2012);
        System.out.println(car);

        // 14
        System.out.println("[*Program 14] Book Class: ");
        Book book = new Book("Harry Potter","October 16, 1998","Penguin Publishers","JK Rowling");
        System.out.println(book);

        // 15
        System.out.println("[*Program 15] Flight Class");
        Flight flight = new Flight("Delta","JFK","DHK", 2441139);
        System.out.println(flight);

        // 16
        System.out.println("[*Program 16] Rock Paper Scissors");





        //TODO: Create a while loop to ask user which one to run
    }
}