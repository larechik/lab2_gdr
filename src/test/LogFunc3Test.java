package test;

import org.junit.Before;
import org.junit.Test;
import ru.gdr.expression.function.Func;
import ru.gdr.expression.function.FuncLevel5;

import static org.junit.Assert.assertEquals;

/**
 * Created by Makhnovets on 16.05.2016.
 */
public class LogFunc3Test {
    FuncLevel5 func;
    double result;
    double precision;
    double expectedValue;

    @Before
    public void setUp() {
        func = new FuncLevel5();
        precision = 0.0001;
        result = Double.NaN;
    }
    //0
    @Test(timeout = 10000)
    public void FuncTestPoint0(){
        expectedValue=Double.NaN;
        result=func.LogFunc3(0,precision);
        assertEquals(expectedValue, result,0.01);
    }
    @Test
    public void FuncTestPoint0_l(){
        expectedValue=Double.NaN;
        result=func.LogFunc3(-0.03,precision);
        assertEquals(expectedValue, result,0.01);
    }
    @Test
    public void FuncTestPoint0_r(){
        expectedValue=5.1159958098;
        result=func.LogFunc3(+0.03,precision);
        assertEquals(expectedValue, result,0.01);
    }
    //Infinity
    @Test
    public void FuncTestPosInf(){
        expectedValue=Double.NaN;
        result=func.LogFunc3(Double.POSITIVE_INFINITY,precision);
        assertEquals(expectedValue, result,0.01);
    }
    @Test
    public void FuncTestNegInf(){
        expectedValue=Double.NaN;
        result=func.LogFunc3(Double.NEGATIVE_INFINITY,precision);
        assertEquals(expectedValue, result,0.01);
    }
    //1
    @Test
    public void FuncTestPoint1(){
        expectedValue=Double.NaN;
        result=func.LogFunc3(1,precision);
        assertEquals(expectedValue, result,0.01);
    }
    @Test
    public void FuncTestPoint1_l(){
        expectedValue=1.6398971;
        result=func.LogFunc3(1-0.03,precision);
        assertEquals(expectedValue, result,0.01);
    }
    @Test
    public void FuncTestPoint1_r(){
        expectedValue=1.5798791;
        result=func.LogFunc3(1+0.03,precision);
        assertEquals(expectedValue, result,0.01);
    }
    //5
    @Test
    public void FuncTestPoint5(){
        expectedValue=0;
        result=func.LogFunc3(5,precision);
        assertEquals(expectedValue, result,0.01);
    }
    @Test
    public void FuncTestPoint5_l(){
        expectedValue=0.127833;
        result=func.LogFunc3(5-0.6,precision);
        assertEquals(expectedValue, result,0.01);
    }
    @Test
    public void FuncTestPoint5_r(){
        expectedValue=-0.0119285;
        result=func.LogFunc3(5+0.06,precision);
        assertEquals(expectedValue, result,0.01);
    }
}