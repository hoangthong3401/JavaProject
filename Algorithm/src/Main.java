
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        BigNumber.Tool obj = new BigNumber().new Tool();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a, b: ");
        String a = sc.nextLine();
        int b = sc.nextInt();
        sc.nextLine();
        sc.close();
        System.out.println("Result: " + new BigNumber().mul(a, b));
    }
}
