import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int result = 1;
        while(result != 0){
            int a = sc.nextInt();
            int b = sc.nextInt();

            result = a+b;
            if (result != 0) System.out.println(result);
        }
    }
}