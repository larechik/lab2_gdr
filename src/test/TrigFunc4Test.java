package test;

import org.junit.Before;
import org.junit.Test;
import ru.gdr.expression.function.Func;
import ru.gdr.expression.function.FuncLevel6;

import static org.junit.Assert.assertEquals;

/**
 * Created by Makhnovets on 16.05.2016.
 */
public class TrigFunc4Test {
    FuncLevel6 func;
    double result;
    double precision;
    double expectedValue;

    @Before
    public void setUp() {
        func = new FuncLevel6();
        precision = 0.0001;
        result = Double.NaN;
    }
    //x=0
    @Test
    public void FuncTestNull(){
        expectedValue=Double.POSITIVE_INFINITY;
        result=func.TrigFunc4(0,precision);
        assertEquals(expectedValue,result,0.01);
    }
    @Test
    public void FuncTestNull_l(){
        expectedValue=-33.3533282;
        result=func.TrigFunc4(-0.03,precision);
        assertEquals(expectedValue,result,0.01);
    }
    @Test
    public void FuncTestNull_r(){
        expectedValue=33.3533282;
        result=func.TrigFunc4(+0.03,precision);
        assertEquals(expectedValue,result,0.01);
    }
    //Infinity
    @Test
    public void FuncTestPosInf(){
        expectedValue=Double.NaN;
        result=func.TrigFunc4(Double.POSITIVE_INFINITY,precision);
        assertEquals(expectedValue,result,0.01);
    }
    @Test
    public void FuncTestNegInf(){
        expectedValue=Double.NaN;
        result=func.TrigFunc4(Double.NEGATIVE_INFINITY,precision);
        assertEquals(expectedValue,result,0.01);
    }
    //-2.23704
    @Test
    public void FuncTestFirstPoint(){
        expectedValue=0;
        result=func.TrigFunc4(-2.23704,precision);
        assertEquals(expectedValue,result,0.01);
    }
    @Test
    public void FuncTestFirstPoint_l(){
        expectedValue=0.0686307;
        result=func.TrigFunc4(-2.23704-0.03,precision);
        assertEquals(expectedValue,result,0.01);
    }
    @Test
    public void FuncTestFirstPoint_r(){
        expectedValue=-0.0656119;
        result=func.TrigFunc4(-2.23704+0.03,precision);
        assertEquals(expectedValue,result,0.01);
    }
    //-4.04615
    @Test
    public void FuncTestSecondPoint(){
        expectedValue=0;
        result=func.TrigFunc4(-4.04615,precision);
        assertEquals(expectedValue,result,0.01);
    }
    @Test
    public void FuncTestSecondPoint_l(){
        expectedValue=0.0656219;
        result=func.TrigFunc4(-4.04615-0.03,precision);
        assertEquals(expectedValue,result,0.01);
    }
    @Test
    public void FuncTestSecondPoint_r(){
        expectedValue=-0.0686197;
        result=func.TrigFunc4(-4.04615+0.03,precision);
        assertEquals(expectedValue,result,0.01);
    }
    //-Math.PI -3.14159265359
    @Test
    public void FuncTestPointMPi(){
        expectedValue=Double.NEGATIVE_INFINITY;
        result=func.TrigFunc4(-Math.PI,precision);
        assertEquals(expectedValue,result,0.01);
    }
    @Test
    public void FuncTestPointMPi_l(){
        expectedValue=-33.2932856;
        result=func.TrigFunc4(-Math.PI-0.03,precision);
        assertEquals(expectedValue,result,0.01);
    }
    @Test
    public void FuncTestPointMPi_r(){
        expectedValue=33.2933889;
        result=func.TrigFunc4(-Math.PI+0.03,precision);
        assertEquals(expectedValue,result,0.01);
    }
    //-2pi -6.28318530718
    @Test
    public void FuncTestPointM2Pi(){
        expectedValue=Double.POSITIVE_INFINITY;
        result=func.TrigFunc4(-2*Math.PI,precision);
        assertEquals(expectedValue,result,0.01);
    }
    @Test
    public void FuncTestPointM2Pi_l(){
        expectedValue=-33.3533362;
        result=func.TrigFunc4(-2*Math.PI-0.03,precision);
        assertEquals(expectedValue,result,0.01);
    }
    @Test
    public void FuncTestPointM2Pi_r(){
        expectedValue=33.3533203;
        result=func.TrigFunc4(-2*Math.PI+0.03,precision);
        assertEquals(expectedValue,result,0.01);
    }
}