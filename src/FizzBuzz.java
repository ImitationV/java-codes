import java.util.ArrayList;

public class FizzBuzz {
    public void findFizzBuzz(int a) {
        for (int i = 1; i <= a; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    //using Recursion
    ArrayList<Object> arr = new ArrayList<>();
    public void findFizzBuzzRecursion(int a) {

        if (a < 1) {
            for (int i = arr.size()-1; i >= 0; i--) {
                System.out.println(arr.get(i));
            }
            return;
        }
        if (a % 3 == 0 && a % 5 == 0) {
            //System.out.println("FizzBuzz");
            arr.add("FizzBuzz");
        } else if (a % 3 == 0) {
            //System.out.println("Fizz");
            arr.add("Fizz");
        } else if (a % 5 == 0) {
            //System.out.println("Buzz");
            arr.add("Buzz");
        } else {
            arr.add(a);
            //.out.println(a);
        }
        findFizzBuzzRecursion((a - 1));


    }
}
