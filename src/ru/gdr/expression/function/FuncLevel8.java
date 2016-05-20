package ru.gdr.expression.function;

import static ru.gdr.expression.ExpFactory.ln;
import static ru.gdr.expression.ExpFactory.multiply;
import static ru.gdr.expression.ExpFactory.variable;
import static ru.gdr.expression.MockFactory.mockLn;
import static ru.gdr.expression.MockFactory.mockSec;
import static ru.gdr.expression.MockFactory.mockSin;

/**
 * Created by Makhnovets on 20.05.2016.
 */
public class FuncLevel8 {
    Sin sin=new Sin();
    Sec sec=new Sec();
    public double Ln(double arg, double precision) {
        return ln(variable()).evaluate(arg, precision);
    }

    public double Tan(double arg, double precision) {
        return sin.Sin(arg,precision)*sec.Sec(arg, precision);
    }

//    public double Ln(double arg, double precision) {
//        return mockLn().evaluate(arg, precision);
//    }
//
//    public double Tan(double arg, double precision) {
//        return multiply(mockSin(), mockSec()).evaluate(arg, precision);
//    }


}
