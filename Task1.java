import java.util.Scanner;

class InvalidNumberException extends Exception {
    public InvalidNumberException(String message) {
        super(message);
    }
}


public class Task1 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите число: ");
            int number = scanner.nextInt();
            checkNumber(number);
            System.out.println("Число корректно");
        } catch (InvalidNumberException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void checkNumber(int number) throws InvalidNumberException {
        if (number <= 0) {
            throw new InvalidNumberException("Некорректное число");
        }
    }
}
