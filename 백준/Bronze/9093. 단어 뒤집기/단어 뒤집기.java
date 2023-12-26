import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());


        for(int i=0; i < N; i++) {
            Stack<Character> stack = new Stack<>();
            StringBuilder sb = new StringBuilder();
            String sentence = br.readLine() + " ";

            for (int j = 0; j < sentence.length(); j++) {
                if (sentence.charAt(j) == ' ') {
                    while (!stack.empty()) sb.append(stack.pop());
                    sb.append(sentence.charAt(j));
                } else {
                    stack.push(sentence.charAt(j));
                }
            }
            System.out.println(sb);
        }
    }
}