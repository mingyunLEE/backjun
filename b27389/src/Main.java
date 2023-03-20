import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();
        number *= 100;
        double result = number/4;
        result /= 100;
        System.out.println(result);
    }
}