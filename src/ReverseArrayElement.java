import java.util.Scanner;

public class ReverseArrayElement {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        double arr[];
        arr = new double[8];
        for(int i=0; i<arr.length; i++){
            System.out.println("Enter element "+ (i+1) + "th");
            arr[i] = scan.nextDouble();
        }
        System.out.print("the prime array: ");
        for(int i=0; i<arr.length; i++){
            System.out.print("Element "+ (i+1) + " "+ arr[i]);
        }
        System.out.print("the prime array: ");
        for(int i=0; i<arr.length/2; i++){
            double t = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = t;
        }
        System.out.print("the change array: ");
        for(int i=0; i<arr.length; i++){
            System.out.println();
            System.out.print("Element "+ (i+1) + " "+ arr[i]);
        }
    }
}
