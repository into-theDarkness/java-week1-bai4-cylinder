public class Cylinder extends Circle {
    public double height =1.0;
    public Cylinder(){

    }
    public Cylinder(double height){
        this.height =height;
    }
    public Cylinder(double height, double radius, String color){
        super(color, radius);
        this.height = height;
    }
    public double getHeight(){
        return height;
    }
    public void setHeight(){
        this.height =height;
    }
    public double getVolume() {
        return radius * radius * 3.14 * height;
    }
    @Override
    public String toString(){
        return "Cylinder with height = " + getHeight() + " with color " +getColor()
                + " Volume " +getVolume();
    }


}
