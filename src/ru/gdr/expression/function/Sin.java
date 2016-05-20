package ru.gdr.expression.function;

import static ru.gdr.expression.MockFactory.mockSec;

/**
 * Created by Makhnovets on 20.05.2016.
 */
public class Sin {
    Sec sec=new Sec();
    public double Sin(double arg, double precision) {
        double buf = Math.pow(1/sec.Sec(arg, precision),2);
        if (buf-1>0) buf=1;
        return Math.sqrt(1-buf);
    }
}
