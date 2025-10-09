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


        //TODO: Create a while loop to ask user which one to run
    }
}