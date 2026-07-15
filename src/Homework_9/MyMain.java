package Homework_9;

import Homework_9.GeometricFigures.Circle;
import Homework_9.GeometricFigures.Figure;
import Homework_9.GeometricFigures.Rectangle;
import Homework_9.GeometricFigures.Triangle;
import Homework_9.Profession.Accountant;
import Homework_9.Profession.Director;
import Homework_9.Profession.Worker;

public class MyMain {
    public static void main(String[] args) {
        createFigure();
        System.out.println("-".repeat(50));
        calculateArrayOfFigures();
    }
    public static void getProfession(){
        Director director = new Director();
        Worker worker = new Worker();
        Accountant accountant = new Accountant();

        director.writeProfession();
        worker.writeProfession();
        accountant.writeProfession();
    }

    public static void createFigure(){
        Triangle triangle = new Triangle(50.0, 50.0, 10.0);
        Rectangle rectangle = new Rectangle(5.0, 10.0);
        Circle circle = new Circle(15.0);

        triangle.getPerimeter();
        triangle.getArea();

        rectangle.getPerimeter();
        rectangle.getArea();

        circle.getPerimeter();
        circle.getArea();
    }
    public static void calculateArrayOfFigures(){
        Figure[] figures = new Figure[]{
            new Circle(10.0),
            new Triangle(12.2 , 10.5,5.0),
            new Rectangle(12.5, 10.0),
            new Rectangle(10.0, 5.0),
            new Circle(2.5)
        };
        double sumOfPerimeters = 0.0;
        for (int index = 0; index < figures.length; index++){
            double sum = figures[index].getPerimeter();
            sumOfPerimeters += sum;
        }
        System.out.println("-".repeat(50));
        System.out.println("Sum of perimeters equals : " + sumOfPerimeters);
    }
}
