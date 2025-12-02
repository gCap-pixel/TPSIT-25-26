import java.util.Random;

public class Gestione{
    int casuale;

    public Gestione(){
        Random randomNum = new Random();
        casuale = randomNum.nextInt(100);
        System.out.println(casuale);
        }
    public  boolean verifica(int num){
        if (num == casuale){

            return true;
        }else{
            return false;
        }
    }


}