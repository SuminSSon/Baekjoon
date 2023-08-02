import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = sc.nextInt();
        int[] arr = new int[max];
        int cnt = sc.nextInt();

        for(int i=0; i<max; i++) arr[i] = i+1;

        for(int i=0; i<cnt; i++) {
            int n1 = sc.nextInt()-1;
            int n2 = sc.nextInt()-1;
            int temp;

            temp = arr[n1];
            arr[n1] = arr[n2];
            arr[n2] = temp;
        }

        for(int n: arr) System.out.printf(n+" ");
    }
}