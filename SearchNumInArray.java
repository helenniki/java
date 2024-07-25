import java.util.Scanner;

public class SearchNumInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int num  = scanner.nextInt();

        int[] array = {5, 12, 7, 3, 9};

        boolean found = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Число " + num + " найдено в массиве");
        } else {
            System.out.println("Число " + num + " не найдено в массиве");
        }

        scanner.close();

    }
}
