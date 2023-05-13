package com.kodilla.abstacts.homework;

public class Triangle extends Shape{
    public Triangle() {
        super(3, 3, 4, 5, 0);
    }

    @Override
    public void AreaOfShape() {
        int area= 1* (getLengthOfFirstSide()*getLengthOfSecondSide())/2;
        System.out.println("Area of Triangle:" + area);
    }

    @Override
    public void PerimeterOfShape() {
        int perimeter = getLengthOfFirstSide()+getLengthOfSecondSide()+getLengthOfThirdSide();
        System.out.println("Perimeter of Triangle:" + perimeter);
    }
}
