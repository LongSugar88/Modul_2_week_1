import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number to check: ");
        int num = scan.nextInt();
        boolean check = true;
        while (num < 20) {
            if (num < 2) {
                check = false;
                return;
            } else if (num == 2) {
                check = true;
                return;
            } else {
                for (int i = 2; i < num; i++) {
                    if (num % i == 0) {
                        check = false;
                        break;
                    }
                }
            }
            if (check)
                System.out.println(num + " is prime number");
            else
                System.out.println(num + " is not prime number");
            num++;
            check = true;
        }

    }
}
