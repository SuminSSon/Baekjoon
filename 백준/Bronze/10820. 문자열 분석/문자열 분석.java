import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String S = "";
        while((S=br.readLine()) != null) {
            int low=0;
            int high=0;
            int num=0;
            int space=0;

            for(int i=0; i<S.length(); i++) {
                if(S.charAt(i)>=65 && S.charAt(i)<=90) high++;
                else if(S.charAt(i)>=97 && S.charAt(i)<=122) low++;
                else if(S.charAt(i)>=48 && S.charAt(i)<=57) num++;
                else if(S.charAt(i)==' ') space++;
            }
            sb.append(low).append(' ').append(high).append(' ').append(num).append(' ').append(space).append('\n');
        }

        bw.write(String.valueOf(sb));
        bw.flush();
        bw.close();
    }
}