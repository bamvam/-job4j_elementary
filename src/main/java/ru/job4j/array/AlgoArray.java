package ru.job4j.array;

public class AlgoArray {
    public static void main(String[] args) {
        int[] array = new int[] {5, 3, 2, 1, 4};
        int temp = array[0]; /* переменная для временного хранения значение ячейки с индексом 0. */
        array[0] = array[3]; /* записываем в ячейку с индексом 0 значение ячейки с индексом 3. */
        array[3] = temp; /* записываем в ячейку с индексом 3 значение временной переменной. */
        int temp1 = array[1];
        array[1] = array[2];
        array[2] = temp1;
        int temp2 = array[3];
        array[3] = array[4];
        array[4] = temp2;
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }
}