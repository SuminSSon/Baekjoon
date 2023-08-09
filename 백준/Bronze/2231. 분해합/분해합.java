import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String tmp = String.valueOf(N);
        int N_len = tmp.length();
        int result = 0;

        for(int i = (N - (N_len * 9)); i < N; i++) {
            int number = i;
            int sum = 0;

            while(number != 0) {
                sum += number%10;
                number /= 10;
            }
            if(sum+i == N) {
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}