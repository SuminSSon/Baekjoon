import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static long gcd(long num1, long num2){
        if(num2 == 0) return num1;
        else return gcd(num2, num1 % num2);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        long num1 = Integer.parseInt(st.nextToken());
        long num2 = Integer.parseInt(st.nextToken());

        long gcd = gcd(num1, num2);
        System.out.println(num1 * num2 / gcd);
    }
}