import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long number1 = sc.nextInt();
        long number2 = sc.nextInt();
        System.out.println(Math.abs(number1 -number2));
    }
}