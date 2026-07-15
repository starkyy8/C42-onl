package Homework_9.GeometricFigures;

public class Triangle extends Figure{

    public double a;
    public double b;
    public double c;

    public Triangle (double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getPerimeter() {
        double perimeter = a + b + c;
        System.out.println("Perimeter of triangle equals : " + perimeter);
        return perimeter;
    }

    @Override
    public void getArea() {
        double p = (double) (a + b + c) /2;
        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.println("Area of triangle equals : " + s);
    }
}
