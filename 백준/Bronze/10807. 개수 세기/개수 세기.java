import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = sc.nextInt();
        int[] arr = new int[max];
        int num;
        int cnt = 0;

        for(int i=0; i<max; i++){
            arr[i] = sc.nextInt();
        }

        num = sc.nextInt();
        for(int n: arr)
            if(num == n) cnt++;
        System.out.println(cnt);
    }
}