package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[8];
        System.out.println("Размер массива равен: " + ages.length);
        String[] surnames = new String[100500];
        System.out.println("Размер массива равен: " + surnames.length);
        float[] prices = new float[40];
        System.out.println("Размер массива равен: " + prices.length);

        String[] names = new String[4];
        names[0] = "Artur Morgan";
        names[1] = "Gorister Honter";
        names[2] = "Barack Obama";
        names[3] = "Harlan Elison";
        for (int index = 0; index < names.length; index++) {
            System.out.println(names[index]);
        }
    }
}
