package test;

import org.junit.Before;
import org.junit.Test;
import ru.gdr.expression.function.Func;
import ru.gdr.expression.function.FuncLevel4;

import static org.junit.Assert.assertEquals;

/**
 * Created by Makhnovets on 16.05.2016.
 */
public class LogFunc2Test {
    FuncLevel4 func;
    double result;
    double precision;
    double expectedValue;

    @Before
    public void setUp() {
        func = new FuncLevel4();
        precision = 0.000001;
        result = Double.NaN;
    }
    //0
    @Test(timeout = 10000)
    public void FuncTestPoint0(){
        expectedValue=Double.NEGATIVE_INFINITY;
        result=func.LogFunc2(0,precision);
        assertEquals(expectedValue, result,0.01);
    }
    @Test
    public void FuncTestPoint0_l(){
        expectedValue=Double.NaN;
        result=func.LogFunc2(-0.03,precision);
        assertEquals(expectedValue, result,0.01);
    }
    @Test
    public void FuncTestPoint0_r(){
        expectedValue=133.9030719;
        result=func.LogFunc2(+0.03,precision);
        assertEquals(expectedValue, result,0.1);
    }
    //Infinity
    @Test
    public void FuncTestPosInf(){
        expectedValue=Double.NaN;
        result=func.LogFunc2(Double.POSITIVE_INFINITY,precision);
        assertEquals(expectedValue, result,0.01);
    }
    @Test
    public void FuncTestNegInf(){
        expectedValue=Double.NaN;
        result=func.LogFunc2(Double.NEGATIVE_INFINITY,precision);
        assertEquals(expectedValue, result,0.01);
    }
    //1
    @Test
    public void FuncTestPoint1(){
        expectedValue=Double.NaN;
        result=func.LogFunc2(1,precision);
        assertEquals(expectedValue, result,0.01);
    }
    @Test
    public void FuncTestPoint1_l(){
        expectedValue=4.4101139;
        result=func.LogFunc2(1-0.03,precision);
        assertEquals(expectedValue, result,0.01);
    }
    @Test
    public void FuncTestPoint1_r(){
        expectedValue=3.9434067;
        result=func.LogFunc2(1+0.03,precision);
        assertEquals(expectedValue, result,0.01);
    }
    //5
    @Test
    public void FuncTestPoint5(){
        expectedValue=0;
        result=func.LogFunc2(5,precision);
        assertEquals(expectedValue, result,0.01);
    }
    @Test
    public void FuncTestPoint5_l(){
        expectedValue=0.002089;
        result=func.LogFunc2(5-0.6,precision);
        assertEquals(expectedValue, result,0.01);
    }
    @Test
    public void FuncTestPoint5_r(){
        expectedValue=-0.0014555;
        result=func.LogFunc2(5+0.06,precision);
        assertEquals(expectedValue, result,0.01);
    }
}