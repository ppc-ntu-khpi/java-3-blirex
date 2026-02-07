package domain;

public class Exercise {

    public static int Calculate() {
        int count = 0;

        // Перебираємо всі 6-значні номери
        for (int ticket = 0; ticket <= 999999; ticket++) {
            int firstHalf = ticket / 1000; // перші три цифри
            int secondHalf = ticket % 1000; // останні три цифри

            if (sumOfDigits(firstHalf) == sumOfDigits(secondHalf)) {
                count++;
            }
        }

        return count;
    }

    // Приватний метод для підрахунку суми цифр трьохзначного числа
    private static int sumOfDigits(int num) {
        int sum = 0;
        sum += num / 100;         // сотні
        sum += (num / 10) % 10;   // десятки
        sum += num % 10;          // одиниці
        return sum;
    }
}
