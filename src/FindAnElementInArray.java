import java.util.Scanner;

public class FindAnElementInArray {
    public static void main(String [] args) {
    Scanner scan = new Scanner(System.in);
    String arr[] = {"Long", "Dep", "Trai", "Vo", "Doi"};
        System.out.println("Enter a name you wanna find: ");
    String name = scan.nextLine();
    boolean check = false;
    int count =0;
    for (int i=0; i<arr.length; i++) {
        if (arr[i].equals(name)) {
            check = true;
            count = i;
            break;
        }
    }
    if(check)
        System.out.println("The location of '" + name + "' in the array is " + count);
    else
        System.out.println("Not found");
}
}
