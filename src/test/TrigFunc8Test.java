package test;

import org.junit.Before;
import org.junit.Test;
import ru.gdr.expression.function.Func;
import ru.gdr.expression.function.FuncLevel6;

import static org.junit.Assert.assertEquals;

/**
 * Created by Makhnovets on 16.05.2016.
 */
public class TrigFunc8Test {
    FuncLevel6 func;
    double result;
    double precision;
    double expectedValue;

    @Before
    public void setUp() {
        func = new FuncLevel6();
        precision = 0.0001;
        result = Double.NaN;
    }

    //Infinity
    @Test
    public void FuncTestPosInf() {
        expectedValue = 1;
        result = func.TrigFunc8(Double.POSITIVE_INFINITY, precision);
        assertEquals(expectedValue, result, 0.01);
    }

    @Test
    public void FuncTestNegInf() {
        expectedValue = 1;
        result = func.TrigFunc8(Double.NEGATIVE_INFINITY, precision);
        assertEquals(expectedValue, result, 0.01);
    }

    //0
    @Test
    public void FuncTestPointNull() {
        expectedValue = Double.NaN;
        result = func.TrigFunc8(0, precision);
        assertEquals(expectedValue, result, 0.01);
    }

    @Test
    public void FuncTestPointNull_l() {
        expectedValue = 1;
        result = func.TrigFunc8(-0.03, precision);
        assertEquals(expectedValue, result, 0.01);
    }

    @Test
    public void FuncTestPointNull_r() {
        expectedValue = 1;
        result = func.TrigFunc8(+0.03, precision);
        assertEquals(expectedValue, result, 0.01);
    }

    //-pi -3.14159265359
    @Test
    public void FuncTestPointMPi() {
        expectedValue = 1;
        result = func.TrigFunc8(-Math.PI, precision);
        assertEquals(expectedValue, result, 0.01);
    }

    //-2pi -6.28318530718
    @Test
    public void FuncTestPointM2Pi() {
        expectedValue = 1;
        result = func.TrigFunc8(-2 * Math.PI, precision);
        assertEquals(expectedValue, result, 0.01);
    }
}