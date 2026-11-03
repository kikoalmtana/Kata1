package software.ulpgc;

import java.time.LocalDate;

public class Person {

    private String name;
    private LocalDate birthday;

    public Person(String name, LocalDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public int age() {
        return toYears(LocalDate.now().toEpochDay() - birthday.toEpochDay());
    }

    private int toYears(long l) {

        return (int)(l/365);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                ", age=" + age() +
                '}';
    }
}
