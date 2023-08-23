package programmers;

public class Knights_Weapon {
    public int solution(int number, int limit, int power) {
        
        int sum = 0;         //공격력 수치
        
        for(int i=1;i<=number;i++){
            int divisor = 0;        //약수의 갯수 변수
            
            for(int j=1;j*j<=i;j++){
                if(i % j == 0){
                    if(i / j == j) divisor++;
                    else divisor+=2;
                } 
            }
            
            sum = divisor <= limit ? sum + divisor : sum + power;
        }
        
        return sum;
    }
}
