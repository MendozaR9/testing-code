package Java;

import java.util.Arrays;
import java.util.Random;

public class AdvantageNumber {
    public static void main(String[] args) {
        String [] Anum = new String[6];
        for (int i = 0; i < Anum.length; i++) {
            if (randomChoice() == 0){
                char letter = randomLetter();
                if (letter != 'T' && i ==0){
                    Anum[i]= String.valueOf(notT());
                }else {
                    Anum[i]= String.valueOf(letter);
            }
            }else {
                Anum[i]= String.valueOf(randomNum());
            }

        }
        System.out.println(String.join("",Anum));
    }

    public static int randomChoice(){
        Random r = new Random();
        return r.nextInt(2);
    }

    public static int randomNum(){
        Random r = new Random();
        return  r.nextInt(10);
    }

    public static char randomLetter(){
        Random r = new Random();
        char c = (char)(r.nextInt(26)+'a');
        return Character.toUpperCase(c);
    }

    public static char notT(){
        char notT = randomLetter();
        if(notT == 'T'){
           return notT();
        }else {
            return notT;
        }
    }
}
