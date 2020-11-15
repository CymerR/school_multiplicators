package ru.cmr;

public class SimpleTasks {

    /**
     *
     * @param a - reference
     * @param b - divisor
     * @return integer division of A/B
     */
    public static int div(int a, int b) {
        int factor = 0;
        while (a >= b){
            a -= b;
            factor++;
        }
        return factor;
    }
    public static int mod(int a, int b) {
        return a-div(a,b)*b;
    }

}
