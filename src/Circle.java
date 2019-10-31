public class Circle {
   private String color = "red";
   public double radius =  1.0;
   public Circle(){

   }
   public Circle(String color, double radius){
       this.color = color;
       this.radius = radius;
   }
   public String getColor(){
       return color;
   }
   public double getRadius(){
       return radius;
   }
   public void setColor(){
       this.color = color;
   }
   public void setRadius(){
       this.radius = radius;
   }
   public double getArea(){
       return radius*radius*3.14;
   }
   public double getPerimeter(){
       return radius*2*3.14;
   }
   public String toString(){
       return "A circle with radius: "
               + getRadius() +
               " with color: " + getColor() + " area: " + getArea()+ " perimeter " +getPerimeter();
   }
}

