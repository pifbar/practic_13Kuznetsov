package MyPackage;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxValue = 0;
        int count = 0;

        while (true) {
            int currentNumber = scanner.nextInt();

            if (currentNumber == 0) {
                break;
            }

            if (currentNumber > maxValue) {
                maxValue = currentNumber;
                count = 1;
            } else if (currentNumber == maxValue) {
                count++;
            }
        }

        System.out.println("Максимальный элемент: " + maxValue);
        System.out.println("Количество элементов, равных максимальному: " + count);

        scanner.close();
    }
}