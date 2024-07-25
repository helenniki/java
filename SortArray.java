// Задача: Сортировка массива
// Напиши программу, которая сортирует массив целых чисел по возрастанию.
import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] array = {2, 4, 7, 1, 3, 8, 5, 6, 9};

        // Пузырьковая сортировка
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Обмен элементов
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        // Вывод отсортированного массива
        System.out.println("Отсортированный массив: " + Arrays.toString(array));
    }
}
