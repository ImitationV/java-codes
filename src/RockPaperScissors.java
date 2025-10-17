import java.security.SecureRandom;
import java.util.Scanner;

public class RockPaperScissors {
    String[] possibility = {"Rock", "Paper", "Scissor"};
    int points = 0;
    int counter = 0;

    public void runRPS() {
        String userInput = "";
        String cpuInput = "";
        Scanner sc = new Scanner(System.in);
        SecureRandom secureRandom = new SecureRandom();
        do {
            System.out.println("\nRock Paper Scissor Shoot! (q to quit)");
            userInput = sc.next();
            if (userInput.equalsIgnoreCase("q")) {
                System.out.println("Your Point: " + points);
                System.out.println("Rounds played: " + counter);
                System.out.println("Exit successfully :)");
                break;
            }
            cpuInput = possibility[secureRandom.nextInt(3)];
            System.out.println("CPU: " + cpuInput);
            points = checkResult(userInput, cpuInput, points);
            counter++;
        }
        while (!userInput.equalsIgnoreCase("q"));
    }

    public int checkResult(String user, String cpu, int point) {

        if (user.equalsIgnoreCase("Rock") && cpu.equalsIgnoreCase("Paper")) {
            System.out.println("CPU wins!");
        } else if (user.equalsIgnoreCase("Rock") && cpu.equalsIgnoreCase("Scissor")) {
            System.out.println("You Win!");
            points++;
        } else if (user.equalsIgnoreCase("Paper") && cpu.equalsIgnoreCase("Rock")) {
            System.out.println("You Win!");
            points++;
        } else if (user.equalsIgnoreCase("Paper") && cpu.equalsIgnoreCase("Scissor")) {
            System.out.println("CPU wins");
        } else if (user.equalsIgnoreCase("Scissor") && cpu.equalsIgnoreCase("Rock")) {
            System.out.println("CPU wins");
        } else if (user.equalsIgnoreCase("Scissor") && cpu.equalsIgnoreCase("Paper")) {
            System.out.println("You Win!");
            points++;
        } else {
            System.out.println("Tie. No points");
        }
        return points;

    }
}