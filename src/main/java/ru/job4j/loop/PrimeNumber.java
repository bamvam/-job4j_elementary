package ru.job4j.loop;

public class PrimeNumber {
    public static int calc(int finish) {
        int count = 0;
        for (int i = 2; i <= finish; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }

    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}