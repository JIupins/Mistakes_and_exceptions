import java.util.Scanner;

public class main1 {
    public static void main(String[] args) {
        Double[] numbers= inputData();
        try {
            System.out.printf("Сумма: %f\n", calculator.sum(numbers[0],numbers[1]));
        } catch (Exception e) {
            System.out.println("Суммирование. Получена ошибка: " + e.getMessage());
        }
        try {
            System.out.printf("Разность: %f\n", calculator.difference(numbers[0],numbers[1]));
        } catch (Exception e) {
            System.out.println("Вычитвние. Получена ошибка: " + e.getMessage());
        }
        try {
            System.out.printf("Произведение: %f\n", calculator.creation(numbers[0],numbers[1]));
        } catch (Exception e) {
            System.out.println("Умножение. Получена ошибка: " + e.getMessage());
        }
        try {
            System.out.printf("Частное: %f\n", calculator.quotient(numbers[0],numbers[1]));
        } catch (Exception e) {
            System.out.println("Деление. Получена ошибка: " + e.getMessage());
        }
        try {
            System.out.printf("Возведение в степень: %f\n", calculator.calculatePower(numbers[0],numbers[1]));
        } catch (Exception e) {
            System.out.println("Возведение в степень. Получена ошибка: " + e.getMessage());
        }
    }

    public static Double[] inputData() {
        final Scanner iScan = new Scanner(System.in);
        try (iScan) {
            System.out.printf("Введите первое число: ");
            double one = readDouble(iScan);
            System.out.printf("Введите второе число: ");
            double two = readDouble(iScan);

            Double[] values = new Double[] { one, two };

            return values;
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return null;
    }

    public static Double readDouble(Scanner scan) {
        while (true) {
            try {
                return Double.parseDouble(scan.nextLine().replace(",", "."));
            } catch (NumberFormatException e) {
                System.out.println("Некорректное число. Повторите ввод:");
            }
        }
    }
}