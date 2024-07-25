// Задача: Проверка на простое число
// Напиши программу, которая принимает целое число и определяет, является ли оно простым.
// Простое число — это число больше 1, которое не имеет делителей, кроме 1 и самого себя.

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = scanner.nextInt();

        boolean prime = true;


        for(int i = 2; i <= Math.sqrt(num); i++){
            if (num % i == 0) {
                prime = false;
                break;

            }
            
        }
        if(prime){
            System.out.println("Число " + num + " является простым.");
        }
        else{
            System.out.println("Число не " + num + " является простым.");
        }
        scanner.close();

    

    
    }
}
