import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        nums[0] = 1;
        nums[1] = 1;
        nums[2] = 2;

        for (int i = 3; i < n; i++) {
            nums[i] = nums[i-1] + nums[i-2];
        }

        for (int num: nums) {
            System.out.print(num + " ");
        }
    }
}