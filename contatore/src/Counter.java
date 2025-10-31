public class Counter {
    private int count = 0;


    public synchronized void increment() {
       for(int i=0; i<1000;i++){
        count++;
        System.out.println("thread: " + count);
    }
       }

    public int getCount() {
        return count;
    }

}
