import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[][] arr = new int[N][2];
        for(int i=0; i<N; i++) {
            StringTokenizer sb = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(sb.nextToken());
            arr[i][1] = Integer.parseInt(sb.nextToken());
        }

        Arrays.sort(arr, (e1, e2) -> {
            if(e1[1] == e2[1]) return e1[0] - e2[0];
            else return e1[1] - e2[1];
        });


        for (int i=0; i<N; i++) System.out.println(arr[i][0]+" "+arr[i][1]);
    }
}