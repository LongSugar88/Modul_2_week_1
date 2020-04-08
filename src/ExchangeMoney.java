
import java.util.Scanner;

public class ExchangeMoney {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount dollar you wanna change: ");
        int usd = scanner.nextInt();
        int vnd = usd * 23000;
        System.out.println(usd + " USD" + " equivalent " + vnd + " VND");
    }
}
