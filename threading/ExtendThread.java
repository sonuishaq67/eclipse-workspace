class NewThread1 extends Thread {
    NewThread1() {
        super("Demo Thread");
        System.out.println("Child thread" + this);
    }

    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Child thread " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Child Thread interrupted");
        }
        System.out.println("Exiting child thread");
    }
}

public class ExtendThread {
    public static void main(String[] args) {
        NewThread1 nt1 = new NewThread1();
        nt1.start();
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Main Thread " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Main Thread Interrupted");
        }
        System.out.println("Main Thread exitting");
    }
}
