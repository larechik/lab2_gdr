package ru.gdr.expression.function;

import static ru.gdr.expression.ExpFactory.constant;
import static ru.gdr.expression.ExpFactory.pow;
import static ru.gdr.expression.MockFactory.*;

/**
 * Created by Makhnovets on 20.05.2016.
 */
public class FuncLevel4 {
    FuncLevel5 func5 =new FuncLevel5();
    FuncLevel7 func7 =new FuncLevel7();
    Sin sin=new Sin();
    public double TrigFunc2(double arg, double precision) {
        return func5.TrigFunc3(arg, precision)+sin.Sin(arg, precision);
    }
    public double TrigFunc6(double arg, double precision) {
        return func7.Cot(arg, precision)+ func5.TrigFunc7(arg, precision);
    }
    public double LogFunc2(double arg, double precision) {
        return Math.pow(func5.LogFunc3(arg, precision),3);
    }
//Implementation using stubs
//    public double TrigFunc2(double arg, double precision) {
//        return func5.TrigFunc3(arg, precision)+sin.Sin(arg, precision);
//    }
//    public double TrigFunc6(double arg, double precision) {
//        return func7.Cot(arg, precision)+ func5.TrigFunc7(arg, precision);
//    }
//    public double LogFunc2(double arg, double precision) {
//        return Math.pow(func5.LogFunc3(arg, precision),3);
//    }
}
