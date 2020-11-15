package ru.cmr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RussianMultiplicatorTest {

    @Test
    void testMult_1() {
        int result = RussianMultiplicator.mult(0, 0);
        Assertions.assertEquals(0, result);
    }
    @Test
    void testMult_2() {
        int result = RussianMultiplicator.mult(1, 5);
        Assertions.assertEquals(5, result);
    }
    @Test
    void testMult_3() {
        int result = RussianMultiplicator.mult(9, 9);
        Assertions.assertEquals(81, result);
    }
    @Test
    void testMult_4() {
        int result = RussianMultiplicator.mult(118, 8);
        Assertions.assertEquals(944, result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme