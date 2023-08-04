import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            String S = sc.next();
            boolean check[] = new boolean[26];
            boolean group = true;

            for (int j = 0; j < S.length(); j++) {
                int index = S.charAt(j)-'a';
                if(check[index]) {
                    if(S.charAt(j) != S.charAt(j-1)) {
                        group = false;
                        break;
                    }
                } else check[index] = true;
            }
            if(group) cnt++;
        }
        System.out.println(cnt);
    }
}