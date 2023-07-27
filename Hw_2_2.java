import java.util.Scanner;

public class Hw_2_2 {
    public static void main(String[] args) throws DivisionByZeroException {
        Scanner iScan = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        String value1 = iScan.nextLine();
        System.out.print("Введите второе число: ");
        String value2 = iScan.nextLine();

        boolean flag = false;

        while (!flag) {
            flag = isNumber(value1, value2);
            if (flag) {
                double num1 = Double.parseDouble(value1);
                double num2 = Double.parseDouble(value2);
                if (num2 != 0) {
                    System.out.printf("\nРезультат деления числа %.2f на число %.2f равен %.2f", num1, num2, num1 / num2);
                } else {
                    throw new DivisionByZeroException("Деление на ноль недопустимо!");
                }
            } else {
                System.out.println("Одно из введеных значений не является числом. Повторите ввод.");
                System.out.print("Введите первое число: ");
                value1 = iScan.nextLine();
                System.out.print("Введите второе число: ");
                value2 = iScan.nextLine();
            }
        }
        iScan.close();
    }

    public static boolean isNumber(String str1, String str2) {
        try {
            Double.parseDouble(str1);
            Double.parseDouble(str2);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}

class DivisionByZeroException extends Exception {
    public DivisionByZeroException(String message) {
        super(message);
    }
}
