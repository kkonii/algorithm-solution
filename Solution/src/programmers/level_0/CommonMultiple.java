package programmers.level_0;

public class CommonMultiple {
	public int solution(int number, int n, int m) {
        int answer = 0;
        
        if(number % n == 0 && number % m == 0){
            answer = 1;
        }
        
        return answer;
    }
}
