package ru.gdr.expression;

import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by Makhnovets on 15.05.2016.
 */
public class SearchStructure {

    private ArrayList<Point> points;

    public SearchStructure(ArrayList<Point> points) {
        this.points = points;
    }

    public double getNearest(double x) {
        return points.get(binSearch(x)).getY();
    }

    private int binSearch(double x) {
        if (x==Double.NEGATIVE_INFINITY) return 0;
        if (x== Double.POSITIVE_INFINITY) return points.size()-1;
        int l = 0;
        int r = points.size()-1;
        while (r - l > 1) {
            int m = (r + l) / 2;
            if (x - points.get(m).getX() > 0) {
                l = m;
            } else {
                r = m;
            }
        }
        if (l == -1)
            return r;
        if (r == points.size())
            return l;
        if (Math.abs(points.get(l).getX() - x) >= Math.abs(points.get(r).getX() - x)) {
            return r;
        }
        return l;
    }

    public static class Point {
        private double x;
        private double y;

        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public double getX() {
            return x;
        }

        public double getY() {
            return y;
        }
    }
}
