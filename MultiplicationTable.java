// Задача: Генерация таблицы умножения
// Напиши программу, которая генерирует таблицу умножения
//  для чисел от 1 до 10 и выводит её на экран.
public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.printf("%4s", ""); // Пустое место для заголовка столбца
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println();

        // Таблица умножения
        for (int i = 1; i <= 10; i++) {
            // Заголовок строки
            System.out.printf("%4d", i);

            // Вывод значений строки
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }
}
