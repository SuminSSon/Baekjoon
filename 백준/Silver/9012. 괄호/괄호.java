import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for(int i=0; i < N; i++) {
            Stack<Integer> stack = new Stack<>();
            StringBuilder sb = new StringBuilder();
            String S = br.readLine();

            for (int j=0; j < S.length(); j++) {
                if(S.charAt(j) == '(') {
                    stack.push(1);
                }
                else if (S.charAt(j) == ')') {
                    if(stack.isEmpty()) {
                        stack.push(2);
                        break;
                    }
                    else stack.pop();
                }
            }
            if(!stack.empty()) sb.append("NO");
            else sb.append("YES");

            System.out.println(sb);
        }
    }
}