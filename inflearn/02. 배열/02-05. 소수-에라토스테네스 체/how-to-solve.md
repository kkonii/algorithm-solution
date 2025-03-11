# how to solve
: 에라토스테네스 체

> 숫자 N이 있고 `a^ = N`일 때,
- a 가 N/2 보다 **큰** 경우 1과 N 자신만이 약수가 된다.
- a 가 N/2 보다 **작거나 같다면** 소수가 아니다.

   <br>

  즉, 1 에서 N/2의 범위 내에 존재하는 자연수로 N을 나누었을 때 0이 된다면, 약수이다.

작성 코드
```java
 import java.util.*;

public class Main{
    private void prime(List<Integer> result, int n, float m) {
        List<Integer> nums = new ArrayList<>();
        for (int i = 1; i <= m; i++) {
            nums.add(i);
        }
        if (search(nums, n)) {
            result.add(n);
        }
    }

    private boolean search(List<Integer> nums, int n) {
        boolean isPrime = true;
        for (int num: nums) {
            if (n % num == 0 && n != num && num != 1) isPrime = false;
        }

        return isPrime;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Integer> result = new ArrayList<Integer>();
        
        for (int i = 2; i <= n; i++) {
            main.prime(result, i, i/2.0f);
        }

        System.out.println(result.size());
    }
}
```

   <br>

### ❔시간 초과가 발생한 이유

  > 1️⃣ 소수를 판별할 때 매번 리스트를 생성해서 1부터 어떤 수까지 **모든 수를 전부** 나누고 있다<br>
  2️⃣ `search()` 메서드 안에서 `nums`의 길이는 점점 커지고, 그 안에 있는 요소들을 전부 `n % num`으로 나누고 있다
  
<br>

### ✅ what I tried
- `prime()` 에서의 `m`값을 `n/2`로 선언하여 for 문을 돌도록 한다
- 모든 숫자를 list 에 `add` 하기 전에 조건에 해당하는 것만 추가하도록 한다
- 제곱근이 `N/2` 보다 같거나 작다는 조건이 성립하는 숫자들에 대하여, 나누었을 때 0이 되면 약수임을 체크한다

수정한 코드
```java
 import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int numCount = 0;

        for (int i = 2; i <= n; i++) {
            int divide = 0;
            for (int j = 1; j * j <= i/2; j++) {
                if (i % j == 0) {
                    divide++;
                }
            }
            if (divide == 1) {
                numCount++;
            }
        }

        System.out.println(numCount);
    }
}
```

<br>

### 🚨반례

예를 들어 `i = 9`일 때:

```java

for (int j = 1; j * j <= i / 2; j++) {
    if (i % j == 0) {
        divide++;
    }
}

```

- `i / 2 = 4`, `j * j <= 4` → j는 1, 2까지만 돈다.
- 따라서 실제 약수인 `3`이 배제된다


- 1은 당연히 나눠떨어짐 → `divide = 1`
- 2는 9 % 2 != 0 → 나눠떨어지지 않는다


➜ 그래서 `divide == 1` → 소수라고 판단해버리기에 적합하지 않은 로직 ❌