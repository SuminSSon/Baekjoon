import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String S = br.readLine();
        int flag = 0;
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<S.length(); i++) {
            if(S.charAt(i) == '<') {
                while (!stack.isEmpty()) {
                    sb.append(stack.pop());
                }
                flag = 1;
                sb.append(S.charAt(i));
            } else if (S.charAt(i) == '>') {
                flag = 0;
                sb.append(S.charAt(i));
            }else {
                if (flag == 1) sb.append(S.charAt(i));
                else {
                    if (S.charAt(i) == ' ') {
                        while (!stack.empty()) {
                            sb.append(stack.pop());
                        }
                        sb.append(S.charAt(i));
                    } else {
                        stack.push(S.charAt(i));
                    }
                }
            }
        }

        while(!stack.empty()) {
            sb.append(stack.pop());
        }
        System.out.println(sb);
    }
}