import java.io.*;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        String s = br.readLine();
        int N = Integer.parseInt(br.readLine());

        LinkedList<Character> list = new LinkedList<>();
        for(int i=0; i<s.length(); i++) list.add(s.charAt(i));

        ListIterator<Character> iter = list.listIterator();
        while(iter.hasNext()) iter.next();

        while(N-- > 0) {
            String command = br.readLine();

            switch (command.charAt(0)) {
                case 'L':
                    if(iter.hasPrevious()) iter.previous();
                    break;
                case 'D':
                    if(iter.hasNext()) iter.next();
                    break;
                case 'B':
                    if(iter.hasPrevious()) {
                        iter.previous();
                        iter.remove();
                    }
                    break;
                case 'P':
                    iter.add(command.charAt(2));
            }
        }
        for(Character ch : list) bw.write(ch);
        bw.flush();
        bw.close();
    }
}