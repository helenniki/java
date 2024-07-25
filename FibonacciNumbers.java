// Задача: Числа Фибоначчи
// Напиши программу, которая выводит первые N чисел Фибоначчи.
// Числа Фибоначчи — это последовательность, в которой каждое число 
// является суммой двух предыдущих. Начинается последовательность с чисел 0 и 1.

import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество чисел Фибоначчи для вывода: ");
        int N = scanner.nextInt();

        int n0 = 0;
        int n1 = 1;
        int n2;

        System.out.print(n0+" "+n1+" ");

        for(int i = 3; i <= N; i++){
            n2=n0+n1;
			System.out.print(n2+" ");
			n0=n1;
			n1=n2;
		}
		System.out.println();
        scanner.close();

        }
    }

