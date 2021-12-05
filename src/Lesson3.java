import java.util.Scanner;

public class Lesson3 {
    public static void displaysNameAndSumNumber() {
        System.out.println("Ведите имя и число длинной от 2 до 5 цифр");

        Scanner scr = new Scanner(System.in);
        String str = scr.nextLine();
        String[] words = str.split(" ");

        int newInt = Integer.parseInt(words[1].trim());

        if(words[1].length() < 2 || words[1].length() > 5) {
            System.out.println("Вы ввели не корректное число.");
            displaysNameAndSumNumber();
        } else {
            System.out.println("Здравствуйте, " + words[0] + "! Сумма цифр в числе = " + text(summa(newInt)) );
            System.out.println( words[1] );
        }
    }

    public static int summa (int x) {

        if(x / 10 >= 1) {
            int temp = x % 10;
            int rem = x / 10;
            return temp + summa(rem);
        } else {
            return x;
        }
    }

    public static String text (int x){
        switch(x) {
            case(1):
                return "один";
            case(2):
                return "два";
            case(3):
                return "три";
            case(4):
                return "четыре";
            case(5):
                return "пять";
            case(6):
                return "шесть";
            case(7):
                return "семь";
            case(8):
                return "восемь";
            case(9):
                return "девять";
            case(10):
                return "десять";
        }
        return null;
    }
}
