import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        int result = 0;
        int number= sc.nextInt();
        for (int i = 0; i < number; i++) {
            int status = sc.nextInt();
            if (status ==0) stack.pop();
            else stack.push(status);
        }
        while (true){
            if(stack.isEmpty()) break;
            result += stack.pop();
        }
        System.out.println(result);
    }
}