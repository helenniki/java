import java.util.Scanner;

public class CoupString {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str = scanner.nextLine();

        String res = "";

        for(int i = str.length() -1; i >= 0; i--){
            res += str.charAt(i);

        }
        System.out.println("Перевернутая строка: " + res);
        scanner.close();
    }
}
