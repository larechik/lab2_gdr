package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ru.gdr.expression.function.Sec;

/**
 * Created by Makhnovets on 16.05.2016.
 */
public class SecTest {
        Sec func;
    double result;
    double precision;
    double expectedValue;

    @Before
    public void setUp() {
        func = new Sec();
        precision = 0.0001;
        result = Double.NaN;
    }

    @Test
    public void point0() {
        expectedValue=1.0;
        result=func.Sec(0,precision);
        Assert.assertEquals(expectedValue,result,0.01);
    }
    @Test
    public void point0_r() {
        expectedValue=1.004;
        result=func.Sec(0,precision);
        Assert.assertEquals(expectedValue,result,0.01);
    }
    @Test
    public void point0_l() {
        expectedValue=1.004;
        result=func.Sec(-0.09,precision);
        Assert.assertEquals(expectedValue,result,0.01);
    }

    // Boundary-value: PI/2
    @Test(timeout=20000)
    public void pointPiDiv2() {
        expectedValue=Double.POSITIVE_INFINITY;
        result=func.Sec(Math.PI/2,precision);
        Assert.assertEquals(expectedValue,result,0.01);
    }
    @Test
    public void pointPiDiv2_r() {
        expectedValue=-11.126;
        result=func.Sec(Math.PI/2+0.09,precision);
        Assert.assertEquals(expectedValue,result,0.01);
    }
    @Test
    public void pointPiDiv2_l() {
        expectedValue=11.126;
        result=func.Sec((Math.PI/2)-0.09,precision);
        Assert.assertEquals(expectedValue,result,0.01);
    }

    // Boundary-value: -PI/2
    @Test(timeout=20000)
    public void pointMPiDiv2() {
        expectedValue=Double.POSITIVE_INFINITY;
        result=func.Sec(-Math.PI/2,precision);
        Assert.assertEquals(expectedValue,result,0.01);
    }
    @Test
    public void pointMPiDiv2_r() {
        expectedValue=+11.126;
        result=func.Sec(-Math.PI/2+0.09,precision);
        Assert.assertEquals(expectedValue,result,0.01);
    }
    @Test
    public void pointMPiDiv2_l() {
        expectedValue=-11.126;
        result=func.Sec(-Math.PI/2-0.09,precision);
        Assert.assertEquals(expectedValue,result,0.01);
    }

    // Boundary-value: PI
    @Test
    public void pointPi() {
        expectedValue=-1.0;
        result=func.Sec(Math.PI,precision);
        Assert.assertEquals(expectedValue,result,0.01);
    }
    @Test
    public void pointPi_r() {
        expectedValue=-1.004;
        result=func.Sec(Math.PI+0.09,precision);
        Assert.assertEquals(expectedValue,result,0.01);
    }
    @Test
    public void pointPi_l() {
        expectedValue=-1.004;
        result=func.Sec(Math.PI-0.09,precision);
        Assert.assertEquals(expectedValue,result,0.01);
    }

    // Boundary-value: 3PI/2
    @Test(timeout=20000)
    public void point3PiDiv2() {
        expectedValue=Double.POSITIVE_INFINITY;
        result=func.Sec(3*Math.PI/2,precision);
        Assert.assertEquals(expectedValue,result,0.01);
    }
    @Test
    public void point3PiDiv2_r() {
        expectedValue=11.126;
        result=func.Sec(3*Math.PI/2+0.09,precision);
        Assert.assertEquals(expectedValue,result,1);
    }
    @Test
    public void point3PiDiv2_l() {
        expectedValue=-11.126;
        result=func.Sec(3*Math.PI/2-0.09,precision);
        Assert.assertEquals(expectedValue,result,0.1);
    }

    // Positive infinity
    @Test
    public void posInfTest() {
        expectedValue=Double.NaN;
        result=func.Sec(Double.POSITIVE_INFINITY,precision);
        Assert.assertEquals(expectedValue,result,0.01);
    }
    // Negative infinity
    @Test
    public void negInfTest() {
        expectedValue=Double.NaN;
        result=func.Sec(Double.NEGATIVE_INFINITY,precision);
        Assert.assertEquals(expectedValue,result,0.01);
    }
}