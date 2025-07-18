package ru.job4j.loop;

public class Savings {
    public static int years(double goal, double annualDeposit, double percent) {
        if (goal <= 0) {
            return 0;
        }

        int years = 0;
        double total = 0;

        do {
            years++;
            if (years > 1) {
                total += total * (percent / 100);
            }
            total += annualDeposit;
        } while (total < goal);

        return years;
    }
}