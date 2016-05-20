package test;

import org.junit.Before;
import org.junit.Test;
import ru.gdr.expression.function.Func;
import ru.gdr.expression.function.FuncLevel5;

import static org.junit.Assert.assertEquals;

/**
 * Created by Makhnovets on 16.05.2016.
 */
public class TrigFunc3Test {
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
    //x=0
    @Test
    public void FuncTestNull(){
        expectedValue=Double.NEGATIVE_INFINITY;
        result=func.TrigFunc3(0,precision);
        assertEquals(expectedValue,expectedValue,0.01);
    }
    @Test
    public void FuncTestNull_l(){
        expectedValue=-33.3683429;
        result=func.TrigFunc3(-0.03,precision);
        assertEquals(expectedValue,expectedValue,0.01);
    }
    @Test
    public void FuncTestNull_r(){
        expectedValue=33.3683429;
        result=func.TrigFunc3(+0.03,precision);
        assertEquals(expectedValue,expectedValue,0.01);
    }
    //Infinity
    @Test
    public void FuncTestPosInf(){
        expectedValue=Double.NaN;
        result=func.TrigFunc3(Double.POSITIVE_INFINITY,precision);
        assertEquals(expectedValue,expectedValue,0.01);
    }
    @Test
    public void FuncTestNegInf(){
        expectedValue=Double.NaN;
        result=func.TrigFunc3(Double.NEGATIVE_INFINITY,precision);
        assertEquals(expectedValue,expectedValue,0.01);
    }
    //-0.71533
    @Test
    public void FuncTestFirstPoint(){
        expectedValue=-2.393595;
        result=func.TrigFunc3(-0.71533,precision);
        assertEquals(expectedValue,expectedValue,0.01);
    }
    @Test
    public void FuncTestFirstPoint_l(){
        expectedValue=-2.3973713;
        result=func.TrigFunc3(-0.71533-0.03,precision);
        assertEquals(expectedValue,expectedValue,0.01);
    }
    @Test
    public void FuncTestFirstPoint_r(){
        expectedValue=-2.3974723;
        result=func.TrigFunc3(-0.71533+0.03,precision);
        assertEquals(expectedValue,expectedValue,0.01);
    }
    //-2.23704
    @Test
    public void FuncTestSecondPoint(){
        expectedValue=0;
        result=func.TrigFunc3(-2.23704,precision);
        assertEquals(expectedValue,expectedValue,0.01);
    }
    @Test
    public void FuncTestSecondPoint_l(){
        expectedValue=-0.1070113;
        result=func.TrigFunc3(-2.23704-0.03,precision);
        assertEquals(expectedValue,expectedValue,0.01);
    }
    @Test
    public void FuncTestSecondPoint_r(){
        expectedValue=0.1104246;
        result=func.TrigFunc3(-2.23704+0.03,precision);
        assertEquals(expectedValue,expectedValue,0.01);
    }
    //-4.04615
    @Test
    public void FuncTestThirdPoint(){
        expectedValue=0;
        result=func.TrigFunc3(-4.04615,precision);
        assertEquals(expectedValue,expectedValue,0.01);
    }
    @Test
    public void FuncTestThirdPoint_l(){
        expectedValue=-0.1104422;
        result=func.TrigFunc3(-4.04615-0.03,precision);
        assertEquals(expectedValue,expectedValue,0.01);
    }
    @Test
    public void FuncTestThirdPoint_r(){
        expectedValue=0.1069948;
        result=func.TrigFunc3(-4.04615+0.03,precision);
        assertEquals(expectedValue,expectedValue,0.01);
    }
    //-5.56786
    @Test
    public void FuncTestFourthPoint(){
        expectedValue=2.3935395;
        result=func.TrigFunc3(-5.56786,precision);
        assertEquals(expectedValue,expectedValue,0.01);
    }
    @Test
    public void FuncTestFourthPoint_l(){
        expectedValue=2.3974735;
        result=func.TrigFunc3(-5.56786-0.03,precision);
        assertEquals(expectedValue,expectedValue,0.01);
    }
    @Test
    public void FuncTestFourthPoint_r(){
        expectedValue=2.3973701;
        result=func.TrigFunc3(-5.56786+0.03,precision);
        assertEquals(expectedValue,expectedValue,0.01);
    }
    //-Math.PI -3.14159265359
    @Test
    public void FuncTestPointMPi(){
        expectedValue=Double.POSITIVE_INFINITY;
        result=func.TrigFunc3(-Math.PI,precision);
        assertEquals(expectedValue,expectedValue,0.01);
    }
    @Test
    public void FuncTestPointMPi_l(){
        expectedValue=33.3082732;
        result=func.TrigFunc3(-Math.PI-0.03,precision);
        assertEquals(expectedValue,expectedValue,0.01);
    }
    @Test
    public void FuncTestPointMPi_r(){
        expectedValue=-33.3083765;
        result=func.TrigFunc3(-Math.PI+0.03,precision);
        assertEquals(expectedValue,expectedValue,0.01);
    }
    //-3pi/2 -4.71238898038
    @Test
    public void FuncTestPointM3PiDiv2(){
        expectedValue=Double.POSITIVE_INFINITY;
        result=func.TrigFunc3(-3*Math.PI/2,precision);
        assertEquals(expectedValue,expectedValue,0.01);
    }
    @Test
    public void FuncTestPointM3PiDiv2_l(){
        expectedValue=34.3237611;
        result=func.TrigFunc3(-3*Math.PI/2-0.03,precision);
        assertEquals(expectedValue,expectedValue,0.01);
    }
    @Test
    public void FuncTestPointM3PiDiv2_r(){
        expectedValue=-32.3229044;
        result=func.TrigFunc3(-3*Math.PI/2+0.03,precision);
        assertEquals(expectedValue,expectedValue,0.01);
    }
    //-pi/2 1.57079632679
    @Test
    public void FuncTestPointMPiDiv2(){
        expectedValue=Double.NEGATIVE_INFINITY;
        result=func.TrigFunc3(-Math.PI/2,precision);
        assertEquals(expectedValue,expectedValue,0.01);
    }
    @Test
    public void FuncTestPointMPiDiv2_l(){
        expectedValue=32.3229123;
        result=func.TrigFunc3(-Math.PI/2-0.03,precision);
        assertEquals(expectedValue,expectedValue,0.01);
    }
    @Test
    public void FuncTestPointMPiDiv2_r(){
        expectedValue=-34.3237531;
        result=func.TrigFunc3(-Math.PI/2+0.03,precision);
        assertEquals(expectedValue,expectedValue,0.01);
    }
    //-2pi -6.28318530718
    @Test
    public void FuncTestPointM2Pi(){
        expectedValue=Double.POSITIVE_INFINITY;
        result=func.TrigFunc3(-2*Math.PI,precision);
        assertEquals(expectedValue,expectedValue,0.01);
    }
    @Test
    public void FuncTestPointM2Pi_l(){
        expectedValue=-33.3683508;
        result=func.TrigFunc3(-2*Math.PI-0.03,precision);
        assertEquals(expectedValue,expectedValue,0.01);
    }
    @Test
    public void FuncTestPointM2Pi_r(){
        expectedValue=33.3683349;
        result=func.TrigFunc3(-2*Math.PI+0.03,precision);
        assertEquals(expectedValue,expectedValue,0.01);
    }
}