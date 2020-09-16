package ru.fyodorov.lesson4;

/**
 * @code MyException реализует пользовательское исключение.
 * Если имена людей и возраст совпадают - выбрасывается исключение.
 */
public class MyException extends NullPointerException {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    /**
     * Пользовательское исключение
     *
     * @param message сообщение
     * @param age возраст
     * @param name имя
     */
    public MyException(String message, int age, String name){
        super(message);
        this.age = age;
        this.name = name;
    }
}
