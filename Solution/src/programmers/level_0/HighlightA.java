package programmers.level_0;

public class HighlightA {
	 public String solution(String myString) {
	        String answer = "";
	        
	        for(int i=0;i<myString.length();i++){
	            char c = myString.charAt(i);
	            
	            if(c == 'a') c = Character.toUpperCase(c);
	            else if(c != 'A') c= Character.toLowerCase(c);
	            
	            answer += c;
	        }
	        
	        return answer;
	    }
}
