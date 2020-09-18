package ru.fyodorov.lesson4;

import java.util.Random;

/**
 * @code Person реализует интерфейс Comparable и помогает сортировать объекты
 */
public class Person implements Comparable<Person> {
    private final int age;
    private final String sex;
    private final String name;

    public Person() {
        this.name = getNames();
        this.sex = PersonSex.randomSex();
        age = (int) (Math.random() * 50);
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public String getName() {
        return name;
    }

    private static final String[] NAMES = {"Александр", "Сергей", "Владимир", "Елена", "Татьяна", "Андрей", "Алексей", "Ольга",
            "Николай", "Наталья", "Анна", "Иван", "Дмитрий", "Ирина", "Мария", "Светлана", "Михаил", "Екатерина",
            "Евгений", "Виктор", "Анастасия", "Юрий", "Юлия", "Валентина", "Галина", "Людмила", "Василий", "Игорь",
            "Анатолий", "Олег", "Надежда", "Марина", "Павел", "Максим", "Александра", "Нина", "Виталий", "Валерий",
            "Любовь", "Виктория", "Роман", "Оксана", "Денис", "Дарья", "Константин", "Вячеслав", "Вера", "Евгения",
            "Петр", "Антон"};

    public static final int FILENAMES = NAMES.length;
    public static final Random RANDOM = new Random();

    /**
     * Метод генерирует случайное имя
     *
     * @return возвращает элемент из массива NAMES
     */
    public String getNames() {
        return NAMES[RANDOM.nextInt(FILENAMES)];
    }

    @Override
    public String toString() {
        return "Возраст:" + age +
                ", пол:'" + sex + '\'' +
                ", имя:'" + name + '\'';
    }

    /**
     * Метод compareTo
     * Сравнение происходит по полю - пол,
     * далее сравнение происходит по полю - возраст,
     * если возраст совпадает, то сравниваются имена,
     * если имена совпадают - выбрасывается исключение
     *
     * @param o объект
     * @return возвращает положительное число если левый объект больше правого
     * отрицательное, если левый меньше правого и 0 если объекты равны
     */
    @Override
    public int compareTo(Person o) throws MyException {
        int result;
        result = sex.compareTo(o.sex);
        if (result != 0) {
            return result;
        }
        result = Integer.compare(getAge(), o.getAge());
        if (result != 0) {
            return result *-1;
        } else {
            result = getName().compareTo(o.getName());
            if (result == 0) {
                throw new MyException("Возраст и имя одинаковые");
            }
        }
        result = getName().compareTo(o.getName());
        return result;
    }
}