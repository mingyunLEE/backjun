import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if(Character.isUpperCase(str.charAt(i))){
                String a = String.valueOf(str.charAt(i));
                result += a.toLowerCase();
            }else{
                String a = String.valueOf(str.charAt(i));
                result += a.toUpperCase();
            }

        }
        System.out.println(result);
    }
}