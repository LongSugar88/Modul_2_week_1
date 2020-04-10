import java.util.Scanner;

public class DeleteElementFromArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter array length: ");
        int size = scan.nextInt();
        int myArray[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter " + (i + 1) + "th asset: ");
            myArray[i] = scan.nextInt();
        }

        System.out.print("All of the elements in array: ");
        for (int asset : myArray) {
            System.out.print(asset + ", ");
        }
        System.out.println();

        System.out.println("Enter a number you wanna delete: ");
        int deleteNum = scan.nextInt();
        int position = 0;
        for(int i=0; i<myArray.length; i++){
            if(deleteNum == myArray[i]){
                position = i;
                for (int j=position; j<myArray.length-1; j++) {
                    myArray[j] = myArray[j + 1];
                }
                    myArray[myArray.length - 1] = 0;
                    i--;
            }
        }

        System.out.print("All of the elements in array after delete: ");
        for (int asset : myArray) {
            System.out.print(asset + ", ");
        }
        System.out.println();
    }
}
