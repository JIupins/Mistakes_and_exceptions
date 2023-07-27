import java.util.Scanner;

public class Hw_2_1 {

    public static void main(String[] args) throws InvalidNumberException {
        Scanner iScan = new Scanner(System.in);
        System.out.print("Введите число: ");
        String value = iScan.nextLine();

        boolean flag = false;

        while (!flag) {
            flag = isNumber(value);
            if (flag) {
                double num = Double.parseDouble(value);
                if (num > 0) {
                    System.out.print("Число корректное!");
                } else {
                    throw new InvalidNumberException ("Некорректное число!");
                }
            } else {
                System.out.print("Введенное значение не является числом. Повторите ввод: ");
                value = iScan.nextLine();
            }
        }
        iScan.close();
    }

    public static boolean isNumber(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    } 
}

class InvalidNumberException extends Exception {
    public InvalidNumberException(String message) {
        super(message);
    }
}