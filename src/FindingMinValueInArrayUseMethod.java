import java.util.Scanner;

public class FindingMinValueInArrayUseMethod {
    public static int findingMin(int[] arr){
        int min = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] < min)
                min = arr[i];
        }
        return min;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter array lenght: ");
        int size = scan.nextInt();
        int myArr[] = new int[size];
        for(int i=0; i<myArr.length; i++){
            System.out.println("Enter element " + i + "th : ");
            myArr[i] = scan.nextInt();
        }

        System.out.println("My array: ");
        for(int i=0; i<myArr.length; i++){
            System.out.print(myArr[i]+" ,");
        }
        System.out.println();

        System.out.println("The smallest element in array is: "+ findingMin(myArr));
    }
}
