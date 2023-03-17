import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long number = sc.nextInt();

        System.out.println(fectorial(number));

    }

    private static int fectorial(long number) {
        if (number == 0) return 1;
        int result=1;
        for (int i = 1; i <= number ; i++) {
            result *= i;


        }

        return result;
    }
}