// Задача: Проверка палиндрома
// Напишите программу на языке Java, которая проверяет, является ли введенная
// пользователем строка палиндромом. Палиндром — это слово, фраза или другая 
// последовательность символов, которая читается одинаково как в прямом, 
// так и в обратном порядке (например, "level", "radar").

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку: ");
        String str = scanner.nextLine();
        
        String lowerStr = str.toLowerCase();
        
        StringBuilder sb = new StringBuilder(lowerStr);
        String reversedStr = sb.reverse().toString();

        if(lowerStr.equals(reversedStr)) {
            System.out.println("Строка является палиндромом.");
        } else {
            System.out.println("Строка не является палиндромом.");
        }

        scanner.close();
    }
}
