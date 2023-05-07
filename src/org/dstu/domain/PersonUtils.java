package org.dstu.domain;

import java.util.HashMap;
import java.util.function.Function;

public class PersonUtils {

    public static Person initializePerson(String[] line) {
        // I knew that it's not the best solution at all, but it's looks better and more extendable
        // then just using if/switch case
        var personInitializer = new HashMap<String, Function<String[], Person>>();

        personInitializer.put("0", Student::new);
        personInitializer.put("1", Teacher::new);

        return personInitializer.get(line[0]).apply(line);
    }
}
