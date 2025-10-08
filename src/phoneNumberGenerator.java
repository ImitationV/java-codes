
import java.security.SecureRandom;

public class phoneNumberGenerator {
    public static StringBuilder generatorPhoneNumber() {
        StringBuilder phoneNumber = new StringBuilder();

        SecureRandom secureRandom = new SecureRandom();
        //secureRandom.setSeed(59); // A seed determines the starting point of the random number sequence.

        for (int i = 0; i < 3; i++) {
            phoneNumber.append(secureRandom.nextInt(8));
        }
        phoneNumber.append("-");
        for (int i = 0; i < 3; i++) {
            phoneNumber.append(secureRandom.nextInt(10));
        }
        phoneNumber.append("-");
        for (int i = 0; i < 4; i++) {
            phoneNumber.append(secureRandom.nextInt(10));
        }
        return phoneNumber;
    }

    public static void main(String[] args) {

    }

}
