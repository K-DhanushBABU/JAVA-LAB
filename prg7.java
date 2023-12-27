
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.LinkedList;

class SharedBuffer {
    private LinkedList<Integer> buffer = new LinkedList<>();
    private int capacity = 5;
    private int producedCount = 0;
    private int consumedCount = 0;

    public void produce() throws InterruptedException {
        int val = 0;
        while (producedCount < 5) {
            synchronized (this) {
                while (buffer.size() == capacity)
                    wait();

                System.out.println("Produced Producer " + val);
                buffer.add(val++);
                producedCount++;
                notify();

                Thread.sleep(1000);
            }
        }
    }

    public void consume() throws InterruptedException {

        while (consumedCount < 5) {
            synchronized (this) {
                while (buffer.isEmpty())
                    wait();

                int removedvalue = buffer.removeFirst();
                System.out.println("consumer consumed " + removedvalue);

                consumedCount++;
                notify();

                Thread.sleep(1000);
            }
        }
    }

}

public class prg7 {

    public static void main(String[] args) {
        SharedBuffer sharedbuffer = new SharedBuffer();

        Thread producethread = new Thread(() -> {
            try {
                sharedbuffer.produce();
            } catch (InterruptedException e) {
                e.printStackTrace();

            }
        });

        Thread consumethread = new Thread(() -> {
            try {
                sharedbuffer.consume();
            } catch (InterruptedException e) {
                e.printStackTrace();

            }
        });

        producethread.start();
        consumethread.start();

    }
}