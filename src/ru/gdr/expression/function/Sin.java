package ru.gdr.expression.function;

import static ru.gdr.expression.ExpFactory.variable;
import static ru.gdr.expression.MockFactory.mockSec;
import static ru.gdr.expression.ExpFactory.sin;

/**
 * Created by Makhnovets on 20.05.2016.
 */
public class Sin {

    public double Sin(double arg, double precision) {

        return sin(variable()).evaluate(arg, precision);
    }
}
