package ru.cmr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SimpleTasksTest {

    @Test
    void testDiv() {
        int result = SimpleTasks.div(19, 6);
        Assertions.assertEquals(3, result);
    }
    @Test
    void testMod() {
        int result = SimpleTasks.mod(12, 6);
        Assertions.assertEquals(0, result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme