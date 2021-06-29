package OOPExample;

public class AssignmentOne {
}

class Vehicle {
    private int speed;
    private long distance;

    public Vehicle() {
    }

    public Vehicle(int speed, long distance) {
        this.speed = speed;
        this.distance = distance;
    }

    public void run() {
        System.out.println("Vehicle is running");
    }

    public void stop() {
        System.out.println("Vehicle is stopping");
    }

    public void fuel(int amount) {
        System.out.println("Adding " + amount + " galen");
    }

    public void fuel(float amount, String payment) {
        System.out.println("Adding " + amount + " galen with " + payment);
    }

    public void fuel(char c, int amount) {
        System.out.println("Adding " + amount + c);
    }
}

class TwoWheeler extends Vehicle {
    private int speed = 70;
    private long distance = 100000;
    private int nos_of_type = 2;

    public TwoWheeler() {
    }

    public void run() {
        System.out.println("TwoWheeler is running");
    }

    public void stop() {
        System.out.println("TwoWheeler is stopping");
    }

    public void display() {
        System.out.println("TwoWheeler's speed = " + speed);
        System.out.println("TwoWheeler's diatance = " + distance);
        System.out.println("TwoWeeler's nos_of_type = " + nos_of_type);
    }
}

class ThreeWheeler extends Vehicle {

    private int speed = 65;
    private long distance = 75000;
    private int nos_of_type = 3;

    public ThreeWheeler() {
    }

    public void run() {
        System.out.println("ThreeWheeler is running");
    }

    public void stop() {
        System.out.println("ThreeWheeler is stopping");
    }


}
