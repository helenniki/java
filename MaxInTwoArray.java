// Задача: Найти максимальный элемент в двумерном массиве
// Напиши программу, которая принимает на вход размеры двумерного массива 
// (количество строк и столбцов), затем запрашивает элементы массива 
// у пользователя и выводит максимальный элемент в этом массиве.

import java.util.Scanner;


public class MaxInTwoArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество строк: ");
        int rows = sc.nextInt();
        System.out.print("Введите количество столбцов: ");
        int columns = sc.nextInt();
        
        int[][] array = new int[rows][columns];
        
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        
        int maxElement = findMaxElement(array);
        System.out.println("Максимальный элемент: " + maxElement);
        
        sc.close();
    }

    public static int findMaxElement(int[][] array) {
        int max = array[0][0]; // Предположим, что первый элемент максимальный
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        return max;
    }
}