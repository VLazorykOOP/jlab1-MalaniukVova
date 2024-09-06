import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Введення розміру матриці n
        System.out.print("Введіть розмір матриці (n ≤ 20): ");
        int n = scanner.nextInt();

        if (n > 20) {
            System.out.println("Розмір матриці перевищує допустиме значення!");
            return;
        }

        // Введення матриці A(n, n)
        double[][] A = new double[n][n];
        System.out.println("Введіть елементи матриці A:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = scanner.nextDouble();
            }
        }

        // Створення вектора B для зберігання середніх арифметичних
        double[] B = new double[n];

        // Обчислення середніх арифметичних для кожного рядка
        for (int i = 0; i < n; i++) {
            double sum = 0;
            for (int j = 0; j < n; j++) {
                sum += A[i][j];
            }
            B[i] = sum / n;
        }

        // Виведення вектора B
        System.out.println("Вектор B (середні арифметичні рядків матриці A):");
        for (int i = 0; i < n; i++) {
            System.out.print(B[i] + " ");
        }
    }
}
