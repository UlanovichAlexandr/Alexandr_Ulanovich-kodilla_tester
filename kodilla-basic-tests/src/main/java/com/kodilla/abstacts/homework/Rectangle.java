package com.kodilla.abstacts.homework;

public class Rectangle extends Shape{
    public Rectangle() {
        super(4, 4, 2, 4, 2);
    }

    @Override
    public void AreaOfShape() {
        int area= getLengthOfFirstSide()*getLengthOfSecondSide();
        System.out.println("Area of Rectangle:" + area);
    }

    @Override
    public void PerimeterOfShape() {
        int perimeter = (getLengthOfFirstSide()+getLengthOfSecondSide())*2;
        System.out.println("Perimeter of Rectangle:" + perimeter);
    }
}
