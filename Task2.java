import java.util.Scanner;

class DivisionByZeroException extends Exception {
    public DivisionByZeroException(String message) {
        super(message);
    }
}

public class Task2 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите первое число: ");
            double firstNumber = scanner.nextDouble();
            System.out.print("Введите второе число: ");
            double secondNumber = scanner.nextDouble();
            double result = divideNumbers(firstNumber, secondNumber);
            System.out.println("Результат деления: " + result);
        } catch (DivisionByZeroException e) {
            System.out.println(e.getMessage());
        }
    }

    private static double divideNumbers(double firstNumber, double secondNumber) throws DivisionByZeroException {
        if (secondNumber == 0) {
            throw new DivisionByZeroException("Деление на ноль недопустимо");
        }
        return firstNumber / secondNumber;
    }
}
