import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int x_min = Integer.MAX_VALUE;
        int x_max = Integer.MIN_VALUE;

        int y_min = Integer.MAX_VALUE;
        int y_max = Integer.MIN_VALUE;

        for(int i=0; i<N; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            if(x_min > x) x_min = x;
            if(x_max < x) x_max = x;

            if(y_min > y) y_min = y;
            if(y_max < y) y_max = y;
        }

        System.out.println((x_max-x_min)*(y_max-y_min));
    }
}