package software.ulpgc.katas;

import java.time.LocalDate;

public class main {
    static void main() {
        person person = new person("Lucía", LocalDate.of(2005, 20, 7));
        System.out.println(person.age());
    }
}
