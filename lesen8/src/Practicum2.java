import java.util.Scanner;

public class Practicum2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Пожалуйста, введите сумму перевода в рублях.");
        double amount = scanner.nextDouble();
        boolean isValid = TransactionValidator.isValidAmount(amount);
        if (isValid) {
            System.out.println("Спасибо! Ваш перевод на сумму " + amount + " р. успешно выполнен по номеру +7 967 367 67 67.");
        } else {
        }
        scanner.close();
    }
}
class TransactionValidator {
    public static final double MIN_AMOUNT = 1.0;
    public static final double MAX_AMOUNT = 1000000000000000.0;
    /**
     * Статический метод проверки суммы.
     * Возвращает true, если сумма в пределах [MIN_AMOUNT, MAX_AMOUNT].
     * Выводит сообщение об ошибке, если условие нарушено.
     */
    public static boolean isValidAmount(double amount) {
        if (amount < MIN_AMOUNT) {
            System.out.println("Минимальная сумма перевода: " + MIN_AMOUNT + " р. Попробуйте ещё раз!");
            return false;
        }
        if (amount > MAX_AMOUNT) {
            System.out.println("Максимальная сумма перевода: " + MAX_AMOUNT + " р. Попробуйте ещё раз!");
            return false;
        }
        return true;
    }
}

