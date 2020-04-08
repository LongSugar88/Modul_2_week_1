
import java.util.Scanner;

public class DaysOfMonth {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Month you looking for : ");
        int mon = scan.nextInt();
        switch (mon){
            case 1:
            case 3:
            case 5:
            case 7:
            case 9:
            case 10:
            case 12:
                System.out.println("This month have 31 days");
                break;
            case 2:
                System.out.println("This month have 28 or 29 days");
                break;
            case 4:
            case 6:
            case 8:
            case 11:
                System.out.println("This month have 30 days");
                break;
        }

    }
}
