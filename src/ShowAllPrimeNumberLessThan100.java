
public class ShowAllPrimeNumberLessThan100 {
    public static void main(String[] args){
        System.out.println("List of 20 prime numbers first: ");
        int num = 0;
        boolean check = true;
        while (num <100){
            if (num < 2) {
                check = false;
            } else {
                for (int i = 2; i < num; i++) {
                    if (num % i == 0) {
                        check = false;
                        break;
                    }
                }
            }
            if (check) {
                System.out.println(num);
            }
            num++;
            check = true;
        }
    }

}
