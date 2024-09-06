public class task2 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in); // Використовуємо тільки Scanner для введення

        // Введення масиву A(n)
        System.out.print("Введіть кількість елементів масиву (не більше 200): ");
        int n = scanner.nextInt();

        if (n > 200) {
            System.out.println("Кількість елементів перевищує допустиме значення!");
            return;
        }

        int[] A = new int[n];
        System.out.println("Введіть елементи масиву A:");
        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
        }

        // Масив для запису повторюваних чисел
        int[] B = new int[n];
        int bIndex = 0; // Індекс для масиву B

        // Пошук чисел, що повторюються
        for (int i = 0; i < n; i++) {
            boolean foundDuplicate = false;
            int count = 0;

            // Підрахунок кількості появ числа A[i] в масиві A
            for (int j = 0; j < n; j++) {
                if (A[i] == A[j]) {
                    count++;
                }
            }

            // Якщо число повторюється (count > 1) і його ще не додали в B
            if (count > 1) {
                for (int k = 0; k < bIndex; k++) {
                    if (B[k] == A[i]) {
                        foundDuplicate = true;
                        break;
                    }
                }
                if (!foundDuplicate) {
                    B[bIndex] = A[i];
                    bIndex++;
                }
            }
        }

        // Виведення масиву B (числа, що повторюються)
        System.out.println("Масив B (числа, що повторюються по одному разу): ");
        for (int i = 0; i < bIndex; i++) {
            System.out.print(B[i] + " ");
        }
    }
}
