// Задача: Поиск максимального элемента в массиве
// Напишите программу на языке Java, которая найдет и выведет на экран максимальный элемент в заданном массиве целых чисел.

import java.util.Random;

public class maxNumInArray {
    public static void main(String[] args) {
      int[] array = new int[10];
      Random random = new Random();
      
      for(int i=0; i<array.length ;i++){
         array[i] = random.nextInt(10);
         }
    int maxNum = array[0];
    for(int i = 1; i < array.length; i++){
    if(array[i] > maxNum){
         maxNum = array[i];
    }
    }
    // Вывод максимального элемента на экран
    System.out.println("Массив:");
    for (int num : array) {
        System.out.print(num + " ");
    }
    System.out.println("\nМаксимальный элемент: " + maxNum);
        
     
    } 
}
