import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        BigInteger result = new BigInteger(String.valueOf(1));
        sc.close();
        for (int i = 1; i <= number; i++) {
            result = result.multiply(BigInteger.valueOf(i));

        }
        System.out.println(result);

    }

}