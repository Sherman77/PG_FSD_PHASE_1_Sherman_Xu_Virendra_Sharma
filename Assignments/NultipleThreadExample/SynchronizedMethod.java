package NultipleThreadExample;

public class SynchronizedMethod {

    public static void main(String[] args) {
        Line newLine = new Line();

        Train train1 = new Train(newLine);
        Train train2 = new Train(newLine);

        train1.setName("Train 1");
        train2.setName("Train 2");

        train1.start();
        train2.start();
    }
}

class Line {
    synchronized public void getLine() {
        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);

            try {
                Thread.sleep(400);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class Train extends Thread {
    Line line;

    Train(Line line) {
        this.line = line;
    }

    public void run() {
        line.getLine();
    }
}
