package NultipleThreadExample;

public class MultipleThreadExample extends Thread {

    public void run() {

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Current thread's name is: " + Thread.currentThread().getName());
        System.out.println("Current thread's state is: " + Thread.currentThread().getState());
        System.out.println("Current thread's priority is: " + Thread.currentThread().getPriority());
        System.out.println("Current thread's group is: " + Thread.currentThread().getThreadGroup());
        System.out.println("Current alive or not? " + Thread.currentThread().isAlive());
        System.out.println("Is current thread's ID is: " + Thread.currentThread().getId());
        System.out.println("Is current thread Deamon or not? " + Thread.currentThread().isDaemon());
    }

    public static void main(String[] args) {
        MultipleThreadExample t1 = new MultipleThreadExample();
        MultipleThreadExample t2 = new MultipleThreadExample();
        MultipleThreadExample t3 = new MultipleThreadExample();
        MultipleThreadExample t4 = new MultipleThreadExample();

        t1.setName("First Thread");
        t2.setName("Second Thread");
        t3.setName("Third Thread");
        t4.setName("Fourth Thread");

        t1.setPriority(MAX_PRIORITY);
        t2.setPriority(MIN_PRIORITY);
        t3.setPriority(NORM_PRIORITY);
        t4.setPriority(NORM_PRIORITY);

        t1.setDaemon(true);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }

}
