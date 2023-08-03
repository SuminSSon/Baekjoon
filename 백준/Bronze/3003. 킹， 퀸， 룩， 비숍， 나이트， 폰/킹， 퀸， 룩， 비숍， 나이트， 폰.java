import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        int q = sc.nextInt();
        int r = sc.nextInt();
        int b = sc.nextInt();
        int kn = sc.nextInt();
        int p = sc.nextInt();

        System.out.printf("%d %d %d %d %d %d",1-k, 1-q, 2-r, 2-b, 2-kn, 8-p);
    }
}