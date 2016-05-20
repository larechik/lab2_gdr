package test;

import org.junit.Before;
import org.junit.Test;
import ru.gdr.expression.function.Func;
import ru.gdr.expression.function.FuncLevel3;

import static org.junit.Assert.assertEquals;

/**
 * Created by Makhnovets on 16.05.2016.
 */
public class LogFunc5Test {
    FuncLevel3 func;
    double result;
    double precision;
    double expectedValue;

    @Before
    public void setUp() {
        func = new FuncLevel3();
        precision = 0.0001;
        result = Double.NaN;
    }
    //0
    @Test(timeout = 10000)
    public void FuncTestPoint0(){
        expectedValue=Double.NaN;
        result=func.LogFunc5(0,precision);
        assertEquals(expectedValue, result,0.01);
    }
    @Test
    public void FuncTestPoint0_l(){
        expectedValue=Double.NaN;
        result=func.LogFunc5(-0.03,precision);
        assertEquals(expectedValue, result,0.01);
    }
    @Test
    public void FuncTestPoint0_r(){
        expectedValue=4.7469381;
        result=func.LogFunc5(0.03,precision);
        assertEquals(expectedValue, result,0.01);
    }
    //Infinity
    @Test
    public void FuncTestPosInf(){
        expectedValue=Double.POSITIVE_INFINITY;
        result=func.LogFunc5(Double.POSITIVE_INFINITY,precision);
        assertEquals(expectedValue, result,0.01);
    }
    @Test
    public void FuncTestNegInf(){
        expectedValue=Double.NaN;
        result=func.LogFunc5(Double.NEGATIVE_INFINITY,precision);
        assertEquals(expectedValue, result,0.01);
    }
    //1
    @Test
    public void FuncTestPoint1(){
        expectedValue=0;
        result=func.LogFunc5(1,precision);
        assertEquals(expectedValue, result,0.01);
    }
    @Test
    public void FuncTestPoint1_l(){
        expectedValue=0.0042856;
        result=func.LogFunc5(1-0.1,precision);
        assertEquals(expectedValue, result,0.01);
    }
    @Test
    public void FuncTestPoint1_r(){
        expectedValue=0.003507;
        result=func.LogFunc5(1+0.1,precision);
        assertEquals(expectedValue, result,0.01);
    }
    //5
    @Test
    public void FuncTestPoint5() {
        expectedValue = 1;
        result=func.LogFunc5(5, precision);
        assertEquals(expectedValue, result, 0.01);
    }
}