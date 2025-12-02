import java.util.Scanner;

public class Giocatore extends Thread {
    private String nome;
    private int punteggio;
    public Integer numero;
    Gestione gm;

    public Giocatore(String nome, Gestione gm){
        this.nome=nome;
        this.punteggio=0;
        this.gm=gm;
    }

    private void gioca(){
        System.out.println("inserisci numero da gioare");
        Scanner sc = new Scanner(System.in);
        Integer numero= Integer.parseInt(sc.nextLine());
        if (gm.verifica(numero)){
            System.out.println("numero indovinato");
            punteggio=punteggio+1;
        }
        else{System.out.println("numero errato");}
    }
    private void comunica(){
        System.out.println("sono il giocatore " + nome + " con il punteggio di " + punteggio);
    }

    public void run(){
    gioca();
    comunica();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.err.println("ERRORE NELLO SLEEPING");
        }
    }
}