package org.example;

public class Triangle {
    static public double triangleArea(double a, double b, double c) {
        double perimeter = ((a + b + c) / 2);
        double area = perimeter * (perimeter - a) * (perimeter - b) * (perimeter - c);
        return Math.sqrt(area);
    }
}
