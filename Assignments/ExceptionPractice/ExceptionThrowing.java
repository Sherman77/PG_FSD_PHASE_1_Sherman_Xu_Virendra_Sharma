package ExceptionPractice;

import java.io.IOException;
import java.util.Scanner;

public class ExceptionThrowing {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int breadth = scanner.nextInt();
        calculate(length, breadth);
    }

    static private void calculate(int a, int b) {
        try {
            System.out.println(areaFunc(a, b));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    static private int areaFunc(int a, int b) throws IOException {
        int result;
        try {
            return display(a, b);
        } catch (IOException e) {
            throw new IOException(e.getMessage());
        }
    }

    static private int display(int a, int b) throws IOException {
        if (a > b) {
            throw new IOException("Length is greater than breadth");
        }
        return a * b;
    }

}
