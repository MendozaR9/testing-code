package Java;

import java.util.Locale;
import java.util.Scanner;

public class RockPaperScissor {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Pick Rock, Paper, or Scissors");
        String choice = scanner.nextLine();
        rps(choice);
    }

    public static void rps(String playerChoice){
        String choice = playerChoice.toLowerCase(Locale.ROOT);
        String [] cpu =   {"rock", "paper", "scissors"};
        int randomNum = (int)(Math.random()* cpu.length);
        System.out.println("You have picked "+ choice+ " and the CPU picked "+ cpu[randomNum]);
        if (choice.equals(cpu[randomNum])){
            System.out.println("Draw!");
        }else if (choice.equals("rock") && cpu[randomNum].equals("scissors") || choice.equals("paper") && cpu[randomNum].equals("rock")
                || choice.equals("scissors") && cpu[randomNum].equals("paper")) {
            System.out.println("You win!");
        }else if (cpu[randomNum].equals("rock") && choice.equals("scissors") || cpu[randomNum].equals("paper") && choice.equals("rock")
                || cpu[randomNum].equals("scissors") && choice.equals("paper")) {
            System.out.println("You have lose!");
    }else {
            System.out.println(choice + " is not a valid input");
        }
        System.out.println("do you want to play again?(y/n)");
       String yesNo = scanner.nextLine();
               if(yesNo.equals("y")||yesNo.equals("Y")){
                   System.out.println("Pick Rock, Paper, or Scissors");
                   String newChoice = scanner.nextLine();
                   rps(newChoice);
               }else {
                   System.out.println("Good Bye!");
                   System.exit(0);
               }
}
}
