
import java.util.Scanner;

public class BodyBMI_Index {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your weight: ");
        float weight = scan.nextFloat();
        System.out.println("Enter your height in meter: ");
        float height = scan.nextFloat();
        float BMI = weight/height/height;
        if(BMI<18.5)
            System.out.println("You're under weight");
        else if(BMI<25)
            System.out.println("Your weight is normal");
        else if(BMI<30)
            System.out.println("Your are overweight");
        else
            System.out.println("Your are obese");
    }
}
