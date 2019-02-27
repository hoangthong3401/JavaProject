
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        BigNumber.Tool obj = new BigNumber().new Tool();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a, b: ");
        String a = sc.nextLine();
        String b = sc.nextLine();
        sc.close();
//        System.out.println("a: " + a.substring(0, b.length()));
        System.out.println("Result: " + new BigNumber().div(a, b));
    }
}
