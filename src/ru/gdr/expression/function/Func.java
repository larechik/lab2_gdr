package ru.gdr.expression.function;

import static ru.gdr.expression.ExpFactory.*;
import static ru.gdr.expression.MockFactory.*;

/**
 * Created by Makhnovets on 15.05.2016.
 */
public class Func {
    FuncLevel2 func = new FuncLevel2();

    public double BigFunc(double arg, double precision) {
        if (arg <= 0) {
            return func.TrigFunc(arg, precision);
        } else {
            return func.LogFunc(arg, precision);
        }
    }
    //Implementation using stubs
//    public double BigFunc(double arg, double precision) {
//        if (arg <= 0) {
//            return mockTrig().evaluate(arg, precision);
//        } else {
//            return mockLog().evaluate(arg, precision);
//        }
//    }


}
