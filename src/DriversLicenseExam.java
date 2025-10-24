import java.util.Scanner;

public class DriversLicenseExam {
    public void startChecking() {
        char[] userInput = new char[20];
        final int SIZE = 20;
        int correctAnswer = 0;
        int wrongAnswerNumbers;
        final char[] answers = {'B', 'D', 'A', 'A',
                'C', 'A', 'B', 'A',
                'C', 'D', 'B', 'C',
                'D', 'A', 'D', 'C',
                'C', 'B', 'D', 'A'};
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your answers one by one:");
        for (int i = 0; i <= SIZE - 1; i++) {
            System.out.print((i + 1) + ". ");
            userInput[i] = sc.next().toUpperCase().charAt(0);
        }

        for (int i = 0; i <= SIZE - 1; i++) {
            if (answers[i] == userInput[i]) {
                correctAnswer++;
            } else {
                wrongAnswerNumbers = i;
                System.out.println("Wrong " + (i + 1) + ": " + userInput[i] + " Correct: " + answers[i]);
            }
        }

        System.out.println("You got " + correctAnswer + "/" + SIZE);
    }

}
