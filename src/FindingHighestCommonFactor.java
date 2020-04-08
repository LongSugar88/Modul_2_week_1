import java.util.Scanner;

public class FindingHighestCommonFactor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int firstNumber = scan.nextInt();
        System.out.println("Enter second number: ");
        int secondNumber = scan.nextInt();
        while ( firstNumber != secondNumber){
            if(firstNumber>secondNumber)
                firstNumber-= secondNumber;
                else
                    secondNumber-= firstNumber;
        }
        System.out.println("The bigest common facter between 2 numbers is: "+ firstNumber);
    }
}
//28 1 2 4 7 14
//14 1 2 7

