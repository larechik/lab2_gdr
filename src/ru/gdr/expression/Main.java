package ru.gdr.expression;

import ru.gdr.expression.function.*;

public class Main {
//запись в csv-фай возможна только при реализации без заглушек

    public static void main(String[] args) {

        genValuesBigFunc(-10, 10, 0.01, 0.001);
        genValuesLF(-10, 10, 0.1, 0.0001);
        genValuesTF(-10, 10, 0.1, 0.0001);
    }

    private static void genValuesBigFunc(double min, double max, double step, double precision) {
        Func func = new Func();
        Log.open("resBigFunc.csv");
        for (double x = min; x <= max; x += step) {
            double y = func.BigFunc(x, precision);
            Log.write(x, y);
        }
        Log.close();

    }

    private static void genValuesCot(double min, double max, double step, double precision) {
        FuncLevel7 func = new FuncLevel7();Log.open("resCot.csv");
        for (double x = min; x <= max; x += step) {
            double y = func.Cot(x, precision);

            Log.write(x, y);

        }
        Log.close();
    }

    private static void genValuesLn(double min, double max, double step, double precision) {
        FuncLevel8 func = new FuncLevel8();Log.open("resLn.csv");
        for (double x = min; x <= max; x += step) {
            double y = func.Ln(x, precision);

            Log.write(x, y);

        }
        Log.close();
    }

    private static void genValueslog_5(double min, double max, double step, double precision) {
        FuncLevel7 func = new FuncLevel7();Log.open("resLog_5.csv");
        for (double x = min; x <= max; x += step) {
            double y = func.Log_5(x, precision);

            Log.write(x, y);

        }
        Log.close();
    }

    private static void genValuesLF1(double min, double max, double step, double precision) {
        FuncLevel3 func = new FuncLevel3();Log.open("resLF1.csv");
        for (double x = min; x <= max; x += step) {
            double y = func.LogFunc1(x, precision);

            Log.write(x, y);

        }
        Log.close();
    }

    private static void genValuesLF2(double min, double max, double step, double precision) {
        FuncLevel4 func = new FuncLevel4();Log.open("resLF2.csv");
        for (double x = min; x <= max; x += step) {
            double y = func.LogFunc2(x, precision);

            Log.write(x, y);
        }
        Log.close();
    }

    private static void genValuesLF3(double min, double max, double step, double precision) {
        FuncLevel5 func = new FuncLevel5();Log.open("resLF3.csv");
        for (double x = min; x <= max; x += step) {
            double y = func.LogFunc3(x, precision);

            Log.write(x, y);
        }
        Log.close();
    }

    private void genValuesLF4(double min, double max, double step, double precision) {
        FuncLevel6 func = new FuncLevel6();Log.open("resLF4.csv");
        for (double x = min; x <= max; x += step) {
            double y = func.LogFunc4(x, precision);

            Log.write(x, y);
        }
        Log.close();
    }

    private static void genValuesLF5(double min, double max, double step, double precision) {
        FuncLevel3 func = new FuncLevel3();Log.open("resLF5.csv");
        for (double x = min; x <= max; x += step) {
            double y = func.LogFunc5(x, precision);

            Log.write(x, y);
        }
        Log.close();
    }

    private static void genValuesLF(double min, double max, double step, double precision) {
        FuncLevel2 func = new FuncLevel2();Log.open("resLF.csv");
        for (double x = min; x <= max; x += step) {
            double y = func.LogFunc(x, precision);

            Log.write(x, y);
        }
        Log.close();
    }

    private static void genValuesSin(double min, double max, double step, double precision) {
        Sin func = new Sin();Log.open("resSin.csv");
        for (double x = min; x <= max; x += step) {
            double y = func.Sin(x, precision);

            Log.write(x, y);
        }
        Log.close();
    }

    private static void genValuesTan(double min, double max, double step, double precision) {
        FuncLevel8 func = new FuncLevel8();Log.open("resTan.csv");
        for (double x = min; x <= max; x += step) {
            double y = func.Tan(x, precision);

            Log.write(x, y);
        }
        Log.close();
    }

    private static void genValuesTF1(double min, double max, double step, double precision) {
        FuncLevel3 func = new FuncLevel3();Log.open("resTF1.csv");
        for (double x = min; x <= max; x += step) {
            double y = func.TrigFunc1(x, precision);

            Log.write(x, y);
        }
        Log.close();
    }

    private static void genValuesTF2(double min, double max, double step, double precision) {
        FuncLevel4 func = new FuncLevel4();Log.open("resTF2.csv");
        for (double x = min; x <= max; x += step) {
            double y = func.TrigFunc2(x, precision);

            Log.write(x, y);
        }
        Log.close();
    }

    private static void genValuesTF3(double min, double max, double step, double precision) {
        FuncLevel5 func = new FuncLevel5();Log.open("resTF3.csv");
        for (double x = min; x <= max; x += step) {
            double y = func.TrigFunc3(x, precision);

            Log.write(x, y);
        }
        Log.close();
    }

    private static void genValuesTF4(double min, double max, double step, double precision) {
        FuncLevel6 func = new FuncLevel6();Log.open("resTF4.csv");
        for (double x = min; x <= max; x += step) {
            double y = func.TrigFunc4(x, precision);

            Log.write(x, y);
        }
        Log.close();
    }

    private static void genValuesTF5(double min, double max, double step, double precision) {
        FuncLevel3 func = new FuncLevel3();Log.open("resTF5.csv");
        for (double x = min; x <= max; x += step) {
            double y = func.TrigFunc5(x, precision);

            Log.write(x, y);
        }
        Log.close();
    }

    private static void genValuesTF6(double min, double max, double step, double precision) {
        FuncLevel4 func = new FuncLevel4();Log.open("resTF6.csv");
        for (double x = min; x <= max; x += step) {
            double y = func.TrigFunc6(x, precision);

            Log.write(x, y);
        }
        Log.close();
    }

    private static void genValuesTF7(double min, double max, double step, double precision) {
        FuncLevel5 func = new FuncLevel5();Log.open("resTF7.csv");
        for (double x = min; x <= max; x += step) {
            double y = func.TrigFunc7(x, precision);

            Log.write(x, y);
        }
        Log.close();
    }

    private static void genValuesTF8(double min, double max, double step, double precision) {
        FuncLevel6 func = new FuncLevel6(); Log.open("resTF8.csv");
        for (double x = min; x <= max; x += step) {
            double y = func.TrigFunc8(x, precision);

            Log.write(x, y);
        }
        Log.close();
    }

    private static void genValuesTF9(double min, double max, double step, double precision) {
        FuncLevel7 func = new FuncLevel7();Log.open("resTF9.csv");
        for (double x = min; x <= max; x += step) {
            double y = func.TrigFunc9(x, precision);

            Log.write(x, y);

        }
        Log.close();
    }

    private static void genValuesTF(double min, double max, double step, double precision) {
        FuncLevel2 func = new FuncLevel2(); Log.open("resTF.csv");
        for (double x = min; x <= max; x += step) {
            double y = func.TrigFunc(x, precision);

            Log.write(x, y);
        }
        Log.close();
    }
}
