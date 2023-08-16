import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int nA = Integer.parseInt(st.nextToken());
        int nB = Integer.parseInt(st.nextToken());
        HashSet<Integer> A = new HashSet<>();
        HashSet<Integer> B = new HashSet<>();

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<nA; i++) A.add(Integer.valueOf(st.nextToken()));

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<nB; i++) B.add(Integer.valueOf(st.nextToken()));

        HashSet<Integer> AA = new HashSet<>(A);
        A.removeAll(B);
        B.removeAll(AA);
        A.addAll(B);

        System.out.print(A.size());
    }
}