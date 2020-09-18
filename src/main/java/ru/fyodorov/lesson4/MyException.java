package ru.fyodorov.lesson4;

/**
 * @code MyException реализует пользовательское исключение.
 * Если имена людей и возраст совпадают - выбрасывается исключение.
 */
public class MyException extends NullPointerException {

    /**
     * @param message сообщение об исключении
     */
    public MyException(String message){
        super(message);
    }
}