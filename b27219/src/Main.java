import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int num1 = number/5;
        int num2 = number%5;

        String result ="";
        result += "V".repeat(num1);
        result += "I".repeat(num2);

        System.out.println(result);
    }
}