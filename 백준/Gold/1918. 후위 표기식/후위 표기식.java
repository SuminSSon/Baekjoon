import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        char[] calc= br.readLine().toCharArray();
        Stack<Character> stack =  new Stack<Character>();

        for (Character c : calc) {
            if (c >= 'A') sb.append(c);
            else if (c == '(') stack.push(c);
            else if (c == ')') {
                while (stack.peek() != '(') sb.append(stack.pop());
                stack.pop();
            } else {
                while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
                    sb.append(stack.pop());
                }
                stack.push(c);
            }
        }
        while (!stack.isEmpty()) sb.append(stack.pop());

        System.out.println(sb.toString());
    }
    public static int precedence(char op) {
        if(op == '*' || op == '/') return 2;
        else if(op == '+' || op == '-') return 1;
        else return 0;
    }
}