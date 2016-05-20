package test;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import ru.gdr.expression.function.Func;
import ru.gdr.expression.function.FuncLevel2;

/**
 * Created by Makhnovets on 16.05.2016.
 */
public class LogFuncTest {
    FuncLevel2 func;
    double result;
    double precision;
    double expectedValue;

    @Before
    public void setUp() {
        func = new FuncLevel2();
        precision = 0.000001;
        result = Double.NaN;
    }

    //0
    @Test(timeout = 10000)
    public void FuncTestPoint0() {
        expectedValue = Double.NaN;
        result = func.LogFunc(0, precision);
        assertEquals(expectedValue, result, 0.01);
    }

    @Test
    public void FuncTestPoint0_l() {
        expectedValue = Double.NaN;
        result = func.LogFunc(-0.03, precision);
        assertEquals(expectedValue, result, 0.01);
    }

    @Test
    public void FuncTestPoint0_r() {
        expectedValue = -66.2056925;
        result = func.LogFunc(+0.03, precision);
        assertEquals(expectedValue, result, 0.01);
    }

    //Infinity
    @Test
    public void FuncTestPosInf() {
        expectedValue = Double.NaN;
        result = func.LogFunc(Double.POSITIVE_INFINITY, precision);
        assertEquals(expectedValue, result, 0.01);
    }

    @Test
    public void FuncTestNegInf() {
        expectedValue = Double.NaN;
        result = func.LogFunc(Double.NEGATIVE_INFINITY, precision);
        assertEquals(expectedValue, result, 0.01);
    }

    //1
    @Test
    public void FuncTestPoint1() {
        expectedValue = Double.NEGATIVE_INFINITY;
        result = func.LogFunc(1, precision);
        assertEquals(expectedValue, result, 0.01);
    }

    @Test
    public void FuncTestPoint1_l() {
        expectedValue = -233.0269255;
        result = func.LogFunc(1 - 0.03, precision);
        assertEquals(expectedValue, result, 0.01);
    }

    @Test
    public void FuncTestPoint1_r() {
        expectedValue = 214.712972;
        result = func.LogFunc(1 + 0.03, precision);
        assertEquals(expectedValue, result, 0.01);
    }

    //0.45634
    @Test
    public void FuncTestFirstPoint() {
        expectedValue = -28.3828053;
        result = func.LogFunc(0.45634, precision);
        assertEquals(expectedValue, result, 0.01);
    }

    @Test
    public void FuncTestFirstPoint_l() {
        expectedValue = -28.4521796;
        result = func.LogFunc(0.45634 - 0.03, precision);
        assertEquals(expectedValue, result, 0.01);
    }

    @Test
    public void FuncTestFirstPoint_r() {
        expectedValue = -28.4531882;
        result = func.LogFunc(0.45634 + 0.03, precision);
        assertEquals(expectedValue, result, 0.01);
    }

    //2.69
    @Test
    public void FuncTestPoint2Point69() {
        expectedValue = 0;
        result = func.LogFunc(2.69841, precision);
        assertEquals(expectedValue, result, 0.01);
    }

    @Test
    public void FuncTestPoint2Point69_l() {
        expectedValue = 0.0341559;
        result = func.LogFunc(2.69841 - 0.03, precision);
        assertEquals(expectedValue, result, 0.01);
    }

    @Test
    public void FuncTestPoint2Point69_r() {
        expectedValue = -0.032585;
        result = func.LogFunc(2.69841 + 0.03, precision);
        assertEquals(expectedValue, result, 0.01);
    }

    //5
    @Test
    public void FuncTestPoint2Point5() {
        expectedValue = -1;
        result = func.LogFunc(5, precision);
        assertEquals(expectedValue, result, 0.01);
    }

    //1.5
    @Test
    public void FuncTestPoint2Point1Point5() {
        expectedValue = 6.8639395301;
        result = func.LogFunc(1.5, precision);
        assertEquals(expectedValue, result, 0.01);
    }
}