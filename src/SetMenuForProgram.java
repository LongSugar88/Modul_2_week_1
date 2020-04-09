import java.util.Scanner;

public class SetMenuForProgram {
        public static void main(String[] args) {
            int number = 10;
            Scanner scan = new Scanner(System.in);
            while (number != 0){
                System.out.println("This a application that you can choose one of these number, then we will draw correspond");
                System.out.println("1. draw a square");
                System.out.println("2. draw a rectangle");
                System.out.println("3. draw a triangle");
                System.out.println("4. draw a line");
                System.out.println("0. exit");
                number = scan.nextInt();
                switch (number){
                    case 1:
                        System.out.println("OOOOOOOOOOOOO");
                        System.out.println("OOOOOOOOOOOOO");
                        System.out.println("OOOOOOOOOOOOO");
                        System.out.println("OOOOOOOOOOOOO");
                        System.out.println("OOOOOOOOOOOOO");
                        break;
                    case 2:
                        System.out.println("OOOOOOOOOOOOO");
                        System.out.println("OOOOOOOOOOOOO");
                        System.out.println("OOOOOOOOOOOOO");
                        break;
                    case 3:
                        System.out.println("O");
                        System.out.println("OOO");
                        System.out.println("OOOOO");
                        System.out.println("OOOOOOO");
                        System.out.println("OOOOOOOOO");
                        break;
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
}
