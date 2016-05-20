package test;

import org.junit.Before;
import org.junit.Test;
import ru.gdr.expression.function.Func;

import static org.junit.Assert.*;

/**
 * Created by Makhnovets on 16.05.2016.
 */
public class BigFuncTest {
    Func func;
    double result;
    double precision;
    double expectedValue;

    @Before
    public void setUp() {
        func = new Func();
        precision = 0.001;
        result = Double.NaN;
    }

    @Test
    public void FuncTestNull() {
        expectedValue = Double.NEGATIVE_INFINITY;
        result = func.BigFunc(0, precision);
        assertEquals(expectedValue, result, 0.01);
    }

    @Test
    public void FuncTestNull_l() {
        expectedValue = -32.3669651;
        result = func.BigFunc(0 - 0.03, precision);
        assertEquals(expectedValue, result, 0.01);
    }

    @Test
    public void FuncTestNull_r() {
        expectedValue = -66.2056925;
        result = func.BigFunc(0 + 0.03, precision);
        assertEquals(expectedValue, result, 0.01);
    }

    //>0
    @Test
    public void FuncTestMaxLn() {
        expectedValue = -28.38381;
        result = func.BigFunc(0.45634, precision);
        assertEquals(expectedValue, result, 0.01);
    }

    @Test
    public void FuncTestMaxLn_r() {
        expectedValue = -28.4531882;
        result = func.BigFunc(0.45634 + 0.03, precision);
        assertEquals(expectedValue, result, 0.01);
    }

    @Test
    public void FuncTestMaxLn_l() {
        expectedValue = -28.4521796;
        result = func.BigFunc(0.45634 - 0.03, precision);
        assertEquals(expectedValue, result, 0.01);
    }

    @Test
    public void FuncTestPointOne() {
        expectedValue = Double.NEGATIVE_INFINITY;
        result = func.BigFunc(1, precision);
        assertEquals(expectedValue, result, 0.01);
    }

    @Test
    public void FuncTestPointOne_l() {
        expectedValue = -233.0269255;
        result = func.BigFunc(1 - 0.03, precision);
        assertEquals(expectedValue, result, 0.01);
    }

    @Test
    public void FuncTestPointOne_r() {
        expectedValue = 214.712972;
        result = func.BigFunc(1 + 0.03, precision);
        assertEquals(expectedValue, result, 0.01);
    }

    @Test
    public void FuncTestPointInPositiv() {
        expectedValue = 0;
        result = func.BigFunc(2.69841, precision);
        assertEquals(expectedValue, result, 0.01);
    }

    @Test
    public void FuncTestPointInPositiv5() {
        expectedValue = -1;
        result = func.BigFunc(5, precision);
        assertEquals(expectedValue, result, 0.01);
    }

    @Test
    public void FuncTestPointInPositiv1point5() {
        expectedValue = 6.8639395;
        result = func.BigFunc(1.5, precision);
        assertEquals(expectedValue, result, 0.01);
    }

    //Infinity
    @Test
    public void FuncTestPosInf() {
        expectedValue = Double.NEGATIVE_INFINITY;
        result = func.BigFunc(Double.POSITIVE_INFINITY, precision);
        assertEquals(expectedValue, result, 0.01);
    }

    @Test
    public void FuncTestNegInf() {
        expectedValue = Double.NaN;
        result = func.BigFunc(Double.NEGATIVE_INFINITY, precision);
        assertEquals(expectedValue, result, 0.01);
    }

    //<0
    @Test
    public void FuncTestFirstNull() {
        expectedValue = 0;
        result = func.BigFunc(-0.68763, precision);
        assertEquals(expectedValue, result, 0.01);
    }

    @Test
    public void FuncTestFirstNull_l() {
        expectedValue = 0.1967817;
        result = func.BigFunc(-0.68763 - 0.03, precision);
        assertEquals(expectedValue, result, 0.01);
    }

    @Test
    public void FuncTestFirstNull_r() {
        expectedValue = -0.1837535;
        result = func.BigFunc(-0.68763 + 0.03, precision);
        assertEquals(expectedValue, result, 0.01);
    }

    @Test
    public void FuncTestSecondNull() {
        expectedValue = 0;
        result = func.BigFunc(-2.3437, precision);
        assertEquals(expectedValue, result, 0.01);
    }

    @Test
    public void FuncTestSecondNull_l() {
        expectedValue = -0.2841435;
        result = func.BigFunc(-2.3437 - 0.03, precision);
        assertEquals(expectedValue, result, 0.01);
    }

    @Test
    public void FuncTestSecondNull_r() {
        expectedValue = 0.3113737;
        result = func.BigFunc(-2.3437 + 0.03, precision);
        assertEquals(expectedValue, result, 0.01);
    }

    @Test
    public void FuncTestThirdNull() {
        expectedValue = 0;
        result = func.BigFunc(-3.75974, precision);
        assertEquals(expectedValue, result, 0.01);
    }

    @Test
    public void FuncTestThirdNull_l() {
        expectedValue = -0.1279823;
        result = func.BigFunc(-3.75974 - 0.03, precision);
        assertEquals(expectedValue, result, 0.01);
    }

    @Test
    public void FuncTestThirdNull_r() {
        expectedValue = 0.1315238;
        result = func.BigFunc(-3.75974 + 0.03, precision);
        assertEquals(expectedValue, result, 0.01);
    }

    @Test
    public void FuncTestMaxTrig() {
        expectedValue = 3.8691734;
        result = func.BigFunc(-5.69725, precision);
        assertEquals(expectedValue, result, 0.01);
    }

    @Test
    public void FuncTestMaxTrig_l() {
        expectedValue = 3.87657733;
        result = func.BigFunc(-5.69725 - 0.03, precision);
        assertEquals(expectedValue, result, 0.01);
    }

    @Test
    public void FuncTestMaxTrig_r() {
        expectedValue = 3.8754132;
        result = func.BigFunc(-5.69725 + 0.03, precision);
        assertEquals(expectedValue, result, 0.01);
    }

    @Test
    public void FuncTestPointMPiDiv2() {
        expectedValue = Double.POSITIVE_INFINITY;
        result = func.BigFunc(-Math.PI / 2, precision);
        assertEquals(expectedValue, result, 0.01);
    }

    @Test
    public void FuncTestPointMPiDiv2_l() {
        expectedValue = 2219.3778647;
        result = func.BigFunc(-Math.PI / 2 - 0.03, precision);
        assertEquals(expectedValue, result, 0.01);
    }

    @Test
    public void FuncTestPointMPiDiv2_r() {
        expectedValue = 2219.3999277;
        result = func.BigFunc(-Math.PI / 2 + 0.03, precision);
        assertEquals(expectedValue, result, 0.01);
    }

    @Test
    public void FuncTestPointM3PiDiv2() {
        expectedValue = Double.NEGATIVE_INFINITY;
        result = func.BigFunc(-3 * Math.PI / 2, precision);
        assertEquals(expectedValue, result, 0.01);
    }

    @Test
    public void FuncTestPointM3PiDiv2_l() {
        expectedValue = 68.1617357;
        result = func.BigFunc(-3 * Math.PI / 2 - 0.03, precision);
        assertEquals(expectedValue, result, 0.1);
    }

    @Test
    public void FuncTestPointM3PiDiv2_r() {
        expectedValue = -65.1615975;
        result = func.BigFunc(-3 * Math.PI / 2 + 0.03, precision);
        assertEquals(expectedValue, result, 0.01);
    }

    @Test
    public void FuncTestPointMPi() {
        expectedValue = Double.POSITIVE_INFINITY;
        result = func.BigFunc(-Math.PI, precision);
        assertEquals(expectedValue, result, 0.01);
    }

    @Test
    public void FuncTestPointMPi_l() {
        expectedValue = 32.3086966;
        result = func.BigFunc(-Math.PI - 0.03, precision);
        assertEquals(expectedValue, result, 0.01);
    }

    @Test
    public void FuncTestPointMPi_r() {
        expectedValue = -34.3078991;
        result = func.BigFunc(-Math.PI + 0.03, precision);
        assertEquals(expectedValue, result, 0.01);
    }

    @Test
    public void FuncTestPointM2Pi() {
        expectedValue = Double.POSITIVE_INFINITY;
        result = func.BigFunc(-2 * Math.PI, precision);
        assertEquals(expectedValue, result, 0.01);
    }

    @Test
    public void FuncTestPointM2Pi_l() {
        expectedValue = -32.3669731;
        result = func.BigFunc(-2 * Math.PI - 0.03, precision);
        assertEquals(expectedValue, result, 0.01);
    }

    @Test
    public void FuncTestPointM2Pi_r() {
        expectedValue = 34.3696586;
        result = func.BigFunc(-2 * Math.PI + 0.03, precision);
        assertEquals(expectedValue, result, 0.01);
    }

}
