import java.util.Scanner;

public class Show20PrimeNumbersFirst {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter amount prime number you need to print: ");
        int numberOfPrime = scan.nextInt();
        System.out.println("This is "+ numberOfPrime +" prime numbers first");
        int num = 0;
        int count = 0;
        boolean check = true;
        while (count < numberOfPrime) {
            if (num < 2) {
                check = false;
            }else {
                for (int i = 2; i < num; i++) {
                    if (num % i == 0) {
                        check = false;
                        break;
                    }
                }
            }
            if (check) {
                System.out.println(num);
                count++;
            }
            num++;
            check = true;
        }
    }
}
