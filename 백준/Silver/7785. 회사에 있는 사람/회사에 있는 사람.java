import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        HashSet<String> S = new HashSet<>();
        for(int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String in = st.nextToken();

            if(Objects.equals(in, "enter")) S.add(name);
            else S.remove(name);
        }

        List<String> list = new ArrayList<>(S);
        list.sort(Collections.<String>reverseOrder());

        for (String name : list) System.out.println(name);
    }
}