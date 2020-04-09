import java.util.Scanner;

public class CombineAnElementOfMultiArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first array size: ");
        int size1 = scan.nextInt();
        System.out.println("Enter second array size: ");
        int size2 = scan.nextInt();
        int myArray1[] = new int[size1];
        int myArray2[] = new int[size2];

        //Duyệt thêm từng phần tử của mảng từ bàn phím
        for (int i = 0; i < size1; i++) {
            System.out.print("Enter " + (i + 1) + "th of first array: ");
            myArray1[i] = scan.nextInt();
        }
        for (int i = 0; i < size2; i++) {
            System.out.print("Enter " + (i + 1) + "th of second array: ");
            myArray2[i] = scan.nextInt();
        }

        // In ra giá trị 2 mảng vừa nhập
        System.out.print("All of the elements in first array: ");
        for (int asset : myArray1) {
            System.out.print(asset + ", ");
        }
        System.out.println();
        System.out.print("All of the elements in second array: ");
        for (int asset : myArray2) {
            System.out.print(asset + ", ");
        }
        System.out.println();

        //Khai báo mảng gộp

        int myArray3[] = new int[size1+size2];
        for (int i=0; i<myArray1.length; i++) {
            myArray3[i] = myArray1[i];
        }
        for (int i=myArray1.length, j=0; i<myArray3.length; i++) {
            myArray3[i] = myArray2[j];
            j++;
        }

        //In ra mảng mới
        System.out.print("All of th elements in array after combine: ");
        for (int element : myArray3) {
            System.out.print(element + ", ");
        }
        System.out.println();


    }
}
