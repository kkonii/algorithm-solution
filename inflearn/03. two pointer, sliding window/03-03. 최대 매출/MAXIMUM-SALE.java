import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        //초기 합 설정
        int sum = 0;
        for (int i = 0; i < count; i++) {
            sum += arr[i];
        }

        int max = sum;

        for (int i = 0; i < n - count; i++){
            //다음 summary의 값
            sum = sum - arr[i] + arr[i + count];
            if (max < sum) {
                max = sum;
            }
        }

        System.out.println(max);
    }
}