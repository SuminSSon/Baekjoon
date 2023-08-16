import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {
    public static int gcd(int num1, int num2){
        if(num2 == 0) return num1;
        else return gcd(num2, num1 % num2);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for(int i=0; i<N; i++) arr[i] = Integer.parseInt(br.readLine());
        Arrays.sort(arr);

        int gcd = 0;
        for(int i=0; i<N-1; i++){
            int dis = arr[i+1]-arr[i];
            gcd = gcd(dis, gcd);
        }

        sb.append((arr[N-1]-arr[0])/gcd + 1 - (arr.length));
        System.out.println(sb);
    }
}