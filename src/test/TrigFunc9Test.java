package test;

import org.junit.Before;
import org.junit.Test;
import ru.gdr.expression.function.FuncLevel7;

import static org.junit.Assert.assertEquals;

/**
 * Created by Makhnovets on 16.05.2016.
 */
public class TrigFunc9Test {
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
    //Infinity
    @Test
    public void FuncTestPosInf(){
        expectedValue=Double.NaN;
        result=func.TrigFunc9(Double.POSITIVE_INFINITY,precision);
        assertEquals(expectedValue,result,0.01);
    }
    @Test
    public void FuncTestNegInf(){
        expectedValue=Double.NaN;
        result=func.TrigFunc9(Double.NEGATIVE_INFINITY,precision);
        assertEquals(expectedValue,result,0.01);
    }
    //-pi/2 1.570796327
    @Test
    public void FuncTestPointMPiDiv2(){
        expectedValue=Double.POSITIVE_INFINITY;
        result=func.TrigFunc9(-Math.PI/2,precision);
        assertEquals(expectedValue,result,0.01);
    }
    @Test
    public void FuncTestPointMPiDiv2_l(){
        expectedValue=-33.3083682;
        result=func.TrigFunc9(-Math.PI/2-0.03,precision);
        assertEquals(expectedValue,result,0.01);
    }
    @Test
    public void FuncTestPointMPiDiv2_r(){
        expectedValue=33.3083086;
        result=func.TrigFunc9(-Math.PI/2+0.03,precision);
        assertEquals(expectedValue,result,0.01);
    }
    //-3pi/2 -4.71238898038
    @Test
    public void FuncTestPointM3PiDiv2(){
        expectedValue=Double.NEGATIVE_INFINITY;
        result=func.TrigFunc9(-3*Math.PI/2,precision);
        assertEquals(expectedValue,result,0.01);
    }
    @Test
    public void FuncTestPointM3PiDiv2_l(){
        expectedValue=33.3083165;
        result=func.TrigFunc9(-3*Math.PI/2-0.03,precision);
        assertEquals(expectedValue,result,0.1);
    }
    @Test
    public void FuncTestPointM3PiDiv2_r(){
        expectedValue=-33.3083602;
        result=func.TrigFunc9(-3*Math.PI/2+0.03,precision);
        assertEquals(expectedValue,result,0.01);
    }
    //-pi -3.14159265359
    @Test
    public void FuncTestPointMPi(){
        expectedValue= 0;
        result=func.TrigFunc9(-Math.PI,precision);
        assertEquals(expectedValue,result,0.01);
    }
    @Test
    public void FuncTestPointMPi_l(){
        expectedValue=-0.002501;
        result=func.TrigFunc9(-Math.PI-0.05,precision);
        assertEquals(expectedValue,result,0.01);
    }
    @Test
    public void FuncTestPointMPi_r(){
        expectedValue=-0.002501;
        result=func.TrigFunc9(-Math.PI+0.05,precision);
        assertEquals(expectedValue,result,0.01);
    }
    //-2pi -6.28318530718
    @Test
    public void FuncTestPointM2Pi(){
        expectedValue=0;
        result=func.TrigFunc9(-2*Math.PI,precision);
        assertEquals(expectedValue,result,0.01);
    }
    @Test
    public void FuncTestPointM2Pi_l(){
        expectedValue=0.002501;
        result=func.TrigFunc9(-2*Math.PI-0.05,precision);
        assertEquals(expectedValue,result,0.01);
    }
    @Test
    public void FuncTestPointM2Pi_r(){
        expectedValue=0.002501;
        result=func.TrigFunc9(-2*Math.PI+0.05,precision);
        assertEquals(expectedValue,result,0.01);
    }
    //-5pi/2 7.85398163397
    @Test
    public void FuncTestPointM5PiDiv2(){
        expectedValue=Double.NEGATIVE_INFINITY;
        result=func.TrigFunc9(-3*Math.PI/2,precision);
        assertEquals(expectedValue,result,0.01);
    }
    @Test
    public void FuncTestPointM5PiDiv2_l(){
        expectedValue=33.3083761;
        result=func.TrigFunc9(-3*Math.PI/2-0.03,precision);
        assertEquals(expectedValue,result,0.01);
    }
    @Test
    public void FuncTestPointM5PiDiv2_r(){
        expectedValue=-33.3083006;
        result=func.TrigFunc9(-3*Math.PI/2+0.03,precision);
        assertEquals(expectedValue,result,0.01);
    }
    //-pi/4 0.78539816339
    @Test
    public void FuncTestPointMPiDiv4(){
        expectedValue=0.7071069;
        result=func.TrigFunc9(-Math.PI/4,precision);
        assertEquals(expectedValue,result,0.01);
    }
    //-3pi/4 2.35619449019
    @Test
    public void FuncTestPointM3PiDiv4(){
        expectedValue=-0.7071067;
        result=func.TrigFunc9(-3*Math.PI/4,precision);
        assertEquals(expectedValue,result,0.01);
    }
    //-5pi/4 3.92699081699
    @Test
    public void FuncTestPointM5PiDiv4(){
        expectedValue=-0.7071069;
        result=func.TrigFunc9(-5*Math.PI/4,precision);
        assertEquals(expectedValue,result,0.01);
    }
    //-7pi/4 5.49778714378
    @Test
    public void FuncTestPointM7PiDiv4(){
        expectedValue=0.7071067;
        result=func.TrigFunc9(-7*Math.PI/4,precision);
        assertEquals(expectedValue,result,0.01);
    }
    //-7pi/4 7.06858347058
    @Test
    public void FuncTestPointM9PiDiv4(){
        expectedValue=0.7071068;
        result=func.TrigFunc9(-9*Math.PI/4,precision);
        assertEquals(expectedValue,result,0.01);
    }
}