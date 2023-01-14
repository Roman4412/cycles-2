
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        // 1
        System.out.println("TASK 1");
        int savePerMonth = 15_000;
        int totalSaving = 0;
        int targetAmount = 2_459_000;
        int month = 0;

        while (totalSaving < targetAmount) {
            totalSaving += savePerMonth;
            month++;
        }
        System.out.println("Месяц " + month + ", сумма накоплений равна " + totalSaving);
        // 2
        System.out.println("TASK 2");
        int count = 1;
        while (count <= 10) {
            System.out.print(count + " ");
            count++;
        }
        System.out.println();
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        // 3
        System.out.println("TASK 3");
        System.out.println();
        int population = 12_000_000;
        int birthRate = 17;
        int deathRate = 8;
        int year = 2023;
        while (year < 2033) {
            population += (population / 1000 * (birthRate - deathRate));
            System.out.println("Год " + year + ", численность населения составляет - " + population);
            year++;
        }
        // 4
        System.out.println("TASK 4");
        double balance = 15_000.0;
        int depositRate = 7;
        targetAmount = 12_000_000;
        count = 1;
        while (balance < targetAmount) {
            balance += (balance / 100 * depositRate);
            System.out.println("Текущий срок вклада в месяцах: " + count);
            String formattedBalance = new DecimalFormat("#0.00").format(balance);
            System.out.println("Накопления составляют: " + formattedBalance + "\n");
            count++;
        }
        // 5
        System.out.println("TASK 5");
        balance = 15_000.0;
        count = 1;
        while (balance < targetAmount) {
            balance += (balance / 100 * depositRate);
            if (count % 6 == 0) {
                System.out.println("Текущий срок вклада в месяцах: " + count);
                String formattedBalance = new DecimalFormat("#0.00").format(balance);
                System.out.println("Накопления составляют: " + formattedBalance + "\n");
            }
            count++;
        }
        // 6
        System.out.println("TASK 6");
        balance = 15_000.0;
        count = 1;
        int depositTerm = 9 * 12;
        while (count <= depositTerm) {
            balance += (balance / 100 * depositRate);
                if (count % 6 == 0) {
                    String formattedBalance = new DecimalFormat("#0.00").format(balance);
                    System.out.println("Текущий срок вклада в месяцах: " + count);
                    System.out.println("Накопления составляют: " + formattedBalance + "\n");
                }
            count++;
        }
        // 7
        System.out.println("TASK 7");
        int friday = 6;
        while (friday <= 31) {
            System.out.println("Сегодня пятница, " + friday + "-e число. Необходимо подготовить отчет!");
            friday += 7;
        }
        System.out.println();
        // 8
        System.out.println("TASK 8");
        int  currentYear = 2023;
        int yearOfAppearance = 79;
        while (yearOfAppearance <= currentYear + 100) {
            if (yearOfAppearance >= currentYear - 200 && yearOfAppearance % 79 == 0) {
                System.out.println(yearOfAppearance);
            }
            yearOfAppearance += 79;
        }
    }
}
