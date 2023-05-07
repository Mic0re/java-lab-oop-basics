package org.dstu.domain;

import java.util.HashMap;
import java.util.function.Function;

public class AnimalUtils {

    public static Animal initializePerson(String[] line) {
        // I knew that it's not the best solution at all, but it's looks better and more extendable
        // then just using if/switch case
        var personInitializer = new HashMap<String, Function<String[], Animal>>();

        personInitializer.put("0", Birds::new);
        personInitializer.put("1", Mammals::new);
        try {
            return personInitializer.get(line[0]).apply(line);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        return null;
    }
}
