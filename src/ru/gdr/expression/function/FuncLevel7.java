package ru.gdr.expression.function;

import static ru.gdr.expression.ExpFactory.multiply;
import static ru.gdr.expression.MockFactory.mockLn;
import static ru.gdr.expression.MockFactory.mockSin;
import static ru.gdr.expression.MockFactory.mockTan;

/**
 * Created by Makhnovets on 20.05.2016.
 */
public class FuncLevel7 {
    FuncLevel8 func8 = new FuncLevel8();
    Sin sin = new Sin();

    public double Log_5(double arg, double precision) {
        return func8.Ln(arg, precision) / func8.Ln(5, precision);
    }

    public double TrigFunc9(double arg, double precision) {
        return func8.Tan(arg, precision) * sin.Sin(arg, precision);
    }

    public double Cot(double arg, double precision) {
        return 1 / func8.Tan(arg, precision);
    }

//    public double Log_5(double arg, double precision) {
//        return func8.Ln(arg, precision) / func8.Ln(5, precision);
//    }
//
//    public double TrigFunc9(double arg, double precision) {
//        return func8.Tan(arg, precision) * sin.Sin(arg, precision);
//    }
//
//    public double Cot(double arg, double precision) {
//        return 1 / func8.Tan(arg, precision);
//    }

}
