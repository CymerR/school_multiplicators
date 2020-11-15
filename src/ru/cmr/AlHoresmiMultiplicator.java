package ru.cmr;

import java.util.concurrent.atomic.AtomicInteger;

public class AlHoresmiMultiplicator {
    public static int mult(int a, int b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Arguments should be >= 0 instead was: " + a +" : "+b);
        }
        int res = 0;
        int factor = 1;
        AtomicInteger cnt = new AtomicInteger();
        while (b >= 1) {
            res += a * (b % 10)*factor;
            b /= 10;
            factor *= 10;
            cnt.incrementAndGet();
        }
        System.out.println("Counter: " + cnt.get());
        return res;
    }
}
