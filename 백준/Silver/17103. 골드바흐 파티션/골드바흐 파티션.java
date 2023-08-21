import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        boolean[] primeNum = new boolean[1000001]; // false == prime
        primeNum[0] = primeNum[1] = true;

        for (int i = 2; i < primeNum.length; i++)
            if (!primeNum[i])
                for (int j = 2; i * j < primeNum.length; j++) primeNum[i * j] = true;

        for (int testCase = 0; testCase < T; testCase++) {
            int N = Integer.parseInt(br.readLine());
            int partitionCount = 0;

            for (int idx = 2; idx <= N / 2; idx++)
                if (!primeNum[idx])
                    if (!primeNum[N - idx]) partitionCount++;
            System.out.println(partitionCount);
        }
    }
}