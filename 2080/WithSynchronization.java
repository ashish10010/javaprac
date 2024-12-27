class Counter {
    int count = 0;

    synchronized void increment() {
        count++;
    }
}

public class WithSynchronization {
    public static void main(String[] args) {
        Counter counter = new Counter();

        // Create two threads
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) counter.increment();
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) counter.increment();
        });

        t1.start();
        t2.start();

        // Wait for threads to finish
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Count: " + counter.count); // Output is consistent (2000)
    }
}
