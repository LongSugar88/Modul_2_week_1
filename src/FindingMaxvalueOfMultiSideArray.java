import java.util.Scanner;

public class FindingMaxvalueOfMultiSideArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter row of matrix: ");
        int row = scan.nextInt();
        System.out.println("Enter row of matrix: ");
        int colum = scan.nextInt();

        int myArray[][] = {
                {15, 32, 23, 44, 5, 6, 74, 8, 92},
                {1, 22, 98, 44, 56, 76, 78, 89, 9},
                {16, 2, 33, 7, 55, 36, 7, 8, 9},
                {21, 92, 3, 4, 95, 60, 7, 87, 90},
        };

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colum; j++) {
                System.out.println("value of myArray["+i+"]["+j+"]"+ "is: ");
                myArray[i][j] = scan.nextInt();
            }
        }

        System.out.println("All elements of this matrix are : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colum; j++) {
                System.out.print(myArray[i][j]+" ");
            }
            System.out.println();
        }

        int max = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colum; j++) {
                if (myArray[i][j] > max)
                    max = myArray[i][j];
            }
        }
        System.out.println("Max number of this matrix is: "+ max);
    }
}
