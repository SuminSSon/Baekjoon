import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String S = br.readLine();

        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (Character.isLowerCase(c) || Character.isUpperCase(c)) {
                int n = (int) c + 13;
                if (Character.isLowerCase(c) && n > 122) n -= 26;
                if (Character.isUpperCase(c) && n > 90) n -= 26;
                sb.append((char) n);
            } else {
                sb.append(S.charAt(i));
            }
        }
        bw.write(String.valueOf(sb));
        bw.flush();
        bw.close();
    }
}