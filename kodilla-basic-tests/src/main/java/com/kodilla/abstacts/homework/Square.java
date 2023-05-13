package com.kodilla.abstacts.homework;

public class Square extends Shape{


    public Square() {
        super(4, 5, 5, 5, 5);
    }

    @Override
    public void AreaOfShape() {
  int area= getLengthOfFirstSide()*getLengthOfSecondSide();
  System.out.println("Area of Square:" + area);
    }

    @Override
    public void PerimeterOfShape() {
int perimeter = getLengthOfFirstSide()*4;
        System.out.println("Perimeter of Square:" + perimeter);
    }
}
