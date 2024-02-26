import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new LinkedList<>();
        String S = br.readLine();

        for (int i = 0; i < S.length(); i++) {
            list.add(S.substring(i));
        }
        Collections.sort(list);

        for(String index : list) System.out.println(index);
    }
}