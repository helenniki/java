import java.util.Scanner;

public class symbolFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String str = scanner.nextLine();

        String lowerStr = str.toLowerCase();

        int[] charCounts = new int[256];

    for(int i = 0; i < lowerStr.length(); i++){
        char c = lowerStr.charAt(i);
        charCounts[c]++;

    }
    System.out.println("Частота символов:");
    for (int i = 0; i < charCounts.length; i++) {
        if (charCounts[i] > 0) {
        System.out.println((char)i + ": " + charCounts[i]);
        }
    }
    scanner.close();
    }
}
