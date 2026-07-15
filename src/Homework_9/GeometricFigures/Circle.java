package Homework_9.GeometricFigures;

public class Circle extends Figure{
    double radius;

    public Circle(double radius){
        this.radius = radius;
    }
    @Override
    public double getPerimeter() {
        double perimeter = 2 * Math.PI * radius;
        System.out.println("Perimeter of circle equals : " + perimeter);
        return perimeter;
    }

    @Override
    public void getArea() {
        double area = Math.PI * (radius * radius);
        System.out.println("Area of circle equals : " + area);
    }
}
