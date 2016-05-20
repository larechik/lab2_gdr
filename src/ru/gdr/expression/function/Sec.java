package ru.gdr.expression.function;

import static ru.gdr.expression.MockFactory.mockSec;
import static ru.gdr.expression.ExpFactory.*;

/**
 * Created by Makhnovets on 20.05.2016.
 */
public class Sec {
//    public double Sec(double arg, double precision) {
//        return mockSec().evaluate(arg, precision);
//    }
    public double Sec(double arg,double precision){
        return sec(variable()).evaluate(arg, precision);
    }

}
