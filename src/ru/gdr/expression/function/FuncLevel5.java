package ru.gdr.expression.function;

import static ru.gdr.expression.ExpFactory.divide;
import static ru.gdr.expression.ExpFactory.minus;
import static ru.gdr.expression.ExpFactory.multiply;
import static ru.gdr.expression.MockFactory.*;

/**
 * Created by Makhnovets on 20.05.2016.
 */
public class FuncLevel5 {
    FuncLevel6 func6 = new FuncLevel6();
    FuncLevel7 func7 = new FuncLevel7();
    FuncLevel8 func8=new FuncLevel8();
    Sec sec=new Sec();
    public double LogFunc3(double arg, double precision) {
        return func6.LogFunc4(arg, precision)-func8.Ln(arg, precision);
    }
    public double TrigFunc7(double arg, double precision) {
        return func6.TrigFunc8(arg, precision)/func7.TrigFunc9(arg, precision);
    }
    public double TrigFunc3(double arg, double precision) {
        return func6.LogFunc4(arg, precision)*sec.Sec(arg, precision);
    }
    //написать заглушки
//    public double LogFunc3(double arg, double precision) {
//        return func6.LogFunc4(arg, precision)-func8.Ln(arg, precision);
//    }
//    public double TrigFunc7(double arg, double precision) {
//        return func6.TrigFunc8(arg, precision)/func7.TrigFunc9(arg, precision);
//    }
//    public double TrigFunc3(double arg, double precision) {
//        return func6.LogFunc4(arg, precision)*sec.Sec(arg, precision);
//    }
}
