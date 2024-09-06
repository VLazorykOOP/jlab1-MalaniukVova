import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Вибір режиму роботи програми
        System.out.println("Оберіть варіант:");
        System.out.println("1 - Вхідні дані дійсного типу, результат – дійсного типу");
        System.out.println("2 - Вхідні дані цілого типу, результат – дійсного типу");
        System.out.println("3 - Вхідні дані дійсного типу, результат – цілого типу");
        int choice = scanner.nextInt();

        double a, b;

        // В залежності від обраного варіанту, беремо вхідні дані відповідного типу
        switch (choice) {
            case 1:
                // Вхідні дані дійсного типу
                System.out.print("Введіть a (дійсне число): ");
                a = scanner.nextDouble();
                System.out.print("Введіть b (дійсне число): ");
                b = scanner.nextDouble();

                // Обчислення результату дійсного типу
                double result1 = calculateFraction(a, b);
                System.out.println("Результат (дійсне число): " + result1);
                break;

            case 2:
                // Вхідні дані цілого типу
                System.out.print("Введіть a (ціле число): ");
                a = scanner.nextInt();
                System.out.print("Введіть b (ціле число): ");
                b = scanner.nextInt();

                // Обчислення результату дійсного типу
                double result2 = calculateFraction(a, b);
                System.out.println("Результат (дійсне число): " + result2);
                break;

            case 3:
                // Вхідні дані дійсного типу
                System.out.print("Введіть a (дійсне число): ");
                a = scanner.nextDouble();
                System.out.print("Введіть b (дійсне число): ");
                b = scanner.nextDouble();

                // Обчислення результату цілого типу
                int result3 = (int) calculateFraction(a, b);
                System.out.println("Результат (ціле число): " + result3);
                break;

            default:
                System.out.println("Неправильний вибір!");
        }
    }

    // Метод для обчислення значення виразу
    public static double calculateFraction(double a, double b) {
        double numerator1 = 1;
        double denominator1 = a * Math.pow(b, 2) - 2 * b;

        double numerator2 = 1;
        double denominator2 = 3 * Math.pow(a, 2) + 2;

        double commonDenominator = denominator1 * denominator2;
        double resultNumerator = numerator1 * denominator2 + numerator2 * denominator1;

        return resultNumerator / commonDenominator;
    }
}
