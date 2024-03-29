import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        int result = 0;

        while(N-->0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int S = Integer.parseInt(st.nextToken());

            if(S==0)
                stack.pop();
            else
                stack.push(S);
        }

        while(!stack.isEmpty()) {
            result+= stack.peek();
            stack.pop();
        }
        System.out.println(result);
    }
}