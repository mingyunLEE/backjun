import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num1 = sc.nextInt();
        int[] resultArr = new int[num1];

        int count = 0;
        for (int i = 0; i < resultArr.length; i++) {
            resultArr[i] = sc.nextInt();
        }
        int number = sc.nextInt();

        for (int i = 0; i < resultArr.length; i++) {
            if(number == resultArr[i]){
                count++;
            }
        }
        System.out.println(count);

    }
}