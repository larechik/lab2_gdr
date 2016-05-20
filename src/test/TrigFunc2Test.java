package test;

import org.junit.Before;
import org.junit.Test;
import ru.gdr.expression.function.Func;
import ru.gdr.expression.function.FuncLevel4;

import static org.junit.Assert.assertEquals;

/**
 * Created by Makhnovets on 16.05.2016.
 */
public class TrigFunc2Test {
    FuncLevel4 func;
    double result;
    double precision;
    double expectedValue;

    @Before
    public void setUp() {
        func = new FuncLevel4();
        precision = 0.0001;
        result = Double.NaN;
    }
    //x=0
    @Test
    public void FuncTestNull(){
        expectedValue=Double.NEGATIVE_INFINITY;
        result=func.TrigFunc2(0,precision);
        assertEquals(expectedValue,result,0.01);
    }
    @Test
    public void FuncTestNull_l(){
        expectedValue=-33.3983384;
        result=func.TrigFunc2(-0.03,precision);
        assertEquals(expectedValue,result,0.01);
    }
    @Test
    public void FuncTestNull_r(){
        expectedValue=33.3983384;
        result=func.TrigFunc2(+0.03,precision);
        assertEquals(expectedValue,result,0.01);
    }
    //Infinity
    @Test
    public void FuncTestPosInf(){
        expectedValue=Double.NaN;
        result=func.TrigFunc2(Double.POSITIVE_INFINITY,precision);
        assertEquals(expectedValue,result,0.01);
    }
    @Test
    public void FuncTestNegInf(){
        expectedValue=Double.NaN;
        result=func.TrigFunc2(Double.NEGATIVE_INFINITY,precision);
        assertEquals(expectedValue,result,0.01);
    }
    //-0.628818
    @Test
    public void FuncTestFirstPoint(){
        expectedValue=-3.0156282;
        result=func.TrigFunc2(-0.628818,precision);
        assertEquals(expectedValue,result,0.01);
    }
    @Test
    public void FuncTestFirstPoint_l(){
        expectedValue=-3.0198947;
        result=func.TrigFunc2(-0.628818-0.03,precision);
        assertEquals(expectedValue,result,0.01);
    }
    @Test
    public void FuncTestFirstPoint_r(){
        expectedValue=-3.0201681;
        result=func.TrigFunc2(-0.628818+0.03,precision);
        assertEquals(expectedValue,result,0.01);
    }
    //-2.03202
    @Test
    public void FuncTestSecondPoint(){
        expectedValue=0;
        result=func.TrigFunc2(-2.03202,precision);
        assertEquals(expectedValue,result,0.01);
    }
    @Test
    public void FuncTestSecondPoint_l(){
        expectedValue=-0.1465613;
        result=func.TrigFunc2(-2.03202-0.03,precision);
        assertEquals(expectedValue,result,0.01);
    }
    @Test
    public void FuncTestSecondPoint_r(){
        expectedValue=0.1642018;
        result=func.TrigFunc2(-2.03202+0.03,precision);
        assertEquals(expectedValue,result,0.01);
    }
    //-4.25117
    @Test
    public void FuncTestThirdPoint(){
        expectedValue=0;
        result=func.TrigFunc2(-4.25117,precision);
        assertEquals(expectedValue,result,0.01);
    }
    @Test
    public void FuncTestThirdPoint_l(){
        expectedValue=-0.1642291;
        result=func.TrigFunc2(-4.25117-0.03,precision);
        assertEquals(expectedValue,result,0.01);
    }
    @Test
    public void FuncTestThirdPoint_r(){
        expectedValue=0.1465396;
        result=func.TrigFunc2(-4.25117+0.03,precision);
        assertEquals(expectedValue,result,0.01);
    }
    //-5.65438
    @Test
    public void FuncTestFourthPoint(){
        expectedValue=3.0156282;
        result=func.TrigFunc2(-5.65438,precision);
        assertEquals(expectedValue,result,0.01);
    }
    @Test
    public void FuncTestFourthPoint_l(){
        expectedValue=3.020172;
        result=func.TrigFunc2(-5.65438-0.03,precision);
        assertEquals(expectedValue,result,0.01);
    }
    @Test
    public void FuncTestFourthPoint_r(){
        expectedValue=3.0198912;
        result=func.TrigFunc2(-5.65438+0.03,precision);
        assertEquals(expectedValue,result,0.01);
    }
    //-Math.PI -3.14159265359
    @Test
    public void FuncTestPointMPi(){
        expectedValue=Double.POSITIVE_INFINITY;
        result=func.TrigFunc2(-Math.PI,precision);
        assertEquals(expectedValue,result,0.01);
    }
    @Test
    public void FuncTestPointMPi_l(){
        expectedValue=33.3382688;
        result=func.TrigFunc2(-Math.PI-0.03,precision);
        assertEquals(expectedValue,result,0.01);
    }
    @Test
    public void FuncTestPointMPi_r(){
        expectedValue=-33.338719;
        result=func.TrigFunc2(-Math.PI+0.03,precision);
        assertEquals(expectedValue,result,0.01);
    }
    //-3pi/2 -4.71238898038
    @Test
    public void FuncTestPointM3PiDiv2(){
        expectedValue=Double.POSITIVE_INFINITY;
        result=func.TrigFunc2(-3*Math.PI/2,precision);
        assertEquals(expectedValue,result,0.01);
    }
    @Test
    public void FuncTestPointM3PiDiv2_l(){
        expectedValue=35.3233111;
        result=func.TrigFunc2(-3*Math.PI/2-0.03,precision);
        assertEquals(expectedValue,result,0.01);
    }
    @Test
    public void FuncTestPointM3PiDiv2_r(){
        expectedValue=-31.3233543;
        result=func.TrigFunc2(-3*Math.PI/2+0.03,precision);
        assertEquals(expectedValue,result,0.01);
    }
    //-pi/2 1.57079632679
    @Test
    public void FuncTestPointMPiDiv2(){
        expectedValue=Double.NEGATIVE_INFINITY;
        result=func.TrigFunc2(-Math.PI/2,precision);
        assertEquals(expectedValue,result,0.01);
    }
    @Test
    public void FuncTestPointMPiDiv2_l(){
        expectedValue=31.3233623;
        result=func.TrigFunc2(-Math.PI/2-0.03,precision);
        assertEquals(expectedValue,result,0.01);
    }
    @Test
    public void FuncTestPointMPiDiv2_r(){
        expectedValue=-35.3233032;
        result=func.TrigFunc2(-Math.PI/2+0.03,precision);
        assertEquals(expectedValue,result,0.01);
    }
    //-2pi -6.28318530718
    @Test
    public void FuncTestPointM2Pi(){
        expectedValue=Double.POSITIVE_INFINITY;
        result=func.TrigFunc2(-2*Math.PI,precision);
        assertEquals(expectedValue,result,0.01);
    }
    @Test
    public void FuncTestPointM2Pi_l(){
        expectedValue=-33.3983463;
        result=func.TrigFunc2(-2*Math.PI-0.03,precision);
        assertEquals(expectedValue,result,0.01);
    }
    @Test
    public void FuncTestPointM2Pi_r(){
        expectedValue=33.3983304;
        result=func.TrigFunc2(-2*Math.PI+0.03,precision);
        assertEquals(expectedValue,result,0.01);
    }
}