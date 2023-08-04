import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        s = s.toUpperCase();
        int[] arr = new int[26];

        for(int i = 0; i<s.length(); i++) arr[s.charAt(i)-'A']++;

        int max = -1;
        char result = '?';
        for(int i=0; i<26; i++) {
            if(max<arr[i]) {
                max = arr[i];
                result = (char)(i+'A');
            }
            else if(max == arr[i]) {
                result = '?';
            }
        }
        System.out.println(result);
    }
}