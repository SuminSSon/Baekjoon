import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int[] arr = new int[26];

        for(int i=0; i<26; i++) arr[i] = -1;
        for(int i=0; i<s.length(); i++){
            int j = (int)s.charAt(i)-'a';
            arr[j] = s.indexOf(s.charAt(i));
        }
        for(int index:arr) System.out.printf(index+" ");
    }
}