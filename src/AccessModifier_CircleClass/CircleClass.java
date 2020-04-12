package AccessModifier_CircleClass;

public class CircleClass {
    private double radius = 5;
    private String color = "red";
    CircleClass(){

    }
    CircleClass(double radius, String color){
        this.radius = radius;
        this.color = color;
    }
    public double getRadius(){
        return this.radius;
    }
    protected String getColor(){
        return this.color;
    }
    public double getArea(){
        double area = Math.pow(this.radius, 2)*Math.PI;
        return area;
    }
}
