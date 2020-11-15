package ru.cmr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AlHoresmiMultiplicatorTest {

    @Test
    void testMult_1() {
        int result = AlHoresmiMultiplicator.mult(0, 0);
        assertEquals(0, result);
    }
    @Test
    void testMult_2() {
        int result = AlHoresmiMultiplicator.mult(1, 5);
        assertEquals(5, result);
    }
    @Test
    void testMult_3() {
        int result = AlHoresmiMultiplicator.mult(9, 9);
        assertEquals(81, result);
    }
    @Test
    void testMult_4() {
        int result = AlHoresmiMultiplicator.mult(118, 8);
        assertEquals(944, result);
    }
    @Test
    void testMultIllegalArgument() {
        try {
            int result = AlHoresmiMultiplicator.mult(-1, 1);
        } catch (IllegalArgumentException e) {
            assertEquals(0,0);
        }
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme