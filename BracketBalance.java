// Задача: Проверка баланса круглых скобок
// Напиши программу, которая проверяет, сбалансированы ли круглые скобки
// в заданной строке. Строка содержит только круглые скобки ( и ).

import java.util.Scanner;

public class BracketBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        char[] str = scanner.nextLine().toCharArray();

        int res = 0;
        boolean balanced = true;

        for (int i = 0; i < str.length; i++) {
            if (str[i] == '(') {
                res += 1;
            } else if (str[i] == ')') {
                res -= 1;
                if (res < 0) {
                    balanced = false;
                    break;
                }
            }
        }

        if (res == 0 && balanced) {
            System.out.println("Скобки сбалансированы.");
        } else {
            System.out.println("Скобки не сбалансированы.");
        }
        scanner.close();

    }
}
