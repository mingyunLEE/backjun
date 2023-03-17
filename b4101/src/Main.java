import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int number1 = sc.nextInt();
            int number2 = sc.nextInt();
            if (number1 == 0 && number2 == 0) {
                break;
            }else {
                String result = number1 > number2 ? "Yes" : "No";
                System.out.println(result);
            }


        }
    }
}