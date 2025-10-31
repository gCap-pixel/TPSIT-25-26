import javax.sound.midi.SysexMessage;

public class SynchronizedBlockExample {
    private final Object lock = new Object();
    private int count = 0;
    private int exampleCount = 0;

    public void increment() {
        exampleCount++;
        System.out.println("hello " + exampleCount);

        synchronized (lock) {
            count=0;
            while (count<100) {
                count++;
                System.out.println(count);
            }
        }
        System.out.println("fine esecuzione per  thread " + exampleCount);
    }

    public int getCount() {
        return count;
    }
}