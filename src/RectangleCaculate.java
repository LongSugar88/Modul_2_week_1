import java.util.Scanner;

public class RectangleCaculate {
    public static void main(String[] args) {
        float width;
        float height;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter width :");
        System.out.println("Enter width :");
        width = scanner.nextFloat();
        System.out.println("Enter height :");
        height = scanner.nextFloat();
        float acreage = width * height;
        System.out.println("The acreatge is :" + acreage);
    }
}
