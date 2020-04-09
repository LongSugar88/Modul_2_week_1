import java.util.Scanner;

public class PrintPassPoint {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number of student, with max are 30 students: ");
        int size = scan.nextInt();
        int myArray[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter " + (i + 1) + "th student point: ");
            myArray[i] = scan.nextInt();
        }

        System.out.print("All of final students point in this class: ");
        for (int asset : myArray) {
            System.out.print(asset + ", ");
        }
        System.out.println();

        int count = 0;
        for(int i=0; i<myArray.length; i++){
            if(myArray[i] >= 5)
                count++;
        }

        System.out.print("We have : "+ count+" passing students");
    }
}
