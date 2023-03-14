import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int output = pibonacci(number);
        System.out.println(output);
    }

    private static int pibonacci(int number) {
        if (number == 0)return 0;
        if (number == 1)return 1;
        return pibonacci(number-2) + pibonacci(number-1);
    }
}