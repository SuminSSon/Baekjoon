import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        int[] distance = new int[N];
        st = new StringTokenizer(br.readLine());

        for(int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=0; i<N; i++) {
            distance[i] = Math.abs(arr[i] - S);
        }

        int gcd = distance[0];
        for(int i=1; i<N; i++) {
            gcd = euclidean(gcd, distance[i]);
        }
        System.out.println(gcd);
        br.close();
    }

    private static int euclidean(int a, int b) {
        if(a>b) {
            if(a % b == 0) return b;
            else return euclidean(b, (a%b));
        }
        else {
            if(b % a == 0) return a;
            else return euclidean(a, (b%a));
        }
    }
}