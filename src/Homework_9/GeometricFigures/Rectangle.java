package Homework_9.GeometricFigures;

public class Rectangle extends Figure{
    double a;
    double b;

    public Rectangle(double a, double b){
        this.a = a;
        this.b = b;
    }
    @Override
    public double getPerimeter() {
        double perimeter = (2 * a) + (2 * b);
        System.out.println("Perimeter of rectangle equals : " + perimeter);
        return perimeter;
    }

    @Override
    public void getArea() {
        double area = a * b;
        System.out.println("Area of rectangle equals : " + area);
    }
}
