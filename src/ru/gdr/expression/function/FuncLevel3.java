package ru.gdr.expression.function;

/**
 * Created by Makhnovets on 20.05.2016.
 */
public class FuncLevel3 {
    FuncLevel4 func4 =new FuncLevel4();
    FuncLevel7 func7 =new FuncLevel7();
    Sec sec=new Sec();
    public double LogFunc1(double arg, double precision) {
        return func4.TrigFunc2(arg, precision)/ func7.Log_5(arg, precision);
    }
    public double LogFunc5(double arg, double precision) {
        return Math.pow(func7.Log_5(arg, precision),2);
    }
    public double TrigFunc1(double arg, double precision) {
        return func4.TrigFunc2(arg, precision)+sec.Sec(arg, precision);
    }
    public double TrigFunc5(double arg, double precision) {
        return func7.Cot(arg, precision)/ func4.TrigFunc6(arg, precision);
    }
//    public double LogFunc1(double arg, double precision) {
//        return divide(mockLog2(), mockLog_5()).evaluate(arg, precision);
//    }
//    public double LogFunc5(double arg, double precision) {
//        return pow(mockLog_5(), constant(2)).evaluate(arg, precision);
//    }
//    public double TrigFunc1(double arg, double precision) {
//        return add(mockTrig2(), mockSec()).evaluate(arg, precision);
//    }
//    public double TrigFunc5(double arg, double precision) {
//        return divide(mockCot(), mockTrig6()).evaluate(arg, precision);
//    }
}
