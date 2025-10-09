import java.util.Scanner;

public class DistanceBetweenCoOrds {
    public void findDistanceOfCoordinates() {
        float x1 = 0, x2 = 0, y1 = 0, y2 = 0, distance = 0;
        String repeat = "N";
        Scanner sc = new Scanner(System.in);

        while (!repeat.equalsIgnoreCase("y")) { // ! means keep looking until user enters Y or y
            System.out.print("Enter x1: ");
            x1 = sc.nextFloat();

            System.out.print("Enter y1: ");
            y1 = sc.nextFloat();

            System.out.print("Enter x2: ");
            x2 = sc.nextFloat();

            System.out.print("Enter y2: ");
            y2 = sc.nextFloat();

            System.out.printf("The coordinates you entered are (%.1f,%.1f) and (%.1f,%.1f)\nIs this correct? (Y/N): ", x1, y1, x2, y2);
            repeat = sc.next();
        }
        sc.close();

        distance = (float) (Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)));
        System.out.printf("Distance between coordinates: %.3f", distance);
    }

    public static void main(String[] args) {

    }
}
