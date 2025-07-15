package ru.job4j.loop;

public class Savings {
    public static int years(double goal, double annualDeposit, double percent) {
        if (goal <= 0) {
            return 0;
        }

        int years = 0;
        double total = 0;

        while (total < goal) {
            years++;
            // Начисляем проценты на существующую сумму ДО пополнения
            if (years > 1) {
                total += total * (percent / 100);
            }
            // Делаем ежегодное пополнение
            total += annualDeposit;
        }

        return years;
    }
}