package ru.gdr.expression.function;

import static ru.gdr.expression.ExpFactory.*;
import static ru.gdr.expression.ExpFactory.multiply;
import static ru.gdr.expression.MockFactory.*;
import static ru.gdr.expression.MockFactory.mockLn;
import static ru.gdr.expression.MockFactory.mockSec;

/**
 * Created by Makhnovets on 20.05.2016.
 */
public class FuncLevel2 {
    FuncLevel3 func=new FuncLevel3();
    public double LogFunc(double arg, double precision) {
        return func.LogFunc1(arg, precision)-func.LogFunc5(arg, precision);
    }
    public double TrigFunc(double arg, double precision) {
        return func.TrigFunc1(arg, precision)-func.TrigFunc5(arg, precision);
    }

//
//    public double LogFunc(double arg, double precision) {
//        return minus(mockLog1(), mockLog5()).evaluate(arg, precision);
//    }
//
//    public double TrigFunc(double arg, double precision) {
//        return minus(mockTrig1(), mockTrig5()).evaluate(arg, precision);
//    }

}
