// Задача: Проверка на анаграмму
// Напиши программу, которая проверяет, являются ли две введенные строки анаграммами. 
// Анаграммы — это слова или фразы, составленные из одних и тех же букв в разном порядке 
// (игнорируя пробелы, регистр и знаки препинания).

import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecking {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первую строку: ");
        String str1 = scanner.nextLine().toLowerCase().replaceAll("[^a-z]", "");

        System.out.print("Введите вторую строку: ");
        String str2 = scanner.nextLine().toLowerCase().replaceAll("[^a-z]", "");

        if (isAnagram(str1, str2)) {
            System.out.println("Строки являются анаграммами.");
        } else {
            System.out.println("Строки не являются анаграммами.");
        }

        scanner.close();
    }

    public static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);


    }
}
