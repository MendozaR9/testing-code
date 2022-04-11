package Java;

import java.util.Random;
import java.util.Scanner;

public class ConsoleAdventureGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Do You Want to play the game? (Y/N):");
        String conformation = scanner.nextLine() ;

        if (conformation.equalsIgnoreCase("y")) {

            System.out.println("Please Enter You're name: ");
            //player
            String playerName = scanner.nextLine();

            int playerHp = 100;
            int playerAttack = 25;
            int potionAmmount = 3;
            int healAmount = 30;
            //enemy
            String [] enemys = {"Slime", "Skeleton", "Zombie", "Goblin"};
            int maxEnemyHp = 85;
            int maxEnemyAttack = 40;
            System.out.println("Hello "+ playerName+"\n");


            System.out.println("-------------------------------------------");
            int enemyHp = rand.nextInt(maxEnemyHp);
            int enemyAttack = rand.nextInt(maxEnemyAttack);
            String enemy = enemys[rand.nextInt(enemys.length)];
            System.out.println("\t"+enemy+" has appear!");

            do {
                System.out.println();
                System.out.println("\tYour Hp:"+playerHp);
                System.out.println("\t"+enemy+"'s Hp:"+ enemyHp);
                System.out.println("\tWhat Would You like to do");
                System.out.println("\t[1] Attack [2]use a potion [3]Run");

                String input = scanner.nextLine();
                System.out.println(input);
                if (input.equals("1")){
                   enemyHp -= playerAttack;
                   playerHp -= enemyAttack;
                    System.out.println("\tYou Attack!");
                    System.out.println("\t"+enemy+" Takes "+ playerAttack+" damage");
                    System.out.println();
                    if (enemyHp < 1){
                        System.out.println("\tThe "+ enemy+" has been defeated!");
                        break;
                    }
                    System.out.println("\tThe Enemy Attacks!");
                    System.out.println("\tYou Take "+ enemyAttack+" damage");
                    if (playerHp< 1){
                        System.out.println();
                        System.out.println("\tYou have taken to much damage!");
                        break;
                    }
                }
                else if (input.equals("2")){
                    if (potionAmmount > 0){
                        playerHp += healAmount;
                    potionAmmount--;
                        System.out.println("\tYou have drank a health potion");
                        System.out.println("\tYou heal for "+healAmount+" HP");
                        System.out.println("\tYou have "+potionAmmount+" potions left");
                    }
                    else {
                        System.out.println("\tYou do not have any potions!");
                    }
                }
                else if (input.equals("3")){
                    int runchance = rand.nextInt(100);
                    if (runchance <= 25){
                        System.out.println("\tYou Run like the Coward That you are!");
                        break;
                    }else {
                        System.out.println("\tYou could not Run away");
                    }

                }
                else {
                    System.out.println("\tInvalid Command");
                }
                System.out.println();
            }while (enemyHp>0);
            System.out.println("-------------------------------------------");
            System.out.println("\tYou have "+playerHp+" Hp Left");
            System.out.println("\tThe "+enemy+" Dropped an item");
            System.out.println("\tYou Got a Health Potion");
            potionAmmount++;
            System.out.println("-------------------------------------------");
            System.out.println("\tWhat Would you like to do?");

        }
        else {
            System.out.println("bye");
        }


    }
}