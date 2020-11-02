/*****************************************************
* Name: Feras
* Description: A program to calculate perimeter, area and to get the three sides
 ***************************************************/

//Triangle class that extends from the GeometricObject class
public class Triangle extends GeometricObject{
    //private data fields to hold the sides of triangle
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    //assign values to private sides
    public Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }//end Method
    
    public Triangle(){
        
    }// end mehtod
    
    //compute the triangle area using 3 sides and equations
    public double getArea(){
        double sides = (side1 + side2 + side3) / 2.0;
        return Math.pow(sides *(sides - side1)*(sides-side2)*(sides-side3),0.5);
    }// end method
    
    //compute the perimeter of the triangle
    public double getPerimeter(){
        return side1 + side2 + side3;
    }//end getPerimeter method
    
    
    @Override
    public String toString(){
        return super.toString() + "\nTriangle:  " + " side1 = "+  side1 
                +" side2 = " + side2 + " side3 = " + side3;

    }// end toString method
}//end class
