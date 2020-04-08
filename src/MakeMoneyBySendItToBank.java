import java.util.Scanner;

public class MakeMoneyBySendItToBank {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your amount to investing: ");
        int money = scan.nextInt();
        System.out.println("Enter the interest rate by percent: ");
        double intersetRate = scan.nextDouble();
        System.out.println("Enter time investing : ");
        int time = scan.nextInt();
        double total = money*(1+intersetRate*time/100/12);
        System.out.println("After "+time+" months, you take "+total);
    }

}
