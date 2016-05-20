package test;

import org.junit.Before;
import org.junit.Test;
import ru.gdr.expression.function.Func;
import ru.gdr.expression.function.FuncLevel7;

import static org.junit.Assert.assertEquals;

/**
 * Created by Makhnovets on 16.05.2016.
 */
public class Log_5Test {
    FuncLevel7 func;
    double result;
    double precision;
    double expectedValue;

    @Before
    public void setUp() {
        func = new FuncLevel7();
        precision = 0.0001;
        result = Double.NaN;
    }

    //0
    @Test(timeout = 10000)
    public void FuncTestPoint0() {
        expectedValue = Double.NEGATIVE_INFINITY;
        result = func.Log_5(0, precision);
        assertEquals(expectedValue, result, 0.01);
    }

    @Test
    public void FuncTestPoint0_l() {
        expectedValue = Double.NaN;
        result = func.Log_5(-0.03, precision);
        assertEquals(expectedValue, result, 0.01);
    }

    @Test
    public void FuncTestPoint0_r() {
        expectedValue = -2.1787469;
        result = func.Log_5(+0.03, precision);
        assertEquals(expectedValue, result, 0.01);
    }

    //Infinity
    @Test
    public void FuncTestPosInf() {
        expectedValue = Double.POSITIVE_INFINITY;
        result = func.Log_5(Double.POSITIVE_INFINITY, precision);
        assertEquals(expectedValue, result, 0.01);
    }

    @Test
    public void FuncTestNegInf() {
        expectedValue = Double.NaN;
        result = func.Log_5(Double.NEGATIVE_INFINITY, precision);
        assertEquals(expectedValue, result, 0.01);
    }

    //1
    @Test
    public void FuncTestPoint1() {
        expectedValue = 0;
        result = func.Log_5(1, precision);
        assertEquals(expectedValue, result, 0.01);
    }

    @Test
    public void FuncTestPoint1_l() {
        expectedValue = -0.0189254;
        result = func.Log_5(1 - 0.03, precision);
        assertEquals(expectedValue, result, 0.01);
    }

    @Test
    public void FuncTestPoint1_r() {
        expectedValue = 0.0183659;
        result = func.Log_5(1 + 0.03, precision);
        assertEquals(expectedValue, result, 0.01);
    }

    //5
    @Test
    public void FuncTestPoint5() {
        expectedValue = 1;
        result = func.Log_5(5, precision);
        assertEquals(expectedValue, result, 0.01);
    }

}