package programmers;

public class BiggerTotal {
	public int solution(int a, int b) {
        int answer = 0;
        
        String case1 = Integer.toString(a) + Integer.toString(b);
        String case2 = Integer.toString(b) + Integer.toString(a);
        
        answer = Integer.parseInt(case1) >= Integer.parseInt(case2) ? Integer.parseInt(case1) : Integer.parseInt(case2) ;
        
        return answer;
    }
}
