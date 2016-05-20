package ru.gdr.expression;

import com.sun.xml.internal.ws.api.pipe.ServerTubeAssemblerContext;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Makhnovets on 15.05.2016.
 */
public class ExpFactory {

    public static Expression constant(double constant) {
        return (arg, precision) -> constant;
    }

    public static Expression variable() {
        return (arg, precision) -> arg;
    }

    public static Expression add(Expression e1, Expression e2) {
        return (arg, precision) -> e1.evaluate(arg, precision) + e2.evaluate(arg, precision);
    }

    public static Expression minus(Expression e1, Expression e2) {
        return (arg, precision) -> e1.evaluate(arg, precision) - e2.evaluate(arg, precision);
    }

    public static Expression multiply(Expression e1, Expression e2) {
        return (arg, precision) -> e1.evaluate(arg, precision) * e2.evaluate(arg, precision);
    }

    public static Expression divide(Expression e1, Expression e2) {
        return (arg, precision) -> e1.evaluate(arg, precision) / e2.evaluate(arg, precision);
    }

    public static Expression pow(Expression e1, Expression e2) {
        return (arg, precision) -> Math.pow(e1.evaluate(arg, precision), e2.evaluate(arg, precision));
    }

//    public static Expression sec(Expression e1){
//        return (arg, precision) -> {
//            double x = e1.evaluate(arg, precision);
//            double y = 0;
//            int i = 0;
//            boolean negative = false;
//            if ((x > Math.PI/2))
//            {
//                int buf = (int) (x * 2 / Math.PI);
//                buf = --buf / 2;
//                if (buf % 2 == 0)
//                    negative = true;
//                x -= Math.PI * (1 + buf);
//            }
//            if ((x < -Math.PI/2)) {
//                int buf = (int) (-x * 2 / Math.PI);
//                buf = --buf / 2;
//                if (buf % 2 == 0)
//                    negative = true;
//                x += Math.PI * (1 + buf);
//            }
//
//            if(x == Double.NEGATIVE_INFINITY || x == Double.POSITIVE_INFINITY)
//                return Double.NaN;
//
//            while (true) {
//                BigDecimal tmpBig = getEuler(i).multiply(BigDecimal.valueOf(Math.pow(x, i)));
//                tmpBig = tmpBig.divide(factorial(i), BigDecimal.valueOf(precision).scale(), RoundingMode.HALF_UP);
//
//                Double tmpDouble = Math.abs(tmpBig.doubleValue());
//
//                if (tmpDouble > precision)
//                    y += tmpDouble;
//                else
//                    break;
//                i = i + 2;
//            }
//
//            if (negative)
//                return -y;
//            else return y;
//        };
//    }

    public static Expression ln(Expression e1) {
        return (arg, precision) -> {
            double x = e1.evaluate(arg, precision);
            double y = 0;
            int n = 1;
            if (x == Double.NEGATIVE_INFINITY || x < 0)
                return Double.NaN;
            if (x == Double.POSITIVE_INFINITY)
                return Double.POSITIVE_INFINITY;
            if (x == 0.0)
                return Double.NEGATIVE_INFINITY;

            while (true) {
                BigDecimal xBig = BigDecimal.valueOf(x);
                BigDecimal oneBig = BigDecimal.valueOf(1);

                BigDecimal tmpBig1 = xBig.subtract(oneBig);
                BigDecimal tmpBig2 = xBig.add(oneBig);

                tmpBig1 = tmpBig1.divide(tmpBig2, BigDecimal.valueOf(precision).scale(), RoundingMode.HALF_UP);
                tmpBig1 = tmpBig1.pow(2 * n - 1);
                tmpBig1 = tmpBig1.divide(BigDecimal.valueOf(2 * n - 1), BigDecimal.valueOf(precision).scale(), RoundingMode.HALF_UP);

                Double tmpDub = tmpBig1.doubleValue();
                if (Math.abs(tmpDub) > precision)
                    y += tmpDub;
                else
                    break;
                n++;
            }
            y *= 2;


            return y;
        };
    }

//    private static BigDecimal getEuler(int n) {
//        if (n == 0)
//            return BigDecimal.valueOf(1L);
//        if (n % 2 != 0)
//            return BigDecimal.valueOf(0L);
//        else {
//            int m;
//            List<BigDecimal> eulerNums = new ArrayList<>();
//            eulerNums.add(BigDecimal.valueOf(1L));
//            eulerNums.add(BigDecimal.valueOf(0L));
//            m = n / 2 - 1;
//            for (int i = 1; i <= m; i++) {
//                BigDecimal eil = BigDecimal.valueOf(0L);
//                for (int j = 0; j < i; j++) {
//                    BigDecimal tmp = factorial(2 * i);
//                    tmp = tmp.multiply(eulerNums.get(2 * j));
//                    tmp = tmp.divide(factorial(2 * i - 2 * j));
//                    tmp = tmp.divide(factorial(2 * j));
//                    eil = eil.add(tmp);
//                }
//                eil = eil.multiply(BigDecimal.valueOf(-1L));
//                eulerNums.add(eil);
//                eulerNums.add(BigDecimal.valueOf(0L));
//            }
//            BigDecimal eil = BigDecimal.valueOf(0L);
//            for (int j = 0; j <= m; j++) {
//                BigDecimal tmp = factorial(n);
//                tmp = tmp.multiply(eulerNums.get(2 * j));
//                tmp = tmp.divide(factorial(n - 2 * j));
//                tmp = tmp.divide(factorial(2 * j));
//                eil = eil.add(tmp);
//            }
//            eil = eil.multiply(BigDecimal.valueOf(-1L));
//            return eil;
//        }
//    }
    public static Expression sin(Expression e1){
        return (arg, precision) -> {
            double x = e1.evaluate(arg, precision);
            if (x==Double.NEGATIVE_INFINITY||x==Double.POSITIVE_INFINITY){
                return Double.NaN;
            }
            int m=2;
            double result=x;
            double buf=result;
            while (true){
                buf +=Math.pow(-1,m-1)*Math.pow(x,2*m-1)/factorial(2*m-1);
                if (Math.abs(buf-result)<precision){
                    result=buf;
                    break;
                }
                result=buf;
                m++;
            }
                return result;
            };
        }


    private static Double factorial(int num) {
        double result =1;
        for (int j=2;j<=num;j++){
            result*=j;
        }
        return result;
    }

}
