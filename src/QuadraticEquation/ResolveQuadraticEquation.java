package QuadraticEquation;

import java.util.Scanner;

public class ResolveQuadraticEquation {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a element: ");
        double a = scan.nextDouble();
        System.out.println("Enter b element: ");
        double b = scan.nextDouble();
        System.out.println("Enter c element: ");
        double c = scan.nextDouble();
        System.out.printf("The quadratic equation is: %sX^2+%sX+%s ", a, b, c);
        QuadraticEquationClass quadraticEquationClass = new QuadraticEquationClass(a, b , c);
        if(quadraticEquationClass.getDiscriminant()<0)
            System.out.printf("Discriminant is: %s < 0 so this quadratic equation have no root ever", quadraticEquationClass.getDiscriminant());
        else if(quadraticEquationClass.getDiscriminant() == 0)
            System.out.printf("Discriminant is: %s = 0 so this quadratic equation have only 1 root is %.2f", quadraticEquationClass.getDiscriminant(), quadraticEquationClass.getRoot1());
        else
        {
            System.out.printf("Discriminant is: %s > 0 so this quadratic equation have 2 roots, these are: %n ", quadraticEquationClass.getDiscriminant());
            System.out.printf("Root 1: %.2f %n", quadraticEquationClass.getRoot1());
            System.out.printf("Root 2: %.2f %n", quadraticEquationClass.getRoot2());
        }
    }
}
