public class task4 {
    public static void main(String[] args) {
        String text = "аааааа ббб. аааа. аааа";

        // Видаляємо розділові знаки, залишаємо лише пробіли як розділювачі слів
        text = text.replaceAll("[.,!?;:]", "");

        // Розділяємо текст на слова
        String[] words = text.split("\\s+");

        // Знаходимо максимальну довжину слова
        int maxLength = 0;
        for (String word : words) {
            if (word.length() > maxLength) {
                maxLength = word.length();
            }
        }

        // Створюємо новий рядок без слів найбільшої довжини
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            if (word.length() != maxLength) {
                result.append(word).append(" ");
            }
        }

        // Виводимо результат (видаляємо зайвий пробіл в кінці)
        System.out.println("Текст після видалення найдовших слів:");
        System.out.println(result.toString().trim());
    }
}
