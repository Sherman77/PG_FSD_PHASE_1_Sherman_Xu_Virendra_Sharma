package InnerClass;

public class Member_Inner {
    private int data = 30;

    void display() {
        System.out.println("I am inside the outer class method");
    }

    class Inner {
        private int data = 20;

        void msg() {
            System.out.println("data is " + data);
        }

        void display() {
            System.out.println("I am inside the inner class method");
        }
    }

    public static void main(String args[]) {
        Member_Inner outter = new Member_Inner();
        Member_Inner.Inner inner = outter.new Inner();

        inner.msg();
        inner.display();
    }
}
