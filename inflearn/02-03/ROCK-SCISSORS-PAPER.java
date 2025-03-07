import java.util.*;

public class Main{
    private List<String> result(int n, int[] a, int[] b){
        List<String> result = new ArrayList<>();

        for (int i = 0; i < n; i++){
            result.add(compare(a[i], b[i]));
        }

        return result;
    }

    private String compare(int a, int b) {

        if ( a == 3) {
            if (b == 1) return "B";
            if (b == 2) return "A";
        }
        if (a == 2 ) {
            if (b == 1) return "A";
            if (b == 3) return "B";
        }

        if (a == 1) {
            if (b == 2) return "B";
            if (b == 3) return "A";
        }

        return "D";
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        for (int i = 0; i < n; i++) {
            b[i] = in.nextInt();
        }

        List<String> answer = main.result(n, a, b);

        for (String result : answer) {
            System.out.println(result);
        }
    }
}