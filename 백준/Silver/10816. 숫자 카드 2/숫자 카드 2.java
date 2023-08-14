import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        HashMap<Integer, Integer> M = new HashMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
            int num = Integer.parseInt(st.nextToken());
            if(M.containsKey(num)) M.replace(num, M.get(num)+1);
            else M.put(num, 1);
        }

        N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
            int num = Integer.parseInt(st.nextToken());
            if(M.containsKey(num)) sb.append(M.get(num)).append(' ');
            else sb.append(0).append(' ');
        }

        System.out.println(sb);
    }
}