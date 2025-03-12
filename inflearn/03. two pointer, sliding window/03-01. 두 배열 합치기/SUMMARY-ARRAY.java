import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arrN = new int[n];
        for (int i = 0; i < n; i++) {
            arrN[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] arrM = new int[m];
        for (int i = 0; i < m; i++) {
            arrM[i] = sc.nextInt();
        }

        List<Integer> result = new ArrayList<>();

        int nIndex = 0;
        int mIndex = 0;

        while (nIndex < n && mIndex < m) {
            if (arrN[nIndex] > arrM[mIndex]) {
                result.add(arrM[mIndex++]);
            }else{
                result.add(arrN[nIndex++]);
            }
        }

        // 끝나지 않은 배열의 남은 원소 모두 추가하기
        if (nIndex < n) {
            for (int i = nIndex; i < n; i++) {
                result.add(arrN[i]);
            }
        }
        if (mIndex < m) {
            for (int i = mIndex; i < m; i++) {
                result.add(arrM[i]);
            }
        }

        // 결과 출력
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}