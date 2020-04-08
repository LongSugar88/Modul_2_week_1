
import java.util.Scanner;

public class LinearEquationResolve {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a: ");
        double a = scan.nextFloat();
        System.out.println("Enter b: ");
        double b = scan.nextFloat();
        if( a !=0) {
            double x = -b / a;
            System.out.println("The Liner Equation have only 1 x is:" + x);
        } else {
            if( a==0 ){
                if(b==0){
                    System.out.println("The Liner Equation x always right");
                } else {
                    System.out.println("The Liner Equation have no x");
                }
            }
        }
    }

}
