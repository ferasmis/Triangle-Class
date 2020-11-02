/*****************************************************
* Name: Feras
* Description: a program to calculate perimeter, area and to get the three sides
 ***************************************************/

//GeometricObject Class that assigns the filled, color, and date objects
public class GeometricObject {
    //private data fields
   private String color = "white";
   private boolean filled; //false by default
   private java.util.Date dateCreated;
   
   //constructors
   public GeometricObject(){
       //defauld constructor
       dateCreated = new java.util.Date(); // when the obj was created
   }// end class
  
   public GeometricObject(String color, boolean filled){
       dateCreated = new java.util.Date(  );
       this.color = color;
       this.filled = filled;
   }//end constructor
   
   //reutrn color
   public String getColor(){
       return color;
   }
   
   //set new color
   public void setColor(String color){
       this.color = color;
   }
   
   //return filled.boolean isfilled
   public boolean isFilled(){
       return filled;
   }
   
   //set new filled
   public void setFilled(boolean filled){
       this.filled = filled;
   }
   
   //get dateCreated
   public java.util.Date getDateCreated(){
       return dateCreated;
   }
   
   //return a string that reperesents the obj
   @Override
      public String toString(){
       return "created on " + dateCreated + "\ncolor: " + color + 
               " and filled: " + filled;
   }
   
   
   
}//end class

