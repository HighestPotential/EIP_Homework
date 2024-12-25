package n;

public class Main {
    int balance = 0;

    synchronized void deposit(int amount) {
        balance += amount;
    }

    synchronized void withdraw(int amount) {
        balance -= amount;
    }

    synchronized void transferTo(Main destAcc, int amount) {
        this.withdraw(amount);
        destAcc.deposit(amount);
    }

    public static void main(String[] args) throws InterruptedException {
        Main account1 = new Main();
        Main account2 = new Main();

        // Initialize balances
        account1.balance = 1000;
        account2.balance = 1000;

        // Thread 1: Transfer from account1 to account2
        Thread thread1 = new Thread(() -> account1.transferTo(account2, 100));

        // Thread 2: Transfer from account2 to account1
        Thread thread2 = new Thread(() -> account2.transferTo(account1, 200));

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.print("dfadsfasdf");
    }
}
