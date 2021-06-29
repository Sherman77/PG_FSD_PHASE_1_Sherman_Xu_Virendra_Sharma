package NultipleThreadExample;

public class BankAccountExample {

    public static void main(String[] args) {
        final Customer c = new Customer();

        new Thread() {
            public void run() {
                c.withdraw(5000);
            }
        }.start();

        new Thread() {
            public void run() {
                c.withdraw(4000);
            }
        }.start();

        new Thread() {
            public void run() {
                c.withdraw(10000);
            }
        }.start();

        new Thread() {
            public void run() {
                c.deposite(20000);
            }
        }.start();
    }
}


class Customer {
    int amount = 10000;

    synchronized void deposite(int amount) {
        System.out.println(Thread.currentThread().getName() + " Going to deposite");
        this.amount += amount;
        System.out.println("Deposite complete, new balance: " + this.amount);
        notify();
    }

    synchronized void withdraw(int amount) {
        System.out.println(Thread.currentThread().getName() + " Going to withdraw");

        if (this.amount < amount) {
            System.out.println(Thread.currentThread().getName() + " Not enough balance, going to wait");

            try {
                wait();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        this.amount -= amount;
        System.out.println(Thread.currentThread().getName() + " Withdraw completed, new balance: " + this.amount);
    }
}
