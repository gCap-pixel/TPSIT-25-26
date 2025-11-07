public class Gara {
    public static void main(String[] args){
        Auto a = new Auto("viola");
        Auto b = new Auto("rosso");
        Thread n = new Thread(a);
        Thread m = new Thread(b);
        n.start();
        m.start();
        }
}