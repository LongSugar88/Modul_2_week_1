import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class CountAppearTimeOfCharInStrong {
    public static int countAppearTime(@NotNull String myString){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a character to check: ");
       String chara = scan.next();
        int count =0;
        for (int i=0; i<myString.length();i++ ) {
            if( chara.charAt(0) == myString.charAt(i))
                count++;
        }
        return count;
        }
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
        int count =0;
        System.out.println("Enter a string will be checked: ");
        String myStr = scan.nextLine();
        System.out.println("Have "+ countAppearTime(myStr)+ " appear times in string");
    }
}
