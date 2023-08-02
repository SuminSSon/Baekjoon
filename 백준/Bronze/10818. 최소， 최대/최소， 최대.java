import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = sc.nextInt();
        int[] arr = new int[max];

        for(int i=0; i<max; i++) arr[i] = sc.nextInt();
        Arrays.sort(arr);
        System.out.printf(String.valueOf(arr[0])+" ");
        System.out.printf(String.valueOf(arr[max-1]));
    }
}