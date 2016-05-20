package ru.gdr.expression;

import ru.gdr.expression.function.*;

public class Main {
//запись в csv-фай возможна только при реализации без заглушек

    public static void main(String[] args) {

        genValuesBigFunc(-10, 10, 0.01, 0.01);
        genValuesLF(-10, 10, 0.01, 0.01);
        genValuesTF(-10, 10, 0.01, 0.01);
    }

    private static void genValuesBigFunc(double min, double max, double step, double precision) {
        Func func = new Func();
        for (double x = min; x <= max; x += step) {
            double y = func.BigFunc(x, precision);
            Log.open("resBigFunc.csv");
            Log.write(x, y);
        }
        System.out.println("запись файла завершена");
    }

    private static void genValuesCot(double min, double max, double step, double precision) {
        FuncLevel7 func = new FuncLevel7();
        for (double x = min; x <= max; x += step) {
            double y = func.Cot(x, precision);
            Log.open("resCot.csv");
            Log.write(x, y);
            System.out.println("запись файла завершена");
        }
    }

    private static void genValuesLn(double min, double max, double step, double precision) {
        FuncLevel8 func = new FuncLevel8();
        for (double x = min; x <= max; x += step) {
            double y = func.Ln(x, precision);
            Log.open("resLn.csv");
            Log.write(x, y);
            System.out.println("запись файла завершена");
        }
    }

    private static void genValueslog_5(double min, double max, double step, double precision) {
        FuncLevel7 func = new FuncLevel7();
        for (double x = min; x <= max; x += step) {
            double y = func.Log_5(x, precision);
            Log.open("resLog_5.csv");
            Log.write(x, y);
            System.out.println("запись файла завершена");
        }
    }

    private static void genValuesLF1(double min, double max, double step, double precision) {
        FuncLevel3 func = new FuncLevel3();
        for (double x = min; x <= max; x += step) {
            double y = func.LogFunc1(x, precision);
            Log.open("resLF1.csv");
            Log.write(x, y);
            System.out.println("запись файла завершена");
        }
    }

    private static void genValuesLF2(double min, double max, double step, double precision) {
        FuncLevel4 func = new FuncLevel4();
        for (double x = min; x <= max; x += step) {
            double y = func.LogFunc2(x, precision);
            Log.open("resLF2.csv");
            Log.write(x, y);
            System.out.println("запись файла завершена");
        }
    }

    private static void genValuesLF3(double min, double max, double step, double precision) {
        FuncLevel5 func = new FuncLevel5();
        for (double x = min; x <= max; x += step) {
            double y = func.LogFunc3(x, precision);
            Log.open("resLF3.csv");
            Log.write(x, y);
            System.out.println("запись файла завершена");
        }
    }

    private void genValuesLF4(double min, double max, double step, double precision) {
        FuncLevel6 func = new FuncLevel6();
        for (double x = min; x <= max; x += step) {
            double y = func.LogFunc4(x, precision);
            Log.open("resLF4.csv");
            Log.write(x, y);
            System.out.println("запись файла завершена");
        }
    }

    private static void genValuesLF5(double min, double max, double step, double precision) {
        FuncLevel3 func = new FuncLevel3();
        for (double x = min; x <= max; x += step) {
            double y = func.LogFunc5(x, precision);
            Log.open("resLF5.csv");
            Log.write(x, y);
            System.out.println("запись файла завершена");
        }
    }

    private static void genValuesLF(double min, double max, double step, double precision) {
        FuncLevel2 func = new FuncLevel2();
        for (double x = min; x <= max; x += step) {
            double y = func.LogFunc(x, precision);
            Log.open("resLF.csv");
            Log.write(x, y);
            System.out.println("запись файла завершена");
        }
    }

    private static void genValuesSin(double min, double max, double step, double precision) {
        Sin func = new Sin();
        for (double x = min; x <= max; x += step) {
            double y = func.Sin(x, precision);
            Log.open("resSin.csv");
            Log.write(x, y);
            System.out.println("запись файла завершена");
        }
    }

    private static void genValuesTan(double min, double max, double step, double precision) {
        FuncLevel8 func = new FuncLevel8();
        for (double x = min; x <= max; x += step) {
            double y = func.Tan(x, precision);
            Log.open("resTan.csv");
            Log.write(x, y);
            System.out.println("запись файла завершена");
        }
    }

    private static void genValuesTF1(double min, double max, double step, double precision) {
        FuncLevel3 func = new FuncLevel3();
        for (double x = min; x <= max; x += step) {
            double y = func.TrigFunc1(x, precision);
            Log.open("resTF1.csv");
            Log.write(x, y);
            System.out.println("запись файла завершена");
        }
    }

    private static void genValuesTF2(double min, double max, double step, double precision) {
        FuncLevel4 func = new FuncLevel4();
        for (double x = min; x <= max; x += step) {
            double y = func.TrigFunc2(x, precision);
            Log.open("resTF2.csv");
            Log.write(x, y);
            System.out.println("запись файла завершена");
        }
    }

    private static void genValuesTF3(double min, double max, double step, double precision) {
        FuncLevel5 func = new FuncLevel5();
        for (double x = min; x <= max; x += step) {
            double y = func.TrigFunc3(x, precision);
            Log.open("resTF3.csv");
            Log.write(x, y);
        }
    }

    private static void genValuesTF4(double min, double max, double step, double precision) {
        FuncLevel6 func = new FuncLevel6();
        for (double x = min; x <= max; x += step) {
            double y = func.TrigFunc4(x, precision);
            Log.open("resTF4.csv");
            Log.write(x, y);
            System.out.println("запись файла завершена");
        }
    }

    private static void genValuesTF5(double min, double max, double step, double precision) {
        FuncLevel3 func = new FuncLevel3();
        for (double x = min; x <= max; x += step) {
            double y = func.TrigFunc5(x, precision);
            Log.open("resTF5.csv");
            Log.write(x, y);
            System.out.println("запись файла завершена");
        }
    }

    private static void genValuesTF6(double min, double max, double step, double precision) {
        FuncLevel4 func = new FuncLevel4();
        for (double x = min; x <= max; x += step) {
            double y = func.TrigFunc6(x, precision);
            Log.open("resTF6.csv");
            Log.write(x, y);
            System.out.println("запись файла завершена");
        }
    }

    private static void genValuesTF7(double min, double max, double step, double precision) {
        FuncLevel5 func = new FuncLevel5();
        for (double x = min; x <= max; x += step) {
            double y = func.TrigFunc7(x, precision);
            Log.open("resTF7.csv");
            Log.write(x, y);
            System.out.println("запись файла завершена");
        }
    }

    private static void genValuesTF8(double min, double max, double step, double precision) {
        FuncLevel6 func = new FuncLevel6();
        for (double x = min; x <= max; x += step) {
            double y = func.TrigFunc8(x, precision);
            Log.open("resTF8.csv");
            Log.write(x, y);
            System.out.println("запись файла завершена");
        }
    }

    private static void genValuesTF9(double min, double max, double step, double precision) {
        FuncLevel7 func = new FuncLevel7();
        for (double x = min; x <= max; x += step) {
            double y = func.TrigFunc9(x, precision);
            Log.open("resTF9.csv");
            Log.write(x, y);
            System.out.println("запись файла завершена");
        }
    }

    private static void genValuesTF(double min, double max, double step, double precision) {
        FuncLevel2 func = new FuncLevel2();
        for (double x = min; x <= max; x += step) {
            double y = func.TrigFunc(x, precision);
            Log.open("resTF.csv");
            Log.write(x, y);
            System.out.println("запись файла завершена");
        }
    }
}
