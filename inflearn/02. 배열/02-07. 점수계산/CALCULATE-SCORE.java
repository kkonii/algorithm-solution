import java.util.*;

public class Main{
    private static int summary(int[] scores){
        int point = 0;
        int summary = 0;

        for (int i = 0; i < scores.length; i++){
            if (scores[i] == 1){
                point++;
            }else {
                point = 0;
            }
            summary += point;
        }

        return summary;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] scores = new int[n];

        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }

        System.out.println(summary(scores));
    }
}