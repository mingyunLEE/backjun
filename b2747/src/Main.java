import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> fibonacci = new ArrayList<>();
        fibonacci.add(0);
        fibonacci.add(1);
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number == 0){
            System.out.println(0);
        }else if ( number == 1){
            System.out.println(1);
        }else {

            for (int i = 2; i < number; i++) {
                fibonacci.add(fibonacci.get(i - 2) + fibonacci.get(i - 1));
            }
            System.out.println(fibonacci.get(number - 1) + fibonacci.get(number - 2));
        }
    }
}