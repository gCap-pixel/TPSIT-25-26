public class Gara {
    public static void main(String[] args){
        Auto a = new Auto();
        Thread ta = new Thread(a);
        ta.start();
        }
}