import javafx.scene.transform.Scale;
import java.util.Scanner;

public class ChangeTemperature {
    public static double changeToC(double tempF){
        double tempC = (5.0/9)*(tempF-32) ;
        return tempC;
    }
    public static double changeToF(double tempC){
        double tempF = (9.0/5)*tempC+32 ;
        return tempF;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int choose = 0;
        while (choose !=10){
            System.out.println("1. Change from F to C. ");
            System.out.println("2. Change from C to F. ");
            System.out.println("3. Exit. ");
            System.out.println("Choose temperature scale you wanna change to: ");
            choose = scan.nextInt();
            switch (choose){
                case 1:
                    System.out.println("Enter temperature: ");
                    double temperF = scan.nextDouble();
                    System.out.println("Temperature in Celsius "+ temperF+ " balance "+ changeToC(temperF)+" in Fahrenheit");
                    break;
                case 2:
                    System.out.println("Enter temperature: ");
                    double temperC = scan.nextDouble();
                    System.out.println("Temperature in Fahrenheit "+ temperC+ " balance "+ changeToF(temperC)+" in Celsius");
                    break;
                case 3:
                    System.exit(3);
            }
        }

    }
}
