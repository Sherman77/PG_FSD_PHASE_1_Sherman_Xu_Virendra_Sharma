package OOPExample;

public class InterfaceExample implements Shape, Drawable {
    int salary = 900;

    public void draw() {
        System.out.println("inside draw()");
    }

    public void shape() {
        System.out.println("inside shape()");
    }

    public void show() {
        System.out.println("insie show()");
    }

    public static void main(String args[]) {
        InterfaceExample obj = new InterfaceExample();
        obj.shape();
        obj.show();
        obj.draw();

        Shape d = new InterfaceExample();
        System.out.println(d.salary);
    }
}


interface Drawable {
    int salary = 100;

    void draw();

    void show();
}

interface Shape {
    int salary = 200;

    void shape();

    void show();
}

interface Demo extends Shape {

}

