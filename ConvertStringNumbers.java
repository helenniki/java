// Задача: Преобразование строки с числами
// Напиши программу, которая принимает строку, 
// содержащую числа, разделенные пробелами, 
// и преобразует её в массив целых чисел. 
// Затем программа должна вывести этот массив и сумму всех чисел в массиве.

import java.util.Arrays;
import java.util.Scanner;

public class ConvertStringNumbers {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку с числами, разделенными пробелами: ");
        String str = scanner.nextLine();
        String[] strarr = str.split(" ");

        int[] array = new int[strarr.length];

        for(int i = 0; i < strarr.length; i++){
            array[i] = Integer.parseInt(strarr[i]);
        }
        int res = 0;

        for(int i = 0; i < array.length; i++){
            res += array[i];
        }

        System.out.println("Массив: " + Arrays.toString(array));
        System.out.println("Сумма чисел: " + res);
        scanner.close();
    }
}
