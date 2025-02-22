import java.util.Scanner;

public class CalculatorChoiceOp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите операцию:");
        System.out.println("1. Сложение");
        System.out.println("2. Вычитание");
        System.out.println("3. Умножение");
        System.out.println("4. Деление");
        System.out.print("Ваш выбор: ");
        int choice = scanner.nextInt();

        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble();

        System.out.print("Введите второе число: ");
        double num2 = scanner.nextDouble();

        double result = 0;
        boolean validOperation = true;

        switch (choice) {
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Ошибка: Деление на ноль невозможно.");
                    validOperation = false;
                }
                break;
            default:
                System.out.println("Ошибка: Неверный выбор операции.");
                validOperation = false;
                break;
        }

        if (validOperation) {
            System.out.println("Результат: " + result);
        }

        scanner.close();
    }
}
