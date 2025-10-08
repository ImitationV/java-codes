import java.util.Scanner;

public class SumOfCube {
    public void findCubes(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first digit: ");
        double firstNumber = sc.nextDouble();
        System.out.print("Enter second digit: ");
        double secondNumber = sc.nextDouble();
        sc.close();
        double result = Math.pow(firstNumber,3)+Math.pow(secondNumber,3);
        System.out.printf("Result: %.2f",result);
    }
    public static void main(String[] args) {

    }
}
