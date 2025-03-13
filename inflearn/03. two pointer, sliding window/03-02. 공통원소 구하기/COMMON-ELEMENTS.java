import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nArr = new int[n];
        for (int i = 0; i < n; i++) {
            nArr[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] mArr = new int[m];
        for (int i = 0; i < m; i++) {
            mArr[i] = sc.nextInt();
        }

        Arrays.sort(nArr);
        Arrays.sort(mArr);

        List<Integer> result = new ArrayList<>();
        int nIndex = 0;
        int mIndex = 0;

        while (nIndex < n && mIndex < m) {
            // 같으면 index 둘다 ++
            // 더 작은 쪽을 ++ 시키자
            if (nArr[nIndex] == mArr[mIndex]) {
                result.add(nArr[nIndex++]);
                mIndex++;
            }else if (nArr[nIndex] > mArr[mIndex]) mIndex++;
            else if (nArr[nIndex] < mArr[mIndex]) nIndex++;
        }

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}