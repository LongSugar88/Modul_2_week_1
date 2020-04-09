import java.util.Scanner;

public class AddAnElementToArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter array length: ");
        int size = scan.nextInt();
        int myArray[] = new int[size];
        for (int i = 0; i < size-1; i++) {
            System.out.print("Enter " + (i + 1) + "th asset: ");
            myArray[i] = scan.nextInt();
        }

        System.out.print("All of th elements in array: ");
        for (int asset : myArray) {
            System.out.print(asset + ", ");
        }
        System.out.println();

        System.out.println("Enter a number you wanna add: ");
        int addNumber = scan.nextInt();
        System.out.println("Enter position number you wanna add: ");
        int addPosition = scan.nextInt();
        for(int i=0; i<myArray.length; i++){
            if(addPosition == i){
                for (int j=myArray.length-1; j > addPosition; j--) {
                    myArray[j] = myArray[j-1];
                }
                myArray[addPosition] = addNumber;
            }
        }

        System.out.print("All of th elements in array after add: ");
        for (int asset : myArray) {
            System.out.print(asset + ", ");
        }
        System.out.println();
    }
}
