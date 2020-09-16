package ru.fyodorov.lesson4;

import java.util.Random;

/**
 * @code PersonSex реализует интерфейс Comparable
 * возвращает рандомно пол
 */
public class PersonSex implements Comparable<PersonSex> {

    private static final String MAN = "M";
    private static final String WOMAN = "Ж";

    private static final String[] VALUES = {MAN, WOMAN};
    private static final int SIZE = VALUES.length;
    private static final Random RANDOM = new Random();

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
        if (result != 0) {
            return result;
        }
        result = getWoman().compareTo(o.getWoman());
        if (result != 0) {
            return result;
        }
        return result;
    }
}
