import java.util.Scanner;

public class parityOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число: ");
        int num  = scanner.nextInt();

        if(num % 2 == 0){
            System.out.println("Число четное");
        }
        else {
            System.out.println("Число нечетное");
        }
scanner.close();
    }   
}
