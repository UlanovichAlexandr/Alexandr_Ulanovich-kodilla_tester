package com.kodilla.abstacts.homework;

public abstract class Shape {

     private int numberOfSides;
     private int lengthOfFirstSide;
     private int lengthOfSecondSide;
     private int lengthOfThirdSide;
     private int lengthOfFourthSide;
     private int area;
     private int perimeter;


     public Shape (int numberOfSides, int lengthOfFirstSide, int lengthOfSecondSide, int lengthOfThirdSide, int lengthOfFourthSide) {
         this.numberOfSides=numberOfSides;
         this.lengthOfFirstSide=lengthOfFirstSide;
         this.lengthOfSecondSide=lengthOfSecondSide;
         this.lengthOfThirdSide=lengthOfThirdSide;
         this.lengthOfFourthSide=lengthOfFourthSide;
     }
    public int getNumberOfSides() {
        return numberOfSides;}

    public int getLengthOfFirstSide(){
            return lengthOfFirstSide;
    }
    public int getLengthOfSecondSide(){
        return lengthOfSecondSide;
    }

    public int getLengthOfThirdSide(){
        return lengthOfThirdSide;
    }
    public int getLengthOfFourthSide(){
        return lengthOfFourthSide;
    }

    public int getArea() {return area;}

    public int getPerimeter() {return perimeter;}

    public abstract void AreaOfShape();
    public abstract void PerimeterOfShape();

}
