
import java.util.Scanner;

public class IsleapYearFunction {
    public static void main(String[] args){
        System.out.println("Enter year:");
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();
        if(year%4 ==0){
            if(year%100 ==0){
                if(year%400 ==0){
                    System.out.println("Is leap year");
                } else {
                    System.out.println("Is not leap year");
                }
            } else {
                System.out.println("Is leap year");
            }
        }else{
            System.out.println("Is not leap year");
        }
    }
}
