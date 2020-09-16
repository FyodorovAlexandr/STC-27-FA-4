package ru.fyodorov.lesson4;

/**
 * @code InsertSort
 *
 * Класс реализует сортировку вставками
 */
public class InsertSort implements PersonSort {

    /**
     * Метод сортировки вставками с использованием Comparable
     *
     * @param persons массив объектов
     */
    public static void sort(Person[] persons) {
        long startTime = System.currentTimeMillis();
        for (int i = 1; i < persons.length; i++) {
            Person current = persons[i];
            int j = i - 1;
            while (j >= 0 && (current.compareTo(persons[j]) < 0)) {
                persons[j + 1] = persons[j];
                j--;
            }
            persons[j + 1] = current;
        }
        long finishTime = System.currentTimeMillis();
        System.out.println("Время работы сортировки вставками: " + (finishTime - startTime) + " милисекунды");
    }
}
