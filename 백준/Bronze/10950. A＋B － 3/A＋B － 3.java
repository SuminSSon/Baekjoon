import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A, B;
        int max = sc.nextInt();
        int[] arr = new int[max];

        for(int i = 0; i < max; i++) {
            A = sc.nextInt();
            B = sc.nextInt();
            arr[i] = A+B;
        }

        for (int n:arr) System.out.println(n);
    }
}