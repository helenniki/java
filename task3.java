import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку: ");
        String str = scanner.nextLine();

        String lowerStr = str.toLowerCase();

        String vowels = "eyuioa";
        int resVowels = 0;
        int resConsonants = 0;

        // Перебор всех символов строки
        for (int i = 0; i < lowerStr.length(); i++) {
            char ch = lowerStr.charAt(i);

            // Проверка, является ли символ буквой
            if (Character.isLetter(ch)) {
                // Проверка, является ли символ гласной
                if (vowels.indexOf(ch) != -1) {
                    resVowels++;
                } else {
                    resConsonants++;
                }
            }
        }

        System.out.println("Количество гласных: " + resVowels);
        System.out.println("Количество согласных: " + resConsonants);

        scanner.close();

        }
    
}
