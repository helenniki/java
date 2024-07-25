import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int num  = scanner.nextInt();

        int res = 1;
        for(int i = num; i != 0; i--){
            res *= i;
        }

        System.out.print("Факториал числа " + num + " = " + res );
        scanner.close();
    }
    
}
