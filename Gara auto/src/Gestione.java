import java.util.ArrayList;

public class Gestione extends Thread {
    private ArrayList<Auto> macchine;
    private  Auto a;
    private int distanzaArrivo;

    public Gestione(ArrayList<Auto> macchine, int distanzaArrivo) {
        this.macchine = macchine;
        this.distanzaArrivo = distanzaArrivo;
    }


    @Override
    public void run() {
        System.out.println("La gara inizia!");
        for (Auto a : macchine) {
            a.start();
        }

        Auto vincitore = null;
        boolean garaFinita = false;

        while (garaFinita != true) {
            for (Auto a : macchine) {
                if (a.getMetriPercorsi() >= distanzaArrivo) {
                    vincitore = a;
                    garaFinita = true;
                }
            }

            try {
                Thread.sleep(200); // controllo dei metri
            } catch (InterruptedException e) {
                System.out.println("errore");
            }
        }

        // ferma tutte le auto
        for (Auto a : macchine) {
            a.terminaGara();
        }

        System.out.println("Vince la macchina " + vincitore.getColore()+ "!!!");
    }
}
