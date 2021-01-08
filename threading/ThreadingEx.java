public class ThreadingEx {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("Current thread is " + t);
        t.setName("Ishaq 1");
        System.out.println("Thread after name change " + t);
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
    }
}