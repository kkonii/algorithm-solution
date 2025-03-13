# how to solve?

중복되는 숫자는 저장하고 `index` 값을 늘려나가면서 똑같이 비교하는 방식

<작성 코드>
```java
while (nIndex < n && mIndex < m) {
    // 같으면 index 둘다 ++
    if (nArr[nIndex] == mArr[mIndex]) {
        result.add(nArr[nIndex++]);
        mIndex++;
    }
    // 더 작은 쪽을 ++ 시키자
    if (nArr[nIndex] > mArr[mIndex]) mIndex++;
    if (nArr[nIndex] < mArr[mIndex]) nIndex++;
}
```

#### 제출 결과 : `Runtime Error` 발생 ✖️

<br>

### ❔ 왜 런타임 에러가 발생했을까?

조건을 따지는 로직의 오류 즉, **if 문**이 적절하게 사용되지 못함

의도했던 로직
> 각 세 개의 조건 중 하나의 케이스에 해당하는 동작을 실행한다

**BUT**

현재 나의 코드는

- 각 if 문이 모두 별개이므로, 하나의 인덱스값 - 하나의 조건절에 대응하는 것이 X
- 만약 첫 번째 조건문에 걸려서 nIndex 와 mIndex 가 ++ 된 경우
- 아직 끝나지 않은 두 개의 조건문 코드로 넘어가면서 index 가 증가하게 됨
- 블록 끝까지 가면 다시 1번으로 돌아가서 조건을 재확인

n 과 m 배열의 원소 중 중복되는 원소가 또 존재해도 2, 3번째 조건문 실행이 끝날 때까지 중복되는 원소를 건너뛰게 될 수도 있음

<br>

### ✅ what I tried

하나의 큰 조건문 덩어리 = `else-if`문으로 만들어 실행한다


- 위에서부터 차례대로 조건을 확인하다가
- 참인 조건이 처음으로 발견되면 그 블록만 실행
- 나머지 `else if`, `else` 블록은 전부 건너뛰고 **🌟바로 if문 전체를 빠져나옴🌟**

<수정 코드>
```java
for (int i = 0; i < n - count + 1; i++) {
    while (i < (count + i)) {
        value += arr[i++];
    }
}
```
<br>

최종 코드 : [COMMON-ELEMENTS.java](https://github.com/kkonii/algorithm-solution/blob/main/inflearn/03.%20two%20pointer%2C%20sliding%20window/03-02.%20%EA%B3%B5%ED%86%B5%EC%9B%90%EC%86%8C%20%EA%B5%AC%ED%95%98%EA%B8%B0/COMMON-ELEMENTS.java)


#### 📍실수하기 쉬운 부분

마지막 if 문까지 실행되면, **그 시점에서 while 블록의 한 사이클이 끝나고**, 다시 while 조건으로 되돌아가게 된다

즉, while 문은 한 번 돌 때 → **💡안에 있는 코드 전부 실행** → 끝까지 가면 다시 조건 확인 → 조건이 참이면 새로 한 바퀴 실행