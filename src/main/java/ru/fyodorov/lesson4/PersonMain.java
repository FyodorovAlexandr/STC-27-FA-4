package ru.fyodorov.lesson4;

import static java.lang.System.out;

/**
 * @author Fyodorov Alexandr
 * @code PersonMain
 *
 * Программа позволяет сортировать объекты
 */
public class PersonMain {
    public static void main(String[] args) {
        Person[] person = new Person[50];

        for (int i = 0; i < person.length; i++){
            person[i] = new Person();
        }
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(person);
        for (Person value: person){
            out.println(value);
        }
        out.println("-------------------------------------");

        for (int i = 0; i < person.length; i++){
            person[i] = new Person();
        }
        InsertSort insertSort = new InsertSort();
        insertSort.sort(person);
        for (Person value: person){
            out.println(value);
        }
        out.println("-------------------------------------");
    }
}