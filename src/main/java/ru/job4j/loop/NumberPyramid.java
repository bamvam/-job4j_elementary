package ru.job4j.loop;

public class NumberPyramid {
    public static void draw(int n) {
        for (int i = 1; i <= n; i++) {
            // Печатаем пробелы (n - i раз)
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Печатаем числа в прямом порядке (от 1 до i)
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // Печатаем числа в обратном порядке (от i-1 до 1)
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            // Переход на новую строку
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Number pyramid of height 3:");
        draw(3);
        System.out.println("Number pyramid of height 5:");
        draw(5);
    }
}