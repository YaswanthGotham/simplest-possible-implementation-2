/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package simplest.possible.implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;


public class PrimeFactors {
    public Object of(int number) {
        List<Integer> list = new ArrayList();
        if (number == 1) {
            list.removeAll(list);
            return list;
        }
        if (number == 2) {
            list.add(2);
            return OptionalDouble.of(2);
        }
        return null;
    }
}

