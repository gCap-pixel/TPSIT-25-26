
public class GiocaNumeri {
    ;
    public static void main(String[] args) {

        System.out.println("inizio del gioco");
        Gestione gm = new Gestione();
        Giocatore g1 = new Giocatore("mario", gm);
        g1.start();
        //Giocatore g2 = new Giocatore("luigi");
        //g2.start();

        try {
            g1.join();
        } catch (InterruptedException e) {
            System.err.println("ERRORE");
        }
        //try {
            //g2.join();
        //} //catch (InterruptedException e) {
            //System.err.println("ERRORE");
        //}
        System.out.println("fine gioco");
    }

}