import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int fs = sc.nextInt();

        int ss = sc.nextInt();

        int ts = sc.nextInt();

        int fours = sc.nextInt();

        int sum = (fs + ss + ts + fours);
        int min = sum / 60;
        int sec = sum - (min * 60);

        System.out.println(min);
        System.out.println(sec);

    }
}