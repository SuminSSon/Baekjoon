import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));Stack<Integer> stack = new Stack<>();
        int cnt = 0;
        String S = br.readLine();

        for(int i=0; i < S.length(); i++) {
            if(S.charAt(i) == '(') stack.push(1);
            if (S.charAt(i) == ')') {
                stack.pop();

                if (S.charAt(i - 1) == '(') cnt += stack.size();
                else cnt++;
            }
        }
        System.out.println(cnt);
    }
}