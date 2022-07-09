package Java;

import java.util.Scanner;

public class ConsoleAdventure {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Do You Want to play the game? (Y/N):");
        String conformation = scanner.next();
        if (conformation.equalsIgnoreCase("y")) {

            System.out.print("Please Enter You're name: ");
            String playerName = scanner.next();
            int playerHp = 50;
            int playerAttack = 5;
            int postionAmmount = 3;
            int healAmount = playerHp / 4;
            stats(playerName, playerHp, playerAttack);
            postions(postionAmmount);
            System.out.println();
            System.out.println(playerName +" Encounters a Slime!");
            System.out.println();
            stats("Slime", slime(0)[0], slime(0)[1]);
            System.out.println();
            prompt();


        }else {
            System.out.println("bye");
        }
    }
    public static void stats(String name, int hp, int attack){
        System.out.println("--------Stats--------");
        System.out.println("|  name: "+name+"   |");
        System.out.println("|  Hp:   "+hp+"     |");
        System.out.println("| Attack: "+attack+"    |");


    }
    public static void postions(int postion){
        System.out.println("| Potions: " + postion + "    |");
    }

    public static int[] slime(int hpLose){
        int[] stats = new int[2];
        stats[0]= 25-hpLose; /*hp*/
        stats[1]= 2;   /*Attack*/
        return stats;
    }

    public static void prompt(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What do you want to do?");
        System.out.println("[1]Attack [2]heal  [3]Run");
        int playerChoice = scanner.nextInt();
        if (playerChoice == 1){
            System.out.println("slime takes 5 damage");
            stats("slime", slime(5)[0], slime(0)[1]);
            System.out.println();
            stats("slime", slime(0)[0], slime(0)[1]);
        }
    }
}

