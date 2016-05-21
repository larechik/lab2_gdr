package ru.gdr.expression.function;

import ru.gdr.expression.MockFactory;

import static ru.gdr.expression.MockFactory.mockSec;
import static ru.gdr.expression.ExpFactory.*;

/**
 * Created by Makhnovets on 20.05.2016.
 */
public class Sec {
    Sin sin=new Sin();
//    public double Sec(double arg, double precision) {
//        return mockSec().evaluate(arg, precision);
//    }
    public double Sec(double arg,double precision){
        double x=arg;
        boolean negative = false;
            if ((x > Math.PI/2))
            {
                int buf = (int) (x * 2 / Math.PI);
                buf = --buf / 2;
                if (buf % 2 == 0)
                    negative = true;
                x -= Math.PI * (1 + buf);
            }
            if ((x < -Math.PI/2)) {
                int buf = (int) (-x * 2 / Math.PI);
                buf = --buf / 2;
                if (buf % 2 == 0)
                    negative = true;
                x += Math.PI * (1 + buf);
            }
        double buf=1-Math.pow(sin.Sin(x,precision),2);
            if (buf==0) return Double.NaN;
        if (negative)
        return -1/Math.sqrt(buf);
        else
            return 1/Math.sqrt(buf);
    }
    //Implementation using stubs
    /*public double Sec(double arg, double precision) {
        double x=arg;
        boolean negative = false;
        if ((x > Math.PI/2))
        {
            int buf = (int) (x * 2 / Math.PI);
            buf = --buf / 2;
            if (buf % 2 == 0)
                negative = true;
            x -= Math.PI * (1 + buf);
        }
        if ((x < -Math.PI/2)) {
            int buf = (int) (-x * 2 / Math.PI);
            buf = --buf / 2;
            if (buf % 2 == 0)
                negative = true;
            x += Math.PI * (1 + buf);
        }
        double buf=1-Math.pow(MockFactory.mockSin().evaluate(arg, precision),2);
        if (buf==0) return Double.NaN;
        if (negative)
            return -1/Math.sqrt(buf);
        else
            return 1/Math.sqrt(buf);
    }*/
}
