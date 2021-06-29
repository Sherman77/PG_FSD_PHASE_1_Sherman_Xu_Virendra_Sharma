package OOPExample;

public class AbstractExample {

    public static void main(String[] args) {
        Infosys h = new Hello();
        h.fun1();
        h.fun2();

        Hello h2 = new Hello();
        h2.fun3();
    }
}

abstract class MNC {
    public MNC() {
    }

    abstract void fun1();

    abstract void fun2();
}

abstract class Infosys extends MNC {
    void fun1() {
        System.out.println("We are in Infosys fun1");
    }


}

class Hello extends Infosys {

    void fun1() {
        super.fun1();
        System.out.println("We are in Hello fun1");
    }

    void fun2() {
        System.out.println("We are in Hello fun2");
    }

    void fun3() {
        System.out.println("We are in Hello fun3");
    }
}
