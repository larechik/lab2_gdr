package test;

import org.junit.Before;
import org.junit.Test;
import ru.gdr.expression.function.Func;
import ru.gdr.expression.function.FuncLevel3;

import static org.junit.Assert.assertEquals;

/**
 * Created by Makhnovets on 16.05.2016.
 */
public class TrigFunc1Test {
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
    @Test
    public void FuncTestNull(){
        expectedValue=Double.NEGATIVE_INFINITY;
        result=func.TrigFunc1(0,precision);
        assertEquals(expectedValue,result,0.01);
    }
    @Test
    public void FuncTestNull_l(){
        expectedValue=-32.3978882;
        result=func.TrigFunc1(-0.03,precision);
        assertEquals(expectedValue,result,0.01);
    }
    @Test
    public void FuncTestNull_r(){
        expectedValue=34.3987885;
        result=func.TrigFunc1(+0.03,precision);
        assertEquals(expectedValue,result,0.01);
    }
    //Infinity
    @Test
    public void FuncTestPosInf(){
        expectedValue=Double.NaN;
        result=func.TrigFunc1(Double.POSITIVE_INFINITY,precision);
        assertEquals(expectedValue,result,0.01);
    }
    @Test
    public void FuncTestNegInf(){
        expectedValue=Double.NaN;
        result=func.TrigFunc1(Double.NEGATIVE_INFINITY,precision);
        assertEquals(expectedValue,result,0.01);
    }
    //-0.82593
    @Test
    public void FuncTestFirstPoint(){
        expectedValue=-1.7047273;
        result=func.TrigFunc1(-0.82593,precision);
        assertEquals(expectedValue,result,0.01);
    }
    @Test
    public void FuncTestFirstPoint_l(){
        expectedValue=-1.7058918;
        result=func.TrigFunc1(-0.82593-0.03,precision);
        assertEquals(expectedValue,result,0.01);
    }
    @Test
    public void FuncTestFirstPoint_r(){
        expectedValue=-1.7060086;
        result=func.TrigFunc1(-0.82593+0.03,precision);
        assertEquals(expectedValue,result,0.01);
    }
    //-3.85359
    @Test
    public void FuncTestSecondPoint(){
        expectedValue=0;
        result=func.TrigFunc1(-3.85359,precision);
        assertEquals(expectedValue,result,0.01);
    }
    @Test
    public void FuncTestSecondPoint_l(){
        expectedValue=-0.117816;
        result=func.TrigFunc1(-3.85359-0.03,precision);
        assertEquals(expectedValue,result,0.01);
    }
    @Test
    public void FuncTestSecondPoint_r(){
        expectedValue=0.1166714;
        result=func.TrigFunc1(-3.85359+0.03,precision);
        assertEquals(expectedValue,result,0.01);
    }
    //-5.72166
    @Test
    public void FuncTestThirdPoint(){
        expectedValue=4.2209797;
        result=func.TrigFunc1(-5.72166,precision);
        assertEquals(expectedValue,result,0.01);
    }
    @Test
    public void FuncTestThirdPoint_l(){
        expectedValue=4.2278373;
        result=func.TrigFunc1(-5.72166-0.03,precision);
        assertEquals(expectedValue,result,0.01);
    }
    @Test
    public void FuncTestThirdPoint_r(){
        expectedValue=4.2273927;
        result=func.TrigFunc1(-5.72166+0.03,precision);
        assertEquals(expectedValue,result,0.01);
    }
    //-Math.PI
    @Test
    public void FuncTestMaxTrig(){
        expectedValue=Double.POSITIVE_INFINITY;
        result=func.TrigFunc1(-Math.PI,precision);
        assertEquals(expectedValue,result,0.01);
    }
    @Test
    public void FuncTestMaxTrig_l(){
        expectedValue=32.3378186;
        result=func.TrigFunc1(-Math.PI-0.03,precision);
        assertEquals(expectedValue,result,0.01);
    }
    @Test
    public void FuncTestMaxTrig_r(){
        expectedValue=-34.3388221;
        result=func.TrigFunc1(-Math.PI+0.03,precision);
        assertEquals(expectedValue,result,0.01);
    }
    //-3pi/2
    @Test
    public void FuncTestPointM3PiDiv2(){
        expectedValue=Double.POSITIVE_INFINITY;
        result=func.TrigFunc1(-3*Math.PI/2,precision);
        assertEquals(expectedValue,result,0.01);
    }
    @Test
    public void FuncTestPointM3PiDiv2_l(){
        expectedValue=68.6616232;
        result=func.TrigFunc1(-3*Math.PI/2-0.03,precision);
        assertEquals(expectedValue,result,0.1);
    }
    @Test
    public void FuncTestPointM3PiDiv2_r(){
        expectedValue=-64.66171;
        result=func.TrigFunc1(-3*Math.PI/2+0.03,precision);
        assertEquals(expectedValue,result,0.01);
    }
    //-2pi
    @Test
    public void FuncTestPointM2Pi(){
        expectedValue=Double.POSITIVE_INFINITY;
        result=func.TrigFunc1(-2*Math.PI,precision);
        assertEquals(expectedValue,result,0.01);
    }
    @Test
    public void FuncTestPointM2Pi_l(){
        expectedValue=-32.3978962;
        result=func.TrigFunc1(-2*Math.PI-0.03,precision);
        assertEquals(expectedValue,result,0.01);
    }
    @Test
    public void FuncTestPointM2Pi_r(){
        expectedValue=34.3987806;
        result=func.TrigFunc1(-2*Math.PI+0.03,precision);
        assertEquals(expectedValue,result,0.01);
    }
}