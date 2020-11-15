package ru.cmr;

import java.util.concurrent.atomic.AtomicInteger;

public class RussianMultiplicator{

    public static int mult(int a, int b) {
        int res = 0;
        AtomicInteger cnt = new AtomicInteger();
        while (b >= 1) {
            if ((b & 1) != 0) {
                res += a;
            }
            b /= 2;
            a *= 2;
            cnt.incrementAndGet();
        }
        System.out.println("Counter: " + cnt.get());
        return res;
    }
}
