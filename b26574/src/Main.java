import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        for (int i = 0; i <number; i++) {
            int num1 = sc.nextInt();
            System.out.println(num1 + " " + num1);
        }

    }
}