package simplest.possible.implementation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static java.util.Collections.emptyList;
import static java.util.OptionalDouble.of;

public class PrimeFactorsTest {
    @Test
    void thereAreNoPrimeFactorsFor1() {
        Assertions.assertEquals(emptyList(), new PrimeFactors().of(1));
    }

    @Test
    void primeFactorOf2Is2Itself() {
        Assertions.assertEquals(of(2), new PrimeFactors().of(2));
    }
}