import java.util.Scanner;
public class task1 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Введите первое число: ");
        double num1 = scanner.nextDouble();
        
        System.out.println("Введите второе число: ");
        double num2 = scanner.nextDouble();

        System.out.println("Результаты:");
        
        System.out.println("Сложение: " + (num1 + num2));
        System.out.println("Вычитание: " + (num1 - num2));
        System.out.println("Умножение: " + (num1 * num2));
        
        if(num2 != 0){
            System.out.println("Деление: " + (num1 / num2));
        } else {
            System.out.println("Деление на 0 невозможно");
        }
        
        scanner.close();
    }
    
}
