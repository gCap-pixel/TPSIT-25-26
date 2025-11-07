import java.util.Random;


public class Auto  extends Thread {
    private String colore;
    private int metriPercorsi = 0;
    private Random random = new Random();
    private boolean inGara = true;

    public Auto(String colore) {
        this.colore = colore;
    }

    public String getColore() {
        return colore;
    }

    public int getMetriPercorsi() {
        return metriPercorsi;
    }

    @Override
    public void run(){
        while (inGara){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
               System.out.println("errore");
            }
            int passo = random.nextInt(10) + 1; // tra 1 e 10 metri
            metriPercorsi += passo;
            System.out.println("macchina "+colore+" ha fatto "+passo+" metri!");
            System.out.println ("macchina "+colore+" ha percorso in totale "+getMetriPercorsi());

            if (metriPercorsi>=50){
                inGara=false;
                System.out.println("macchina di colore "+colore+" vince la gara!!");
            }
        }
    }
}