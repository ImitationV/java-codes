import java.security.SecureRandom;

public class SinCosTanRandomValue {
    public void randTriginometricVal(){
        SecureRandom secureRandom = new SecureRandom();
        int randomNum = secureRandom.nextInt(31)+10;
        System.out.println("Generated random number is "+randomNum);
        System.out.printf("Sin%d = %f\n",randomNum,Math.sin(randomNum));
        System.out.printf("cos%d = %f\n",randomNum,Math.cos(randomNum));
        System.out.printf("tan%d = %f\n",randomNum,Math.tan(randomNum));
    }
    public static void main(String[] args) {
    }
}
