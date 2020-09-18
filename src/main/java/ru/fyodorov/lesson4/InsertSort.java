package ru.fyodorov.lesson4;

import static java.lang.System.out;

/**
 * @code InsertSort
 *
 * Класс реализует сортировку вставками
 */
public class InsertSort implements PersonSort{

    /**
     * Метод сортировки вставками с использованием Comparable
     *
     * @param persons массив объектов
     */
    public void sortI (Person[] persons) {
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
        out.println("Время работы сортировки вставками: " + (finishTime - startTime) + " милисекунды");
    }

    @Override
    public void sort() {
        out.println("Сортировка вставками:");
    }
}