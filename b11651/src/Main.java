import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrLength = sc.nextInt();
        int[][] arr = new int[arrLength][2];

        for (int i = 0; i < arr.length; i++) {
            arr[i][1] = sc.nextInt();
            arr[i][0] = sc.nextInt();
        }

        Arrays.sort(arr, (e1, e2) -> {
            if(e1[0] == e2[0]) {
                return e1[1] - e2[1];
            } else{
                return e1[0] - e2[0];
            }
        });

        for (int i = 0; i < arrLength; i++) {
            System.out.println(arr[i][1] + " " + arr[i][0]);


        }


    }
}