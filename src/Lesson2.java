import java.util.Arrays;
import java.util.Scanner;
/*
   С клавиатуры вводится двумерный массив, длина его строк – 4, столбцов – 3.

   1. Напишите программу, которая выводит номера строк и суммы их элементов (пример: Line 2: 17).
   2. Напишите программу, которая выводит номера столбцов и суммы их элементов (пример: Column 3: 21).
   3. Напишите программу, которая заменяет все нечётные элементы массива на 1, а чётные на 0 и выводит его на экран.
   4. Напишите программу, которая в каждой строке находит целое среднее арифметическое и выводит его на экран.

   5.***Напишите программу, которая преобразует двумерный массив в перевёрнутый одномерный и выводит все элементы одномерного массива на экран.
    */

public class Lesson2 {
    public static void test2() {

        Scanner scr = new Scanner(System.in);

        int[][] arr = new int[4][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = scr.nextInt();
            }
        }

        // Задание 1.
        int sumLine;
        System.out.println("Задание 1.");
        for (int i = 0; i < arr.length; i++) {
            sumLine = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sumLine += arr[i][j];
                if (j == arr[i].length - 1) {
                    System.out.println("Line " + (i + 1) + ": " + sumLine);
                }
            }
        }
        System.out.println();

        // Задание 2.
        int sumColumn;
        System.out.println("Задание 2.");
        for (int i = 0; i < arr[i].length; i++) {
            sumColumn = 0;
            for (int j = 0; j < arr.length; j++) {
                sumColumn += arr[j][i];
                if (j == arr.length - 1) {
                    System.out.println("Column " + (i + 1) + ": " + sumColumn);
                }
            }
        }
        System.out.println();

        // Задание 3.
        int[][] arr2 = new int[4][3];
        System.out.println("Задание 3.");
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                if (arr[i][j] % 2 != 0) {
                    arr2[i][j] = 1;
                } else {
                    arr2[i][j] = 0;
                }
            }
        }
        System.out.println(Arrays.deepToString(arr));
        System.out.println(Arrays.deepToString(arr2));
        System.out.println();

        // Задание 4.
        int average;
        System.out.println("Задание 4.");
        for (int i = 0; i < arr.length; i++) {
            average = 0;
            for (int j = 0; j < arr[i].length; j++) {
                average += arr[i][j];
                if (j == arr[i].length - 1) {
                    average /= arr[i].length;
                    System.out.println("Average in line " + (i + 1) + ": " + average);
                }
            }
        }
        System.out.println();

        // Задание 5.
        int lengthNewArr = arr.length * arr[0].length;
        int[] newArr = new int[lengthNewArr];
        System.out.println("Задание 5.");
        for (int a = 0; a < lengthNewArr - 1; ) {
            for (int i = arr.length - 1; i >= 0; i--) {
                for (int j = arr[i].length - 1; j >= 0; j--) {
                    newArr[a] = arr[i][j];
                    a++;
                }
            }
        }
        System.out.println("Двумерный массив: " + Arrays.deepToString(arr));
        System.out.println("Перевёрнутый одномерный массив: " + Arrays.toString(newArr));
    }
}
