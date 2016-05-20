package ru.gdr.expression;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/**
 * Created by Makhnovets on 15.05.2016.
 */
public class MockFactory {

    public static Expression mockLn() {
        return new Expression() {
            SearchStructure structure = new SearchStructure(readValues("ln.csv"));

            @Override
            public double evaluate(double arg, double precision) {
                return structure.getNearest(arg);
            }
        };
    }

    public static Expression mockLog_5() {
        return new Expression() {
            SearchStructure structure = new SearchStructure(readValues("log_5.csv"));

            @Override
            public double evaluate(double arg, double precision) {

                return structure.getNearest(arg);
            }
        };
    }

    public static Expression mockLog1() {
        return new Expression() {
            SearchStructure structure = new SearchStructure(readValues("log1.csv"));

            @Override
            public double evaluate(double arg, double precision) {

                return structure.getNearest(arg);
            }
        };
    }

    public static Expression mockLog2() {
        return new Expression() {
            SearchStructure structure = new SearchStructure(readValues("log2.csv"));

            @Override
            public double evaluate(double arg, double precision) {

                return structure.getNearest(arg);
            }
        };
    }

    public static Expression mockLog3() {
        return new Expression() {
            SearchStructure structure = new SearchStructure(readValues("log3.csv"));

            @Override
            public double evaluate(double arg, double precision) {

                return structure.getNearest(arg);
            }
        };
    }

    public static Expression mockLog4() {
        return new Expression() {
            SearchStructure structure = new SearchStructure(readValues("log4.csv"));

            @Override
            public double evaluate(double arg, double precision) {

                return structure.getNearest(arg);
            }
        };
    }

    public static Expression mockLog5() {
        return new Expression() {
            SearchStructure structure = new SearchStructure(readValues("log5.csv"));

            @Override
            public double evaluate(double arg, double precision) {

                return structure.getNearest(arg);
            }
        };
    }

    public static Expression mockLog() {
        return new Expression() {
            SearchStructure structure = new SearchStructure(readValues("logorifm.csv"));

            @Override
            public double evaluate(double arg, double precision) {

                return structure.getNearest(arg);
            }
        };
    }

    public static Expression mockSec() {
        return new Expression() {
            SearchStructure structure = new SearchStructure(readValues("sec.csv"));

            @Override
            public double evaluate(double arg, double precision) {

                return structure.getNearest(arg);
            }
        };
    }

    public static Expression mockSin() {
        return new Expression() {
            SearchStructure structure = new SearchStructure(readValues("sin.csv"));

            @Override
            public double evaluate(double arg, double precision) {

                return structure.getNearest(arg);
            }
        };
    }

    public static Expression mockCot() {
        return new Expression() {
            SearchStructure structure = new SearchStructure(readValues("cot.csv"));

            @Override
            public double evaluate(double arg, double precision) {

                return structure.getNearest(arg);
            }
        };
    }

    public static Expression mockTan() {
        return new Expression() {
            SearchStructure structure = new SearchStructure(readValues("tan.csv"));

            @Override
            public double evaluate(double arg, double precision) {

                return structure.getNearest(arg);
            }
        };
    }

    public static Expression mockTrig() {
        return new Expression() {
            SearchStructure structure = new SearchStructure(readValues("trigonometric.csv"));

            @Override
            public double evaluate(double arg, double precision) {

                return structure.getNearest(arg);
            }
        };
    }

    public static Expression mockTrig1() {
        return new Expression() {
            SearchStructure structure = new SearchStructure(readValues("trig1.csv"));

            @Override
            public double evaluate(double arg, double precision) {

                return structure.getNearest(arg);
            }
        };
    }

    public static Expression mockTrig2() {
        return new Expression() {
            SearchStructure structure = new SearchStructure(readValues("trig2.csv"));

            @Override
            public double evaluate(double arg, double precision) {

                return structure.getNearest(arg);
            }
        };
    }

    public static Expression mockTrig3() {
        return new Expression() {
            SearchStructure structure = new SearchStructure(readValues("trig3.csv"));

            @Override
            public double evaluate(double arg, double precision) {

                return structure.getNearest(arg);
            }
        };
    }

    public static Expression mockTrig4() {
        return new Expression() {
            SearchStructure structure = new SearchStructure(readValues("trig4.csv"));

            @Override
            public double evaluate(double arg, double precision) {

                return structure.getNearest(arg);
            }
        };
    }

    public static Expression mockTrig5() {
        return new Expression() {
            SearchStructure structure = new SearchStructure(readValues("trig5.csv"));

            @Override
            public double evaluate(double arg, double precision) {

                return structure.getNearest(arg);
            }
        };
    }

    public static Expression mockTrig6() {
        return new Expression() {
            SearchStructure structure = new SearchStructure(readValues("trig6.csv"));

            @Override
            public double evaluate(double arg, double precision) {

                return structure.getNearest(arg);
            }
        };
    }

    public static Expression mockTrig7() {
        return new Expression() {
            SearchStructure structure = new SearchStructure(readValues("trig7.csv"));

            @Override
            public double evaluate(double arg, double precision) {

                return structure.getNearest(arg);
            }
        };
    }

    public static Expression mockTrig8() {
        return new Expression() {
            SearchStructure structure = new SearchStructure(readValues("trig8.csv"));

            @Override
            public double evaluate(double arg, double precision) {

                return structure.getNearest(arg);
            }
        };
    }

    public static Expression mockTrig9() {
        return new Expression() {
            SearchStructure structure = new SearchStructure(readValues("trig9.csv"));

            @Override
            public double evaluate(double arg, double precision) {

                return structure.getNearest(arg);
            }
        };
    }


    private static ArrayList<SearchStructure.Point> readValues(String filename) {
        ArrayList<SearchStructure.Point> point = new ArrayList<>();
        try (FileReader fr = new FileReader(filename);
             BufferedReader br = new BufferedReader(fr)) {
            String line;
            while ((line = br.readLine()) != null) {

                String[] parts = line.split(",");
                point.add(new SearchStructure.Point(Double.parseDouble(parts[0]), Double.parseDouble(parts[1])));
            }
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        return point;
    }
}
