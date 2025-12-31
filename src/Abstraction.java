// 01 - ABSTRACTION
//Goal: Create a hierarchy for basic geometric shapes using an abstract class.

import com.sun.source.tree.NewArrayTree;

import java.sql.SQLOutput;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

abstract class Shape {
    String color = "red";

    public String getColor() {
        return color;
    }

    abstract double calculateArea();

    abstract void displayInfo();
}

class Circle extends Shape {
    int r = 5;

    public double calculateArea() {
        return Math.PI * r * r;
    }

    public void displayInfo() {
        System.out.println("Area of circle is : " + calculateArea());
    }
}

//02 - INTERFACE
//Goal: Use an interface to define a common capability for unrelated classes.
interface Drivable {
    void startEngine();
    void accelerate(int speed);

}

class Cars implements Drivable {
    public void startEngine() {
        System.out.println("Vroom Vrooom!!");
    }

    @Override
    public void accelerate(int speed) {
        System.out.println("Speed increasing ..." + " 5... 10... 15...");
    }
}

class MotorCycle implements Drivable {
    public void startEngine() {
        System.out.println("Engine Roar!!");
    }

    @Override
    public void accelerate(int speed) {
        System.out.println("Speed increasing ..." + " 3... 9... 15...");
    }

}

//03 - Enforcing Abstract
//Goal: Demonstrates when a subclass must be abstract itself.
abstract class Worker {
    abstract void performDuty();

    abstract int getSalary();
}

abstract class HourlyWorker extends Worker {
    public int getSalary() {
        return 15;
    }
}

class Cashier extends HourlyWorker {
    void performDuty() {
        System.out.println("Get to work cashiers!");
    }
}

//04 - Combining Abstract Class and Interface
//Goal: Use both constructs to manage a complex application component.
interface Loggable {
    abstract void logMessage(String message);
}

abstract class NetworkService implements Loggable {
    void connect() {
        System.out.println("Connecting to server...");
    }

    public void logMessage(String message) {
        String formattedDateTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println(formattedDateTime + " - " + message);
    }

    abstract void sendData(byte[] data);

}

class SecureTransfer extends NetworkService {
    public void sendData(byte[] data) {
        System.out.println("Sending encrypted data...");
    }
}

//05 - Interface Constants
//Goal: Utilize the implicit public static final nature of interface variables.
interface Configuration {
    int MAX_USERS = 50;
    String DEFAULT_PROTOCOL = "TCP";

}
class AppManager implements Configuration{
    public void checkLimit(int currentUsers){
        boolean limit = currentUsers > MAX_USERS;
        System.out.println("Exceeds user limit: "+ limit);

    }
}

public class Abstraction {
    public static void main(String[] args) {
        //01 - abstract
        Circle c = new Circle();
        c.calculateArea();
        c.displayInfo();

        //02 - interface
        Cars cr = new Cars();
        MotorCycle mc = new MotorCycle();
        Drivable[] arr = {cr, mc};
        for (Drivable i : arr) {
            i.startEngine();
        }

        //03 - Enforcing Abstract
        //HourlyWorker hw = new HourlyWorker();
        Cashier cash = new Cashier();
        cash.performDuty();
        System.out.println(cash.getSalary());


        //04 - Combining Abstract Class and Interface
        SecureTransfer st = new SecureTransfer();
        st.connect();
        st.sendData(new byte[]{1, 2, 3});
        st.logMessage("sent");

        //05 - Interface Constants
        AppManager appM = new AppManager();
        System.out.println(Configuration.DEFAULT_PROTOCOL);
        appM.checkLimit(45);
    }

}

