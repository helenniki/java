// Задача: Нахождение среднего значения массива
// Напиши программу, которая вычисляет среднее значение
// чисел в массиве, введенном пользователем.

import java.util.Scanner;

public class AverageValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество элементов массива: ");
        int len = scanner.nextInt();

        int[] arr = new int[len];

        for(int i = 0; i <= len - 1; i++){
            System.out.print("Введите элемент " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        double res = 0;
        for(int i = 0; i < arr.length; i++){
            res += arr[i];
        }
        double average = res / len;
        System.out.printf("Среднее значение: %.2f%n", average); 
        scanner.close();

    

    

    
    }
}
