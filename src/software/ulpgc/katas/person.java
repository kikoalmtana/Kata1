package software.ulpgc.katas;

import java.time.LocalDate;

public record person (String Name, LocalDate Birthday) {
    public static final double DAYS_PER_YEARS = 365.25;

    public int age() {
        return toyears(LocalDate.now().toEpochDay() - this.Birthday.toEpochDay());
    }

    private int toyears(long days) {
        return (int) (days/ DAYS_PER_YEARS);
    }
}
