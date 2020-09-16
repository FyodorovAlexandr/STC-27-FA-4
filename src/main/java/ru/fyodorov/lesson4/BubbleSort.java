package ru.fyodorov.lesson4;

/**
 * @code BubbleSort
 *
 * Класс реализует сортировку пузырьком
 */
public class BubbleSort implements PersonSort {

    /**
     * Метод сортировки с использованием Comparable
     *
     * @param persons массив объектов
     */
    public static void sort(Person[] persons) {
        long startTime = System.currentTimeMillis();
        int size = persons.length;
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (persons[j].compareTo(persons[j + 1]) > 0) {
                    Person temp = persons[j];
                    persons[j] = persons[j + 1];
                    persons[j + 1] = temp;
                }
            }
        }
        long finishTime = System.currentTimeMillis();
        System.out.println("Время работы сортировки пузырьком: " + (finishTime - startTime) + " милисекунды");

    }
}
