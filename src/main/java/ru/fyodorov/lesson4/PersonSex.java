package ru.fyodorov.lesson4;

import java.util.Random;

/**
 * @code PersonSex реализует интерфейс Comparable
 * возвращает рандомно пол
 */
public class PersonSex implements Comparable<PersonSex> {

    public static final String MAN = "M";
    public static final String WOMAN = "Ж";
    public static final String[] VALUES = {MAN, WOMAN};
    public static final int SIZE = VALUES.length;
    public static final Random RANDOM = new Random();

    public String getMan() {
        return MAN;
    }

    public String getWoman() {
        return WOMAN;
    }

    /**
     * Генерирует массив MAN и WOMAN
     *
     * @return возвращает значение
     */
    public static String randomSex(){
        return VALUES[RANDOM.nextInt(SIZE)];
    }

    /**
     * Метод compareTo
     * сравнивает константы MAN и WOMAN
     *
     * @param o объекты
     * @return возвращает значение
     */
    @Override
    public int compareTo(PersonSex o) {
        int result;
        result = getMan().compareTo(o.getWoman());
        return result;
    }
}