package test;

import org.junit.Before;
import org.junit.Test;
import ru.gdr.expression.function.Func;
import ru.gdr.expression.function.FuncLevel4;

import static org.junit.Assert.assertEquals;

/**
 * Created by Makhnovets on 16.05.2016.
 */
public class TrigFunc6Test {
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
    //Infinity
    @Test
    public void FuncTestPosInf(){
        expectedValue=Double.NaN;
        result=func.TrigFunc6(Double.POSITIVE_INFINITY,precision);
        assertEquals(expectedValue,result,0.01);
    }
    @Test
    public void FuncTestNegInf(){
        expectedValue=Double.NaN;
        result=func.TrigFunc6(Double.NEGATIVE_INFINITY,precision);
        assertEquals(expectedValue,result,0.01);
    }
    //0
    @Test
    public void FuncTestPointNull(){
        expectedValue=Double.POSITIVE_INFINITY;
        result=func.TrigFunc6(0,precision);
        assertEquals(expectedValue,result,0.01);
    }
    @Test
    public void FuncTestPointNull_l(){
        expectedValue=1077.621059;
        result=func.TrigFunc6(0-0.03,precision);
        assertEquals(expectedValue,result,0.01);
    }
    @Test
    public void FuncTestPointNull_r(){
        expectedValue=1144.2677247;
        result=func.TrigFunc6(0+0.03,precision);
        assertEquals(expectedValue,result,0.01);
    }
    //-pi/2 1.57079632679
    @Test
    public void FuncTestPointMPiDiv2(){
        expectedValue=0;
        result=func.TrigFunc6(-Math.PI/2,precision);
        assertEquals(expectedValue,result,0.01);
    }
    @Test
    public void FuncTestPointMPiDiv2_l(){
        expectedValue=-0.0017164;
        result=func.TrigFunc6(-Math.PI/2-0.15,precision);
        assertEquals(expectedValue,result,0.01);
    }
    @Test
    public void FuncTestPointMPiDiv2_r(){
        expectedValue=0.0017164;
        result=func.TrigFunc6(-Math.PI/2+0.15,precision);
        assertEquals(expectedValue,result,0.01);
    }
    //-3pi/2 -4.71238898038
    @Test
    public void FuncTestPointM3PiDiv2(){
        expectedValue=0;
        result=func.TrigFunc6(-3*Math.PI/2,precision);
        assertEquals(expectedValue,result,0.01);
    }
    @Test
    public void FuncTestPointM3PiDiv2_l(){
        expectedValue=0.0600316;
        result=func.TrigFunc6(-3*Math.PI/2-0.03,precision);
        assertEquals(expectedValue,result,0.01);
    }
    @Test
    public void FuncTestPointM3PiDiv2_r(){
        expectedValue=-0.0600315;
        result=func.TrigFunc6(-3*Math.PI/2+0.03,precision);
        assertEquals(expectedValue,result,0.01);
    }
    //-pi -3.14159265359
    @Test
    public void FuncTestPointMPi(){
        expectedValue= Double.NEGATIVE_INFINITY;
        result=func.TrigFunc6(-Math.PI,precision);
        assertEquals(expectedValue,result,0.01);
    }
    @Test
    public void FuncTestPointMPi_l(){
        expectedValue=-1144.2642353;
        result=func.TrigFunc6(-Math.PI-0.03,precision);
        assertEquals(expectedValue,result,0.01);
    }
    @Test
    public void FuncTestPointMPi_r(){
        expectedValue=-1077.6244454;
        result=func.TrigFunc6(-Math.PI+0.03,precision);
        assertEquals(expectedValue,result,0.01);
    }
    //-2pi -6.28318530718
    @Test
    public void FuncTestPointM2Pi(){
        expectedValue=Double.POSITIVE_INFINITY;
        result=func.TrigFunc6(-2*Math.PI,precision);
        assertEquals(expectedValue,result,0.01);
    }
    @Test
    public void FuncTestPointM2Pi_l(){
        expectedValue=1077.621583;
        result=func.TrigFunc6(-2*Math.PI-0.03,precision);
        assertEquals(expectedValue,result,0.01);
    }
    @Test
    public void FuncTestPointM2Pi_r(){
        expectedValue=1144.2671849;
        result=func.TrigFunc6(-2*Math.PI+0.03,precision);
        assertEquals(expectedValue,result,0.01);
    }
    //-pi/4 0.78539816339
    @Test
    public void FuncTestPointMPiDiv4(){
        expectedValue=0.4142136;
        result=func.TrigFunc6(-Math.PI/4,precision);
        assertEquals(expectedValue,result,0.01);
    }
    //-3pi/4 2.35619449019
    @Test
    public void FuncTestPointM3PiDiv4(){
        expectedValue=-0.4142135;
        result=func.TrigFunc6(-3*Math.PI/4,precision);
        assertEquals(expectedValue,result,0.01);
    }
    //-5pi/4 3.92699081699
    @Test
    public void FuncTestPointM5PiDiv4(){
        expectedValue=-2.4142138;
        result=func.TrigFunc6(-5*Math.PI/4,precision);
        assertEquals(expectedValue,result,0.01);
    }
    //-7pi/4 5.49778714378
    @Test
    public void FuncTestPointM7PiDiv4(){
        expectedValue=2.4142133;
        result=func.TrigFunc6(-7*Math.PI/4,precision);
        assertEquals(expectedValue,result,0.01);
    }
}