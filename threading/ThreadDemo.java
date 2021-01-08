class NewThread implements Runnable {
    Thread t;

    NewThread() {
        t = new Thread(this, "demo thread");
        System.out.println("Child thread");
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Child Thread " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Child interrupted");
        }
        System.out.println("Exitting child thread");
    }
}

class ThreadDemo {
    public static void main(String[] args) {
        NewThread nt = new NewThread();
        nt.t.start();
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Main Thread " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Main Thread interrupted");
        }
        System.out.println("Main Thread Exiting");
    }
}