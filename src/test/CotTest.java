package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ru.gdr.expression.function.FuncLevel7;

import static org.junit.Assert.assertEquals;

/**
 * Created by Makhnovets on 16.05.2016.
 */
public class CotTest {
    FuncLevel7 func;
    double result;
    double precision;
    double expectedValue;

    @Before
    public void setUp() {
        func = new FuncLevel7();
        precision = 0.0001;
        result = Double.NaN;
    }


    @Test
    public void CotTestPoint0(){
        expectedValue=Double.POSITIVE_INFINITY;
        result =func.Cot(0,precision);
        assertEquals(expectedValue, result,0.1);
    }
    @Test
    public void CotTestPoint0_l(){
        expectedValue=-33.3233327;
        result =func.Cot(-0.03,precision);
        assertEquals(expectedValue, result,0.1);
    }
    @Test
    public void CotTestPoint0_r(){
        expectedValue=33.3233327;
        result =func.Cot(0.03,precision);
        assertEquals(expectedValue, result,0.1);
    }
    @Test
    public void CotTestPointPiDiv2(){
        expectedValue=0;
        result =func.Cot(Math.PI/2,precision);
        Assert.assertEquals(expectedValue, result,0.1);
    }
    @Test
    public void CotTestPointPiDiv2_l(){
        expectedValue=0.030009;
        result =func.Cot((Math.PI/2)-0.03,precision);
        assertEquals(expectedValue, result,0.1);
    }
    @Test
    public void CotTestPointPiDiv2_r(){
        expectedValue=-0.030009;
        result =func.Cot(Math.PI/2+0.03,precision);
        assertEquals(expectedValue, result,0.1);
    }
    @Test
    public void CotTestPointPi(){
        expectedValue=Double.POSITIVE_INFINITY;
        result =func.Cot(Math.PI,precision);
        assertEquals(expectedValue, result,0.1);
    }
    @Test
    public void CotTestPointPi_l(){
        expectedValue=-33.3233327;
        result =func.Cot(Math.PI-0.03,precision);
        assertEquals(expectedValue, result,0.1);
    }
    @Test
    public void CotTestPointPi_r(){
        expectedValue=33.3233327;
        result =func.Cot(Math.PI+0.03,precision);
        assertEquals(expectedValue, result,0.1);
    }
    @Test
    public void CotTestPointPiDiv4(){
        expectedValue=1;
        result =func.Cot(Math.PI/4,precision);
        assertEquals(expectedValue, result,0.1);
    }
    @Test
    public void CotTestPoint3PiDiv4(){
        expectedValue=-1;
        result =func.Cot(3*Math.PI/4,precision);
        assertEquals(expectedValue, result,0.1);
    }
    //Infinity
    @Test
    public void FuncTestPosInf(){
        expectedValue=Double.NaN;
        result =func.Cot(Double.POSITIVE_INFINITY,precision);
        assertEquals(expectedValue, result,0.001);
    }
    @Test
    public void FuncTestNegInf(){
        expectedValue=Double.NaN;
        result =func.Cot(Double.NEGATIVE_INFINITY,precision);
        assertEquals(expectedValue, result,0.001);
    }
}