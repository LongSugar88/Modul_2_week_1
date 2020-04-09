
import java.util.Scanner;

public class ExhangeNumberToWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scan.nextInt();
        if (number >= 0 && number <= 10) {
            switch (number) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                case 10:
                    System.out.println("Ten");
                    break;
            }
        } else if (number >= 0 && number <= 20) {
            switch (number) {
                case 11:
                    System.out.println("Eleven");
                    break;
                case 12:
                    System.out.println("Twelve");
                    break;
                case 13:
                    System.out.println("Thirdteen");
                    break;
                case 14:
                    System.out.println("Fourteen");
                    break;
                case 15:
                    System.out.println("Fifteen");
                    break;
                case 16:
                    System.out.println("Sixteen");
                    break;
                case 17:
                    System.out.println("Seventeen");
                    break;
                case 18:
                    System.out.println("Eighteen");
                    break;
                case 19:
                    System.out.println("Nineteen");
                    break;
                case 20:
                    System.out.println("Twenty");
                    break;
            }
        } else if (number >= 0 && number < 99) {
            int a = (number - number % 10) / 10;
            int b = number % 10;
            String aText = "";
            String bText = "";
            String text = "";
            switch (a) {
                case 2:
                    aText = "Twenty ";
                    break;
                case 3:
                    aText = "Thirty ";
                    break;
                case 4:
                    aText = "Fourty ";
                    break;
                case 5:
                    aText = "Fifty ";
                    break;
                case 6:
                    aText = "Sixty ";
                    break;
                case 7:
                    aText = "Seventy ";
                    break;
                case 8:
                    aText = "Eighty ";
                    break;
                case 9:
                    aText = "Ninety ";
                    break;
            }
            switch (b) {
                case 0:
                    bText = "";
                    break;
                case 1:
                    bText = "one";
                    break;
                case 2:
                    bText = "two";
                    break;
                case 3:
                    bText = "three";
                    break;
                case 4:
                    bText = "four";
                    break;
                case 5:
                    bText = "five";
                    break;
                case 6:
                    bText = "six";
                    break;
                case 7:
                    bText = "seven";
                    break;
                case 8:
                    bText = "eight";
                    break;
                case 9:
                    bText = "nine";
                    break;
            }
            System.out.println(aText + bText);
        } else if (number >= 0 && number <= 999) {
            int a = (number - number % 100) / 100;
            int b = (number % 100 - (number % 100) % 10) / 10;
            int c = number - a * 100 - b * 10;
            String aText = "";
            String bText = "";
            String cText = "";
            String text = "";
            switch (a) {
                case 1:
                    aText = "One hundred ";
                    break;
                case 2:
                    aText = "Two hundred ";
                    break;
                case 3:
                    aText = "Three hundred ";
                    break;
                case 4:
                    aText = "Four hundred ";
                    break;
                case 5:
                    aText = "Five hundred ";
                    break;
                case 6:
                    aText = "Six hundred ";
                    break;
                case 7:
                    aText = "Seven hundred ";
                    break;
                case 8:
                    aText = "Eight hundred ";
                    break;
                case 9:
                    aText = "Nine hundred ";
                    break;
            }
            switch (b) {
                case 0:
                    bText = " ";
                    break;
                case 2:
                    bText = "twenty ";
                    break;
                case 3:
                    bText = "thirty ";
                    break;
                case 4:
                    bText = "fourty ";
                    break;
                case 5:
                    bText = "fifty ";
                    break;
                case 6:
                    bText = "sixty ";
                    break;
                case 7:
                    bText = "seventy ";
                    break;
                case 8:
                    bText = "eighty ";
                    break;
                case 9:
                    bText = "ninety ";
                    break;
            }
            if (b == 1) {
                switch (c) {
                    case 0:
                        cText = "ten";
                        break;
                    case 1:
                        cText = "elevent";
                        break;
                    case 2:
                        cText = "twelve";
                        break;
                    case 3:
                        cText = "thirteen";
                        break;
                    case 4:
                        cText = "fourteen";
                        break;
                    case 5:
                        cText = "fifteen";
                        break;
                    case 6:
                        cText = "sixteen";
                        break;
                    case 7:
                        cText = "seventeen";
                        break;
                    case 8:
                        cText = "eightteen";
                        break;
                    case 9:
                        cText = "nineteen";
                        break;
                }
            } else {
                switch (c) {
                    case 0:
                        cText = "";
                        break;
                    case 1:
                        cText = "one";
                        break;
                    case 2:
                        cText = "two";
                        break;
                    case 3:
                        cText = "three";
                        break;
                    case 4:
                        cText = "four";
                        break;
                    case 5:
                        cText = "five";
                        break;
                    case 6:
                        cText = "six";
                        break;
                    case 7:
                        cText = "seven";
                        break;
                    case 8:
                        cText = "eight";
                        break;
                    case 9:
                        cText = "nine";
                        break;
                }
            }
            System.out.println(aText + bText + cText);
        } else
            System.out.println("Đéo biết ");
    }
}

