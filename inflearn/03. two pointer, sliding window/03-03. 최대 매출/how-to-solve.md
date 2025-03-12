# how to solve?

주어진 `n`개 만큼의 숫자를 합한 값을 sum
for 문을 돌면서 이 `sum`을 비교해서 `maximum` 값을 찾아나가는 방법

<작성 코드>
```java
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

        int sum = 0;

        for (int i = 0; i < n - count; i++){
            int value = 0;
            while (i < (count + i)) {
                value += arr[i++];
            }
            if (value > sum) sum = value;
        }

        System.out.println(sum);
    }
}
```

#### 제출 결과 : `Runtime Error` 발생 ✖️

### ❔ 왜 런타임 에러가 발생했을까?

```java
for (int i = 0; i < n - count + 1; i++) {
    while (i < (count + i)) {
        value += arr[i++];
    }
}
```

- for 반복문 안에서 동작시키는 **while 문의 `i`값**과 **for 문의 `i`값**이 **같은 변수**이다
- 둘은 같은 메모리, 값을 공유하고 있다
- while 문 안에서의 i 값의 변화가 반복문의 i 값에도 영향을 미친다

따라서 반복문에서의 i값은 의도한 대로 증가하지 않는다 ✖️

---

### ✅ what I tried

while 문에서 증가할 값에 해당하는 새로운 변수를 만들었다

<수정 코드>
```java
for (int i = 0; i < n - count; i++){
            int j = i;
            int value = 0;
            while (j < (count + i)) {
                value += arr[j++];
            }
            if (value > sum) sum = value;
        }
```

제출 결과 : `Time Limit Exceeded` 발생✖️

<br>

### ❔시간을 초과한 이유

현재 코드

- 바깥 for문 → i가 0부터 n - count - 1까지 → 거의 `O(n)` 번 반복
- 안쪽 while문 → 각 for 루프마다 `count`번 실행

즉 `O(n) * count`로 n과 count 값이 커질수록 시간 초과가 발생

---

### ✅ what I tried

처음 `count`개 만큼의 숫자를 합하고 이후 한 칸씩 이동할 때마다
- 이전 값에서 맨 앞 값을 빼고
- 새로 들어온 값을 더함

= **sliding window** 방식

<최종 코드><br>
[MAXIMUM-SALE.java](https://github.com/kkonii/algorithm-solution/blob/main/inflearn/03.%20two%20pointer%2C%20sliding%20window/03-03.%20%EC%B5%9C%EB%8C%80%20%EB%A7%A4%EC%B6%9C/MAXIMUM-SALE.java)

#### 📍실수하기 쉬운 부분
- 원소를 한 개씩 빼고 더할 값의 변수
- 한 개씩 배열 인덱스를 옮길 때마다 값을 비교하고 업데이트할 최대값의 변수

가 각각 존재해야 한다. 