package thread;

public class ConcurrencyThread extends Thread{

    public static int amount = 0;

    /**
     * @param args
     * Difficult to identify by which the value of amount incremented
     * concurrency is thread is running in parallel
     */
    public static void main(String[] args) {
        ConcurrencyThread thread = new ConcurrencyThread();
        thread.start();
        System.out.println(amount);
        amount++;
        System.out.println(amount);
    }

    public void run() {
        amount++;
        System.out.println(amount);
        System.out.println("Inside Thread 1");
    }
}
