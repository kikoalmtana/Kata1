package software.ulpgc.katas;

import java.time.LocalDate;

public class person {
    private final String Name;

    private final LocalDate Birthday;

    public person(String name, LocalDate birthday) {
        Name = name;
        Birthday = birthday;
    }

    public String name() {
        return Name;
    }

    public LocalDate birthday() {
        return Birthday;
    }

    public int age() {
        return toyears(LocalDate.now().toEpochDay() - this.Birthday.toEpochDay());
    }

    private int toyears(long days) {
        return (int) (days/365);
    }
}
