import java.util.Arrays;

/*
Дан массив [3, 22, 1, 13, 4, 6, 16, 5], состоящий из целых чисел.

1.Напишите программу, которая выводит (через пробел) те элементы массива, которые являются чётными числами.
2.Напишите программу, которая выводит все двузначные числа массива.
3.Напишите программу, которая выводит на экран наибольшее целое число этого массива.
4.Напишите программу, которая считает сумму элементов массива и выводит её на экран.

5.***Напишите программу, которая переворачивает массив в обратном порядке.
 */
public class Array1 {
    public static void test1 () {
        int[] arr = {3, 22, 1, 13, 4, 6, 102, 16, 5, 0, -2, -11};

        //Пункт 1.
        System.out.println("Задание 1.");
        for (int intInArr : arr) {
            if(intInArr % 2 == 0) {
                System.out.print(intInArr + " ");
            }
        }
        System.out.println();
        System.out.println();

        //Пункт 2.
        System.out.println("Задание 2.");
         for (int intInArr : arr) {
            if(Math.abs(intInArr) / 10 > 0 && Math.abs(intInArr) / 10 < 10) {
                System.out.print(intInArr + " ");
            }
        }
        System.out.println();
        System.out.println();

        //Пункт 3.
        System.out.println("Задание 3.");
        int bigInt = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > bigInt) {
                bigInt = arr[i];
            }
        }
        System.out.println("Самое большое число: " + bigInt);
        System.out.println();

        //Пункт 4.
        System.out.println("Задание 4.");
        int sum = 0;
        for (int i = 1; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println("Сумма: " + sum);
        System.out.println();

        //Пункт 5.
        System.out.println("Задание 5.");
        int[] newArr = new int[arr.length];
        int index = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            newArr[index] = arr[i];
            index++;
        }
        System.out.println(Arrays.toString(newArr));
    }
}
