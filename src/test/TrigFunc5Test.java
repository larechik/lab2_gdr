package test;

import org.junit.Before;
import org.junit.Test;
import ru.gdr.expression.function.Func;
import ru.gdr.expression.function.FuncLevel3;

import static org.junit.Assert.assertEquals;

/**
 * Created by Makhnovets on 16.05.2016.
 */
public class TrigFunc5Test {
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
    //Infinity
    @Test
    public void FuncTestPosInf(){
        expectedValue=Double.NaN;
        result=func.TrigFunc5(Double.POSITIVE_INFINITY,precision);
        assertEquals(expectedValue,result,0.01);
    }
    @Test
    public void FuncTestNegInf(){
        expectedValue=Double.NaN;
        result=func.TrigFunc5(Double.NEGATIVE_INFINITY,precision);
        assertEquals(expectedValue,result,0.01);
    }
    //-pi/2 1.57079632679
    @Test
    public void FuncTestPointMPiDiv2(){
        expectedValue=Double.NEGATIVE_INFINITY;
        result=func.TrigFunc5(-Math.PI/2,precision);
        assertEquals(expectedValue,result,0.01);
    }
    @Test
    public void FuncTestPointMPiDiv2_l(){
        expectedValue=-2221.392866;
        result=func.TrigFunc5(-Math.PI/2-0.03,precision);
        assertEquals(expectedValue,result,0.01);
    }
    @Test
    public void FuncTestPointMPiDiv2_r(){
        expectedValue=-2221.3849268;
        result=func.TrigFunc5(-Math.PI/2+0.03,precision);
        assertEquals(expectedValue,result,0.01);
    }
    //-3pi/2 -4.71238898038
    @Test
    public void FuncTestPointM3PiDiv2(){
        expectedValue=0.5;
        result=func.TrigFunc5(-3*Math.PI/2,precision);
        assertEquals(expectedValue,result,0.01);
    }
    @Test
    public void FuncTestPointM3PiDiv2_l(){
        expectedValue=0.4998875;
        result=func.TrigFunc5(-3*Math.PI/2-0.03,precision);
        assertEquals(expectedValue,result,0.01);
    }
    @Test
    public void FuncTestPointM3PiDiv2_r(){
        expectedValue=0.4998875;
        result=func.TrigFunc5(-3*Math.PI/2+0.03,precision);
        assertEquals(expectedValue,result,0.01);
    }
    //-5pi/2 7.85398163397
    @Test
    public void FuncTestPointM5PiDiv2(){
        expectedValue=Double.NEGATIVE_INFINITY;
        result=func.TrigFunc5(-5*Math.PI/2,precision);
        assertEquals(expectedValue,result,0.01);
    }
    @Test
    public void FuncTestPointM5PiDiv2_l(){
        expectedValue=-2221.3939297;
        result=func.TrigFunc5(-5*Math.PI/2-0.03,precision);
        assertEquals(expectedValue,result,0.01);
    }
    @Test
    public void FuncTestPointM5PiDiv2_r(){
        expectedValue=-2221.3838631;
        result=func.TrigFunc5(-5*Math.PI/2+0.03,precision);
        assertEquals(expectedValue,result,0.01);
    }
    //-pi -3.14159265359
    @Test
    public void FuncTestPointMPi(){
        expectedValue=0;
        result=func.TrigFunc5(-Math.PI,precision);
        assertEquals(expectedValue,result,0.01);
    }
    @Test
    public void FuncTestPointMPi_l(){
        expectedValue=0.029122;
        result=func.TrigFunc5(-Math.PI-0.03,precision);
        assertEquals(expectedValue,result,0.01);
    }
    @Test
    public void FuncTestPointMPi_r(){
        expectedValue=-0.030923;
        result=func.TrigFunc5(-Math.PI+0.03,precision);
        assertEquals(expectedValue,result,0.01);
    }
    //-2pi -6.28318530718
    @Test
    public void FuncTestPointM2Pi(){
        expectedValue=0;
        result=func.TrigFunc5(-2*Math.PI,precision);
        assertEquals(expectedValue,result,0.01);
    }
    @Test
    public void FuncTestPointM2Pi_l(){
        expectedValue=-0.030923;
        result=func.TrigFunc5(-2*Math.PI-0.03,precision);
        assertEquals(expectedValue,result,0.01);
    }
    @Test
    public void FuncTestPointM2Pi_r(){
        expectedValue=0.029122;
        result=func.TrigFunc5(-2*Math.PI+0.03,precision);
        assertEquals(expectedValue,result,0.01);
    }
}