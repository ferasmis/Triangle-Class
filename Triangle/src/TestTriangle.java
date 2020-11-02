/*****************************************************
* Name: Feras
* Description: a program to calculate perimeter, area and to get the three sides
 ***************************************************/

//class to display everthing for the user
import java.util.Scanner;
public class TestTriangle  {
    public static void main(String[] args) {
        //create scanner obj
       Scanner input = new Scanner(System.in);
       
       //create double values and dsiplay them
       System.out.print("Enter theree sides of triangle: ");
       double side1,side2,side3,area,perimeter;
       side1=input.nextDouble();
       side2=input.nextDouble();
       side3=input.nextDouble();
       
       System.out.print("Enter color of trangle: ");
       //create string for color input
       String color = input.next();
       
       System.out.print("Enter a boolean value for filled: ");
       //create var boolean for filled if true or false
       boolean filled =input.nextBoolean();

       //create object for the 3 sides and display them
       Triangle t = new Triangle( side1, side2, side3);
       
       //set the color and boolen filled form user input
       t.setColor(color);
       t.setFilled(filled);
       
       //display the area perimeter
       System.out.println("The Area is: "+t.getArea());
       System.out.println("The Perimeter is: " + t.getPerimeter());
       
       //display the date created obj
       System.out.println(t.toString()); 
   }
}
