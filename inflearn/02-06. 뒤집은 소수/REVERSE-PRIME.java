import java.util.*;

public class Main{
    private static boolean isPrime(int num) {
        if (num < 2) return false;

        for (int j = 2; j * j <= num; j++) {
            if (num % j == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            //뒤바뀐 숫자
            int reverse = 0;

            while(num > 0) {
                int remain = num % 10;
                reverse = reverse * 10 + remain;
                num = num / 10;
            }
            if (isPrime(reverse)) result.add(reverse);
        }

        for (int prime : result) {
            System.out.print(prime + " ");
        }
    }
}