import java.util.Scanner;

public class FindingHighestCommonFactor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int firstNumber = scan.nextInt();
        System.out.println("Enter second number: ");
        int secondNumber = scan.nextInt();
        int max = 0;
        int min = 0;
        int maxFactor = 1;
//        int remainder =
        if(firstNumber<secondNumber) {
            max = secondNumber;
            min = firstNumber;
        }
        else{
            max = firstNumber;
            min = secondNumber;
        }
        for( int i=1; i<= max; i++ ){
            if(max % i == 0){
                if( min% i ==0 ){
                    maxFactor = i;
                }
            }
        }
        if(maxFactor == 1)
            System.out.println("Have no common facter between 2 numbers");
        else
        System.out.println("The bigest common facter between 2 numbers is: "+ maxFactor);
    }
}
//28 1 2 4 7 14
//14 1 2 7

