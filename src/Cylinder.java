import java.security.SecureRandom;

public class Cylinder {
    public void calculateCylinder() {
        SecureRandom secureRandom = new SecureRandom();
        int r = secureRandom.nextInt(10) + 1;
        int h = secureRandom.nextInt(10) + 1;
        double volume = (Math.PI * r * r * h);
        double surfaceArea = 2 * Math.PI * r * h + 2 * Math.PI * Math.pow(r, 2);
        System.out.printf("Random r = %d and h = %d\n", r, h);
        System.out.println("Volume: " + volume);
        System.out.println("Surface Area: " + surfaceArea);

    }

    public static void main(String[] args) {

    }
}
