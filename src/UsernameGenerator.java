import java.security.SecureRandom;
import java.util.Scanner;

public class UsernameGenerator {
    public void generateUsername() {
        Scanner sc = new Scanner(System.in);
        System.out.print("First name: ");
        String fname = sc.next();
        System.out.print("Last name: ");
        String lname = sc.next();
        SecureRandom secureRandom = new SecureRandom();
        sc.close();

        String username = null;

        if (lname.length() < 5) { // if last name is less than 5 characters
            username = fname.substring(0, 1) + lname + secureRandom.nextInt(100);
        } else { // if last name is more than 4 character
            username = fname.substring(0, 1) + lname.substring(0, 5) + secureRandom.nextInt(100);
        }
        System.out.println("Your username: " + username);
    }

    public static void main(String[] args) {

    }
}
