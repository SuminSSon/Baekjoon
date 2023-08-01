import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = sc.nextInt();
        int max = sc.nextInt();
        int result = 0;

        for(int i = 0; i < max; i++){
            int cost = sc.nextInt();
            int num = sc.nextInt();

            result += cost*num;
        }

        if (total == result) System.out.println("Yes");
        else System.out.println("No");
    }
}