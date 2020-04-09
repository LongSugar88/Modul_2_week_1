import java.util.Scanner;

public class FindingMinElementInArray {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter size of array: ");
        int size = scan.nextInt();
        int myArray[];
        myArray = new int[size];
        for (int i=0; i<size; i++){
            System.out.println("Enter element" + (i+1) +" th of array: ");
            myArray[i] = scan.nextInt();
        }

        System.out.println("My array is: ");
        for (int i=0; i<myArray.length; i++){
            System.out.print(myArray[i] +" ");
        }
            System.out.println();

        int min = myArray[0];
        for (int i=0; i<myArray.length; i++){
            if(myArray[i] < min)
                min = myArray[i];
        }

        System.out.println("Min element of these array is: "+ min);
    }
}
