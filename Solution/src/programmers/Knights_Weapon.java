package programmers;

public class Knights_Weapon {
    public int solution(int number, int limit, int power) {
        
        int sum = 0;         //공격력 수치
        
        int divisor = 0;        //약수의 갯수 변수
        
        for(int i=1;i<=number;i++){
            for(int j=1;j<=number;j++){
                if(number % j == 0) {
                    if(Math.floor(number/j) != 1){
                        divisor++;
                    }else {
                        continue;
                    }
                }
            }
            
            if(divisor > limit) sum += power;
            if(divisor <= limit) sum += divisor;
        }
        
        return sum;
    }
}
