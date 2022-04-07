package Java;

import java.util.Scanner;

public class Fizzbuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How long do you want the Fizzbuzz to be?");
        int length = scanner.nextInt();
        for (int i =1 ; i <= length; i++ ){
            if (i %3 ==0 && i %5==0){
                System.out.println("\"Fizzbuzz\"");
            }else if (i %3 == 0){
                System.out.println("\"Fizz\"");
            }else if (i %5 ==0){
                System.out.println("\"Buzz\"");
            }else {
                System.out.println(i);
            }
        }
    }
}
