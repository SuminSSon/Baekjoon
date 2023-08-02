import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = sc.nextInt();
        int[] arr = new int[max];
        int cnt = sc.nextInt();

        int start, end, num;

        for(int i=0; i<cnt; i++){
            start = sc.nextInt()-1;
            end = sc.nextInt()-1;
            num = sc.nextInt();

            for(int k=start; k<end+1; k++) arr[k] = num;
        }

        for(int n: arr)  System.out.printf(n+" ");
    }
}