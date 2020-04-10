package QuadraticEquation;

public class QuadraticEquationClass {
    private double a, b, c;
    public QuadraticEquationClass( double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getDiscriminant(){
        double delta = Math.pow(this.b, 2) - 4*this.a*this.c;
        return delta;
    }
    public double getRoot1(){
        double deltaElement = Math.pow(this.b, 2) - 4*this.a*this.c;
        double root1 = (-this.b+Math.pow(deltaElement,0.5))/2/this.a;
        return root1;
    }
    public double getRoot2(){
        double deltaElement = Math.pow(this.b, 2) - 4*this.a*this.c;
        double root2 = (-this.b-Math.pow(deltaElement,0.5))/2/this.a;
        return root2;
    }
}
