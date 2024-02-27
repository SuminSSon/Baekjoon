import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        long N = Long.parseLong(st.nextToken());
        long M = Long.parseLong(st.nextToken());

        long cnt2 = count2(N) - count2(M) - count2(N-M);
        long cnt5 = count5(N) - count5(M) - count5(N-M);

        System.out.println(Math.min(cnt2, cnt5));
    }

    public static long count5(long num) {
        long temp =0;
        if (num<5) return 0;
        for (long i=5;i<=num;i=i*5) temp+=(num/i);
        return temp;
    }

    public static long count2(long num) {
        long temp =0;
        if (num<2) return 0;
        for (long i=2;i<=num;i=i*2) temp+=(num/i);
        return temp;
    }
}