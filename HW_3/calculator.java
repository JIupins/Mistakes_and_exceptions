public class calculator {

    static double sum(double a, double b) {
        if (a <= 0 || b <= 0)
            throw new ArithmeticException("Суммируемые числа должны быль больше нуля!");
        return a + b;
    }

    static double difference(double a, double b) {
        if (b < a)
            throw new ArithmeticException("Вычитаемое число не может быть больше уменьшаемого!");
        return a - b;
    }

    static double creation(double a, double b) {
        if (a <= 0 || b <= 0)
            throw new ArithmeticException("Умножаемые числа должны быль больше нуля!");
        return a * b;
    }

    static double quotient(double a, double b) {
        if (b == 0 || a / b <= 0)
            throw new ArithmeticException("Делитель не может быть нулем!");
        if (a / b <= 0)
            throw new ArithmeticException("Частное не может быть меньше нуля!");
        return a / b;
    }

    static double calculatePower(double a, double b) throws InvalidNumberException {
        if (a == 0 )
            throw new InvalidNumberException("Основание не может являться нулем!");
        if ( b < 0)
            throw new InvalidNumberException ("Стьепень не может быть отрицательной!");
        return Math.pow(a, b);
    }
}
