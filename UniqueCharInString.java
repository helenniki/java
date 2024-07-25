// Задача: Подсчет количества уникальных символов в строке
// Напиши программу, которая считает количество уникальных символов
// в заданной строке. Строка может содержать любые символы.

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueCharInString {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        char[] str = scanner.nextLine().toCharArray();

        Set<Character> uniqueChars = new HashSet<>();

        for (char c : str) {
            uniqueChars.add(c);
        }

        System.out.println("Количество уникальных символов: " + uniqueChars.size());
        scanner.close();

    
    }
}
