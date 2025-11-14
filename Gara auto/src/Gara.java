import java.util.ArrayList;

public class Gara {
    public static void main(String[] args) {
                Auto a=new Auto("Rossa");
                Auto a1=new Auto("Blu");
                Auto a2=new Auto("Verde");
                ArrayList<Auto> macchine=new ArrayList<Auto>();
                macchine.add(a1);
                macchine.add(a2);
                macchine.add(a);
        Gestione gara = new Gestione(macchine, 100); // distanza vittoria
        gara.start();
        }


    }

