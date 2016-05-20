package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ru.gdr.expression.function.Func;
import ru.gdr.expression.function.FuncLevel8;

/**
 * Created by Makhnovets on 16.05.2016.
 */
public class LnTest {
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
    @Test(timeout = 10000)
    public void LnTestPoint0(){
        expectedValue=Double.NEGATIVE_INFINITY;
        result=func.Ln(0,precision);
        Assert.assertEquals(expectedValue, result,0.01);
    }
    @Test
    public void LnTestPoint0_l(){
        expectedValue=Double.NaN;
        result=func.Ln(-0.01,precision);
        Assert.assertEquals(expectedValue,result,0.01);
    }
    @Test
    public void LnTestPoint0_r(){
        expectedValue=-4.605170;
        result=func.Ln(0.01,precision);
        Assert.assertEquals(expectedValue,result,0.01);
    }
    @Test
    public void LnTestPoint1(){
        expectedValue=0;
        result=func.Ln(1,precision);
        Assert.assertEquals(expectedValue,result,0.01);
    }
    @Test
    public void LnTestPoint1_l(){
        expectedValue=-0.0100503;
        result=func.Ln(1-0.01,precision);
        Assert.assertEquals(expectedValue,result,0.01);
    }
    @Test
    public void LnTestPoint1_r(){
        expectedValue=0.00995033;
        result=func.Ln(1+0.01,precision);
        Assert.assertEquals(expectedValue,result,0.01);
    }
    @Test
    public void LnTestPosInf(){
        expectedValue=Double.POSITIVE_INFINITY;
        result=func.Ln(Double.POSITIVE_INFINITY,precision);
        Assert.assertEquals(expectedValue,result,0.01);
    }
    @Test
    public void LnTestNegInf(){
        expectedValue=Double.NaN;
        result=func.Ln(Double.NEGATIVE_INFINITY,precision);
        Assert.assertEquals(expectedValue,result,0.01);
    }
    @Test
    public void LnTestPointE(){
        expectedValue=1;
        result=func.Ln(2.718281828,precision);
        Assert.assertEquals(expectedValue,result,0.01);
    }
    @Test
    public void LnTestPointEin2(){
        expectedValue=2;
        result=func.Ln(2.718281828*2.718281828,precision);
        Assert.assertEquals(expectedValue,result,0.01);
    }

}