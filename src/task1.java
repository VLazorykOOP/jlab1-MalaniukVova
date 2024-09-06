class task1 {
    public static void main(String[] args) {
        // Присвоюємо значення для a та b
        double a = 1; // Приклад значення для a
        double b = 1; // Приклад значення для b

        // Обчислюємо чисельник: a + b - 1
        double numerator = a + b - 1;

        // Обчислюємо знаменник: a^2 + 2
        double denominator = Math.pow(a, 2) + 2;

        // Обчислюємо перший доданок: (a + b - 1) / (a^2 + 2)
        double term1 = numerator / denominator;

        // Обчислюємо другий доданок: (ab)^3
        double term2 = Math.pow(a * b, 3);

        // Обчислюємо кінцевий результат: a + перший доданок - другий доданок
        double result = a + term1 - term2;

        // Виводимо результат
        System.out.println("Результат: " + result);
    }
}
