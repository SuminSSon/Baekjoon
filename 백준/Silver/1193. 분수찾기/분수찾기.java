import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int cross = 1, prev_count_sum = 0;

        while (true) {
            if (X <= prev_count_sum + cross) {
                if (cross % 2 == 1) {
                    System.out.print((cross - (X - prev_count_sum - 1)) + "/" + (X - prev_count_sum));
                    break;
                } else {
                    System.out.print((X - prev_count_sum) + "/" + (cross - (X - prev_count_sum - 1)));
                    break;
                }
            } else {
                prev_count_sum += cross;
                cross++;
            }
        }
    }
}