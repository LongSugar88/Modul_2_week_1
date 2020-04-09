import java.util.Scanner;

public class ShowMultiDraw {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            System.out.println("This a application that you can choose one of these number, then we will draw correspond");
            System.out.println("1. draw a square");
            System.out.println("2. draw a rectangle");
            System.out.println("3. draw a isosceles triangle");
            System.out.println("4. exit");
            int number = scan.nextInt();
            switch (number){
                case 1:
                    System.out.println("Input long side: ");
                    int a = scan.nextInt();
                    System.out.println("Input short side: ");
                    int b = scan.nextInt();
                    for (int i=1; i<= b; i++){
                        for (int j=1; j<=a; j++){
                            System.out.print("***");
                        }
                        System.out.println("");
                    }
                    break;
                case 2:
                    System.out.println("Input a number: ");
                    int c = scan.nextInt();
                    System.out.println("Input short side: ");
                    for (int i=1; i<= c; i++){
                        for (int j=1; j<=i; j++){
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                    break;
                case 3:
//                    System.out.println("Input long side: ");7
//                    int d = scan.nextInt();
//                    System.out.println("Input short side: ");5
//                    int e = scan.nextInt();
//                    for(int i=1; i<=d; i++){
//                        for(int j=1; j<=i; j++){
//                            System.out.print("*");
//                        }
//                    }
//                    break;
                case 4:
                    System.out.println("OOOOOOOOO");
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Unavailable");
            }
        }
    }
