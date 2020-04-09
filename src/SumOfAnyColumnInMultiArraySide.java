import java.util.Scanner;

public class SumOfAnyColumnInMultiArraySide {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter row of matrix: ");
        int row = scan.nextInt();
        System.out.println("Enter row of matrix: ");
        int colum = scan.nextInt();

//        int row = 4;
//        int colum = 9;

        int myArray[][] = {
                {15, 32, 23, 44, 5, 6, 74, 8, 92},
                {1, 22, 98, 44, 56, 76, 78, 89, 9},
                {16, 2, 33, 7, 55, 36, 7, 8, 9},
                {21, 92, 3, 4, 95, 60, 7, 87, 90},
        };

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colum; j++) {
                System.out.println("value of myArray[" + i + "][" + j + "]" + "is: ");
                myArray[i][j] = scan.nextInt();
            }
        }

        System.out.println("All elements of this matrix are : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colum; j++) {
                System.out.print(myArray[i][j] + " ");
            }
            System.out.println();
        }
            System.out.println();

        System.out.println("Enter row that all elements need to sum : ");
        int index = scan.nextInt();
        int sum = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colum; j++) {
                if ( j == index) {
                    sum += myArray[i][j];
                    break;
                }
            }
        }
        System.out.println("Sum of all elements in this column is: " + sum);
    }
}