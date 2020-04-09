import java.util.Scanner;

public class SumOfAllElementInSquareMatrixDiagonalLine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter row of matrix: ");
        int row = scan.nextInt();


//        int row = 4;

        int myArray[][] = {
                {15, 32, 23, 44},
                {16, 22, 98, 44},
                {16, 32, 33, 78},
                {21, 92, 39, 54},
        };

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                System.out.println("value of myArray[" + i + "][" + j + "]" + "is: ");
                myArray[i][j] = scan.nextInt();
            }
        }

        System.out.println("All elements of this matrix are : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(myArray[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        int sum = 0;
        for (int i = 0; i < row; i++) {
                    sum += myArray[i][i];
            }
        System.out.println("Sum of all elements in main diagonal line: " + sum);
    }
}