package PRAC2.Main;

import java.util.Arrays;
import java.util.Random;

public class main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8 ,9, 10};

        int sumFor = 0;
        int sumWhile = 0;
        int sumDoWhile = 0;

        
        for (int i = 0; i < array.length; i++) {
            sumFor += array[i];
        }

        
        int j = 0;
        while (j < array.length) {
            sumWhile += array[j];
            j++;
        }

        
        int jdx = 0;
        do {
            sumDoWhile += array[jdx];
            jdx++;
        } while (jdx < array.length);

        System.out.println("Сумма чисел массива (for): " + sumFor);
        System.out.println("Сумма чисел массива (while): " + sumWhile);
        System.out.println("Сумма чисел массива (do-while): " + sumDoWhile);

        int i = 0;
        for (String arg : args) {
            System.out.println("Аргумент " + (i + 1) + ": " + arg);
            i++;
        }

        for (i = 1; i <= 10; i++) {
            double harmonicNumber = 1.0 / i;
            System.out.println("Число " + i + ": " + harmonicNumber);
            array = generateRandomArray(10); 

            System.out.println("Массив до сортировки: " + Arrays.toString(array));

            Arrays.sort(array); 

            System.out.println("Массив после сортировки: " + Arrays.toString(array));
        }
        

        int number = 13;
        long factorial = calcFactorial(number);

        System.out.println("Факториал числа " + number + ": " + factorial);
    }

    
    public static int[] generateRandomArray(int length) {
        Random random = new Random();
        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt(100); 
        }

        return array;
    }

    public static long calcFactorial(int n) {
        long factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        return factorial;
    }
}
