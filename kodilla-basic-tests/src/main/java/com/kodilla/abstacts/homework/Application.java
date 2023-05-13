package com.kodilla.abstacts.homework;

public class Application {
    public static void main(String[] args) {
        Square square = new Square();
        square.AreaOfShape();
        square.PerimeterOfShape();

        Rectangle rectangle = new Rectangle();
        rectangle.AreaOfShape();
        rectangle.PerimeterOfShape();

        Triangle triangle = new Triangle();
        triangle.AreaOfShape();
        triangle.PerimeterOfShape();
    }
}
