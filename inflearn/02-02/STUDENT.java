import java.util.*;

public class Main {
    public static int count(int n, int[] arr) {
        ArrayList<Integer> students = new ArrayList<>();
        students.add(arr[0]);
        int max = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
                students.add(arr[i]);
            }
        }

        return students.size();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(count(n, arr));
    }
}