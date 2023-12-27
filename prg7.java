import java.util.LinkedList;

class SharedBuffer {
    private LinkedList<Integer> buffer = new LinkedList<>();
    private int capacity = 1;
    private int producedCount = 0;
    private int consumedCount = 0;

    public void produce() throws InterruptedException {
        int value = 0;
        while (producedCount < 5) {
            synchronized (this) {
                while (buffer.size() == capacity) {
                    wait();
                }

                System.out.println("Producer produced: " + value);
                buffer.add(value++);
                producedCount++;
                notify();

                Thread.sleep(1000);
            }
        }
    }

    public void consume() throws InterruptedException {
        while (consumedCount < 5) {
            synchronized (this) {
                while (buffer.isEmpty()) {
                    wait();
                }

                int consumedValue = buffer.removeFirst();
                System.out.println("Consumer consumed: " + consumedValue);
                consumedCount++;
                notify();

                Thread.sleep(1000);
            }
        }
    }
}

public class prg7 {
    public static void main(String[] args) {
        SharedBuffer sharedBuffer = new SharedBuffer();

        Thread producerThread = new Thread(() -> {
            try {
                sharedBuffer.produce();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread consumerThread = new Thread(() -> {
            try {
                sharedBuffer.consume();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        producerThread.start();
        consumerThread.start();
    }
}
