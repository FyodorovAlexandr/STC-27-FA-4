package ru.fyodorov.lesson4;

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

        BubbleSort.sort(person);
        System.out.println("Сортировка пузырьком");
        for (Person value: person){
            System.out.println(value);
        }
        System.out.println("-------------------------------------");

        for (int i = 0; i < person.length; i++){
            person[i] = new Person();
        }
        InsertSort.sort(person);
        System.out.println("Сортировка вставками");
        for (Person value: person){
            System.out.println(value);
        }
        System.out.println("-------------------------------------");
    }
}
