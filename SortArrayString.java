// Задача: Сортировка массива строк по длине
// Напиши программу, которая принимает на вход
// массив строк и сортирует его по длине строк в порядке возрастания.

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class SortArrayString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество строк: ");
        int len = sc.nextInt();
        sc.nextLine();
        String[] arr = new String[len];

    

        for(int i = 0; i < len; i++){
            System.out.println("Введите строку " + (i+1) + ": ");
            arr[i] = sc.nextLine();
        }


       Arrays.sort(arr, Comparator.comparingInt(String::length));

        System.out.println("Отсортированный массив строк:");
        for (String str : arr) {
            System.out.println(str);
        }

        sc.close();
    }
}
