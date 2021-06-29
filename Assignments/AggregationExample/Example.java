package AggregationExample;

public class Example {
    Operation op;
    double pi = 3.14;

    double area(int radius) {
        op = new Operation();
        int rSquare = op.square(radius);
        return pi * rSquare;
    }

    double area(double length) {
        op = new Operation();
        return op.square((int) length);
    }

    double area(int length, int width) {
        op = new Operation();
        return Math.sqrt(op.square(length) * op.square(width));
    }
}

class Operation {
    int square(int n) {
        return n * n;
    }
}
