import java.util.Scanner;

public class calculyatorIfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        int num1 = scanner.nextInt();

        System.out.println("Введите второе число: ");
        int num2 = scanner.nextInt();

        System.out.println("Введите операцию (+, -, *, /): ");
        String op = scanner.next();

        if(op.equals("+")){
            System.out.println("Результат: " + (num1 + num2));
        } else if(op.equals("-")){
            System.out.println("Результат: " + (num1 - num2));
        } else if(op.equals("*")){
            System.out.println("Результат: " + (num1 * num2));
        } else if(op.equals("/")){
            if(num2 == 0){
                System.err.println("Деление на 0 невозможно!");
            } else {
                System.out.println("Результат: " + ((double)num1 / num2));
            }
        } else {
            System.out.println("Неверная операция!");
        }
scanner.close();
        
    }
    
}

