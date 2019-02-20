
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        BigNumber.Tool obj = new BigNumber().new Tool();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a, b: ");
        String a = obj.randomNumber(32, true);
        String b = obj.randomNumber(32, true);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        sc.close();
        System.out.println("Result: " + new BigNumber().mul(a, b));
    }
}
