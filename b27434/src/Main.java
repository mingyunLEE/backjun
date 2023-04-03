import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        BigInteger output = fibonacci(number);
        System.out.println(output);

    }

    private static BigInteger fibonacci(int num) {
        ArrayList<BigInteger> memo = new ArrayList<>();
        memo.add(BigInteger.valueOf(0));
        memo.add(BigInteger.valueOf(1));
        return aux(memo, num);
    }

    private static BigInteger aux(ArrayList<BigInteger> memo, int num) {
        if (memo.size() <= num){
            memo.add(aux(memo, num -1).add(aux(memo,num-2)));
        }
        return memo.get(num);
    }
}