package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ru.gdr.expression.function.Func;
import ru.gdr.expression.function.FuncLevel2;
import ru.gdr.expression.function.FuncLevel8;

import static org.junit.Assert.assertEquals;

/**
 * Created by Makhnovets on 16.05.2016.
 */
public class TanTest {

    FuncLevel8 func;
    double result;
    double precision;
    double expectedValue;

    @Before
    public void setUp() {
        func = new FuncLevel8();
        precision = 0.0001;
        result = Double.NaN;
    }

    @Test
    public void tanTestPoint0() {
        expectedValue = 0;
        result = func.Tan(0, precision);
        Assert.assertEquals(expectedValue, result, 0.01);
    }

    @Test
    public void tanTestPoint0_l() {
        expectedValue = -0.030009;
        result = func.Tan(-0.03, precision);
        Assert.assertEquals(expectedValue, result, 0.01);
    }

    @Test
    public void tanTestPoint0_r() {
        expectedValue = 0.030009;
        result = func.Tan(0.03, precision);
        Assert.assertEquals(expectedValue, result, 0.01);
    }

    @Test
    public void tanTestPointPiDiv2() {
        expectedValue = Double.POSITIVE_INFINITY;
        result = func.Tan(Math.PI / 2, precision);
        Assert.assertEquals(expectedValue, result, 0.01);
    }

    @Test
    public void tanTestPointPiDiv2_l() {
        expectedValue = 33.3233327;
        result = func.Tan((Math.PI / 2) - 0.03, precision);
        Assert.assertEquals(expectedValue, result, 0.1);
    }

    @Test
    public void tanTestPointPiDiv2_r() {
        expectedValue = -33.3233327;
        result = func.Tan(Math.PI / 2 + 0.03, precision);
        Assert.assertEquals(expectedValue, result, 0.01);
    }

    @Test
    public void tanTestPointMPiDiv2() {
        expectedValue = Double.NEGATIVE_INFINITY;
        result = func.Tan(-Math.PI / 2, precision);
        Assert.assertEquals(expectedValue, result, 0.01);
    }

    @Test
    public void tanTestPointMPiDiv2_l() {
        expectedValue = 33.3233327;
        result = func.Tan(-Math.PI / 2 - 0.03, precision);
        Assert.assertEquals(expectedValue, result, 0.1);
    }

    @Test
    public void tanTestPointMPiDiv2_r() {
        expectedValue = -33.3233327;
        result = func.Tan(-Math.PI / 2 + 0.03, precision);
        Assert.assertEquals(expectedValue, result, 0.1);
    }

    @Test
    public void tanTestPointMPiDiv4() {
        expectedValue = -1;
        result = func.Tan(-Math.PI / 4, precision);
        Assert.assertEquals(expectedValue, result, 0.01);
    }

    @Test
    public void tanTestPointPiDiv4() {
        expectedValue = 1;
        result = func.Tan(Math.PI / 4, precision);
        Assert.assertEquals(expectedValue, result, 0.01);
    }

    //Infinity
    @Test
    public void FuncTestPosInf() {
        expectedValue = Double.NaN;
        result = func.Tan(Double.POSITIVE_INFINITY, precision);
        assertEquals(expectedValue, result, 0.001);
    }

    @Test
    public void FuncTestNegInf() {
        expectedValue = Double.NaN;
        result = func.Tan(Double.NEGATIVE_INFINITY, precision);
        assertEquals(expectedValue, result, 0.001);
    }
}