// Задача: Подсчет слов в строке
// Напиши прогамму которая подсчитывает количество слов
//  в введенной пользователем строке. 
//  Слово — это последовательность символов, разделенных пробелами.
import java.util.Scanner;

public class WordsInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String str = scanner.nextLine().trim();
        String [] strarr = str.split("\\s+");

        int res = strarr.length;

        System.out.println("Количество слов: " + res);
        scanner.close();


    }
}
