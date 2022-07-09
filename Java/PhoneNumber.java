package Java;

import java.util.Scanner;

public class PhoneNumber {
   static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Give a number that is 7 or 10 digits: ");
        String number = scanner.nextLine();
        System.out.println(properNumber(number));
    }

    public static String properNumber(String number){
        String num1;
        String num2;
        String num3;
        if (number.length() == 10){
            num1="("+number.substring(0,3)+")-";
            num2=number.substring(3,7)+"-";
            num3=number.substring(7,10);
            return num1+num2+num3;
        }else if (number.length()==7){
            num1="("+number.substring(0,3)+")-";
            num2=number.substring(3,7);
            return num1+num2;
        }
        System.out.println("That is not a valid number");
        return number;
    }
}
