package test;

import org.junit.Before;
import org.junit.Test;
import ru.gdr.expression.function.Func;
import ru.gdr.expression.function.FuncLevel3;

import static org.junit.Assert.*;

/**
 * Created by Makhnovets on 16.05.2016.
 */
public class LogFunc1Test {
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
        expectedValue=Double.NEGATIVE_INFINITY;
        result=func.LogFunc1(0,precision);
        assertEquals(expectedValue, result,0.01);
    }
    @Test
    public void FuncTestPoint0_l(){
        expectedValue=Double.NaN;
        result=func.LogFunc1(-0.03,precision);
        assertEquals(expectedValue, result,0.01);
    }
    @Test
    public void FuncTestPoint0_r(){
        expectedValue=-61.4587544;
        result=func.LogFunc1(+0.03,precision);
        assertEquals(expectedValue, result,0.01);
    }
    //Infinity
    @Test
    public void FuncTestPosInf(){
        expectedValue=Double.NaN;
        result=func.LogFunc1(Double.POSITIVE_INFINITY,precision);
        assertEquals(expectedValue, result,0.01);
    }
    @Test
    public void FuncTestNegInf(){
        expectedValue=Double.NaN;
        result=func.LogFunc1(Double.NEGATIVE_INFINITY,precision);
        assertEquals(expectedValue, result,0.01);
    }
    //1
    @Test
    public void FuncTestPoint1(){
        expectedValue=Double.POSITIVE_INFINITY;
        result=func.LogFunc1(1,precision);
        assertEquals(expectedValue, result,0.01);
    }
    @Test
    public void FuncTestPoint1_l(){
        expectedValue=-233.0265673;
        result=func.LogFunc1(1-0.03,precision);
        assertEquals(expectedValue, result,0.01);
    }
    @Test
    public void FuncTestPoint1_r(){
        expectedValue=214.7133093;
        result=func.LogFunc1(1+0.03,precision);
        assertEquals(expectedValue, result,0.01);
    }
    //0.44721
    @Test
    public void FuncTestFirstPoint(){
        expectedValue=-28.1401531;
        result=func.LogFunc1(0.44721,precision);
        assertEquals(expectedValue, result,0.01);
    }
    @Test
    public void FuncTestFirstPoint_l(){
        expectedValue=-28.2050784;
        result=func.LogFunc1(0.44721-0.03,precision);
        assertEquals(expectedValue, result,0.01);
    }
    @Test
    public void FuncTestFirstPoint_r(){
        expectedValue=-28.205964;
        result=func.LogFunc1(0.44721+0.03,precision);
        assertEquals(expectedValue, result,0.01);
    }

    //5
    @Test
    public void FuncTestPoint5(){
        expectedValue=0;
        result=func.LogFunc1(5,precision);
        assertEquals(expectedValue, result,0.01);
    }
    @Test
    public void FuncTestPoint5_l(){
        expectedValue=0.0022692;
        result=func.LogFunc1(5-0.6,precision);
        assertEquals(expectedValue, result,0.01);
    }
    @Test
    public void FuncTestPoint5_r(){
        expectedValue=-0.0013598;
        result=func.LogFunc1(5+0.06,precision);
        assertEquals(expectedValue, result,0.01);
    }

    //1.5
    @Test
    public void FuncTestPoint2Point1Point5(){
        expectedValue=6.9274081;
        result=func.LogFunc1(1.5,precision);
        assertEquals(expectedValue, result,0.01);
    }
}