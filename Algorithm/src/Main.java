
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        BigNumber.Tool obj = new BigNumber().new Tool();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a, b, check: ");
        String a = obj.randomNumber(32, true);
        String b = obj.randomNumber(32, true);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println(obj.compare(a, b));
        String check = sc.nextLine();
        if (new BigNumber().sub(a, b).equals(check)) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
        System.out.println(new BigNumber().sub(a, b));
    }
}
