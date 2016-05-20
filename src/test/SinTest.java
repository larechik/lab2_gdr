package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import ru.gdr.expression.function.Sin;

/**
 * Created by Makhnovets on 16.05.2016.
 */
public class SinTest {
        Sin func;
    double result;
    double precision;
    double expectedValue;

    @Before
    public void setUp() {
        func = new Sin();
        precision = 0.0001;
        result = Double.NaN;
    }

    @Test
    public void SinTestPoint0(){
        expectedValue=0;
        result=func.Sin(0,precision);
        Assert.assertEquals(expectedValue,result,0.01);
    }
    @Test
    public void SinTestPoint0_r(){
        expectedValue=0.0299955;
        result=func.Sin(0.03,precision);
        Assert.assertEquals(expectedValue,result,0.01);
    }
    @Test
    public void SinTestPoint0_l(){
        expectedValue=-0.0299955;
        result=func.Sin(-0.03,precision);
        Assert.assertEquals(expectedValue,result,0.01);
    }
    @Test
    public void SinTestPointPiDiv2(){
        expectedValue=1;
        result=func.Sin(Math.PI/2,precision);
        Assert.assertEquals(expectedValue,result,0.01);
    }
    @Test
    public void SinTestPointPiDiv2_r(){
        expectedValue=0.999550034;
        result=func.Sin(Math.PI/2+0.03,precision);
        Assert.assertEquals(expectedValue,result,0.01);
    }
    @Test
    public void SinTestPointPiDiv2_l(){
        expectedValue=0.999550034;
        result=func.Sin(Math.PI/2-0.03,precision);
        Assert.assertEquals(expectedValue,result,0.01);
    }
    @Test
    public void SinTestPointMPiDiv2(){
        expectedValue=-1;
        result=func.Sin(-Math.PI/2,precision);
        Assert.assertEquals(expectedValue,result,0.01);
    }
    @Test
    public void SinTestPointMPiDiv2_r(){
        expectedValue=-0.999550034;
        result=func.Sin(-Math.PI/2+0.03,precision);
        Assert.assertEquals(expectedValue,result,0.01);
    }
    @Test
    public void SinTestPointMPiDiv2_l(){
        expectedValue=-0.999550034;
        result=func.Sin(-Math.PI/2-0.03,precision);
        Assert.assertEquals(expectedValue,result,0.01);
    }
    @Test
    public void SinTestPointPi(){
        expectedValue=0;
        result=func.Sin(Math.PI,precision);
        Assert.assertEquals(expectedValue,result,0.01);
    }
    @Test
    public void SinTestPointPi_r(){
        expectedValue=-0.0299955;
        result=func.Sin(Math.PI+0.03,precision);
        Assert.assertEquals(expectedValue,result,0.01);
    }
    @Test
    public void SinTestPointPi_l(){
        expectedValue=0.0299955;
        result=func.Sin(Math.PI-0.03,precision);
        Assert.assertEquals(expectedValue,result,0.01);
    }
    @Test
    public void SinTestPointMPi(){
        expectedValue=0;
        result=func.Sin(-Math.PI,precision);
        Assert.assertEquals(expectedValue,result,0.01);
    }
    @Test
    public void SinTestPointMPi_r(){
        expectedValue=-0.0299955;
        result=func.Sin(-Math.PI+0.03,precision);
        Assert.assertEquals(expectedValue,result,0.01);
    }
    @Test
    public void SinTestPointMPi_l(){
        expectedValue=0.0299955;
        result=func.Sin(-Math.PI-0.03,precision);
        Assert.assertEquals(expectedValue,result,0.01);
    }
    @Test
    public void SinTestPosInf(){
        expectedValue=Double.NaN;
        result=func.Sin(Double.POSITIVE_INFINITY,precision);
        Assert.assertEquals(expectedValue,result,0.01);
    }
    @Test
    public void SinTestNegInf(){
        expectedValue=Double.NaN;
        result=func.Sin(Double.NEGATIVE_INFINITY,precision);
        Assert.assertEquals(expectedValue,result,0.01);
    }
}