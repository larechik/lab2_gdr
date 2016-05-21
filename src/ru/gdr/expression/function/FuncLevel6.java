package ru.gdr.expression.function;

import static ru.gdr.expression.ExpFactory.add;
import static ru.gdr.expression.ExpFactory.divide;
import static ru.gdr.expression.MockFactory.*;

/**
 * Created by Makhnovets on 20.05.2016.
 */
public class FuncLevel6 {
    FuncLevel7 func7=new FuncLevel7();
    FuncLevel8 func8=new FuncLevel8();
    Sin sin=new Sin();
    public double TrigFunc4(double arg, double precision) {
        return func7.Cot(arg, precision)+sin.Sin(arg, precision);
    }

    public double TrigFunc8(double arg, double precision) {
        if(arg==Double.POSITIVE_INFINITY||arg==Double.NEGATIVE_INFINITY){
            return 1;
        }
        if (func7.Cot(arg, precision)==0) return Double.NaN;
        return func7.Cot(arg, precision)/func7.Cot(arg, precision);
    }

    public double LogFunc4(double arg, double precision) {
        return func8.Ln(arg, precision)/func7.Log_5(arg, precision);
    }
    //Implementation using stubs
//    public double TrigFunc4(double arg, double precision) {
//        return func7.Cot(arg, precision)+sin.Sin(arg, precision);
//    }
//
//    public double TrigFunc8(double arg, double precision) {
//        if (func7.Cot(arg, precision)==0) return Double.NaN;
//        return func7.Cot(arg, precision)/func7.Cot(arg, precision);
//    }
//
//    public double LogFunc4(double arg, double precision) {
//        return func8.Ln(arg, precision)/func7.Log_5(arg, precision);
//    }
}
