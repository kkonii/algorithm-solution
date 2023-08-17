package programmers;

import java.util.*;

public class NumbersPair {
    public String solution(String X, String Y) {
        String answer = "";
        
        char[] arrX = X.toCharArray();
		char[] arrY = Y.toCharArray();
        
        Arrays.sort(arrX);
		Arrays.sort(arrY);
        
        X = String.valueOf(arrX);	
		Y = String.valueOf(arrY);
        
        List<Character> answerArr = new ArrayList<>();
        
        for(int i=0,j=0;i<X.length();i++) {
			int findIndex = Y.indexOf(X.charAt(i),j);
			if(findIndex != -1) {
				answerArr.add(X.charAt(i)); j=findIndex+1; continue;
			} else continue;
		}
		
		Arrays.sort(answerArr.toArray());
		
		for(int i=answerArr.size()-1;i>=0;i--) answer+=answerArr.get(i);
        
		if(answer == "") answer = "-1";
        if(answer.charAt(0) == '0' && answer.charAt(answer.length()-1) == '0') answer = "0";
        
        return answer;
    }
}
