package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        if (data.length == 0) {
            return result;
        }
        boolean reference = data[0]; // Первый элемент как эталон
        for (int i = 1; i < data.length; i++) {
            if (data[i] != reference) {
                result = false;
                break; // Прерываем цикл при первом несовпадении
            }
        }
        return result;
    }
}