package AccessModifier_CircleClass;

public class Circle {
    public static void main(String[] args){
        CircleClass newCircle1 = new CircleClass();
        CircleClass newCircle2 = new CircleClass(10, "pink");
        //cannot using private method
        System.out.println("Circle1's area : ' " + newCircle1.getArea());
        System.out.println("Circle2's area : ' " + newCircle2.getArea());
        System.out.println("Circle1's color : ' " + newCircle1.getColor());
        System.out.println("Circle2's color : ' " + newCircle2.getColor());
    }
}
