import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double sum=0;
        double cnt=0;
        for(int i=0; i<20; i++){
            String title = sc.next();
            double score = sc.nextDouble();
            String grade = sc.next();

            cnt += score;
            if(grade != "F") {
                switch (grade) {
                    case "A+": sum += score*4.5; break;
                    case "A0": sum += score*4.0; break;
                    case "B+": sum += score*3.5; break;
                    case "B0": sum += score*3.0; break;
                    case "C+": sum += score*2.5; break;
                    case "C0": sum += score*2.0; break;
                    case "D+": sum += score*1.5; break;
                    case "D0": sum += score; break;
                    case "P": cnt-=score; break;
                }
            }
        }
        System.out.printf("%.6f", sum/cnt);
    }
}