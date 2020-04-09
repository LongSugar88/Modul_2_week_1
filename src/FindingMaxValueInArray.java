import java.util.Scanner;

public class FindingMaxValueInArray {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter array length: ");
        int size = scan.nextInt();
        double myAsset[] = new double[size];
        for(int i=0; i<size; i++){
            System.out.print("Enter "+ (i+1) +"th asset: ");
            myAsset[i] = scan.nextDouble();
        }

        System.out.print("All of th elements in array: ");
        for(double asset: myAsset){
            System.out.print(asset+ ", ");
        }
        System.out.println();

        double max = 0;
        for(double asset: myAsset){
            if( asset > max)
                max = asset;
        }
        System.out.println("The biggest of the elements in array is: "+ max);
    }
}
