
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String result = "";
        int count =8;
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        if(arr[0] == 1){
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == i+1) {

                    result = "ascending";
                }else {
                    result = "mixed";
                    break;
                }
            }
        }else if(arr[0] == 8){
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == count){
                    result = "descending";
                    count--;
                }else {
                    result = "mixed";
                    break;
                }

            }
        }else{
            result = "mixed";
        }
        System.out.println(result);

    }
}