package programmers;

public class Babbling_2 {
	 public int solution(String[] babbling) {
        int answer = 0;
        
        String[] words = {"aya","ye","ma","woo"};
        
        for(String babble : babbling) {
        	babble = replaceWord(words, babble);
        	
        	if(babble.matches("^[0-9]*$") && isContinuity(babble)) answer++;
        }
        
        return answer;
	 }
	 
	 private static String replaceWord(String[] words, String babble) {
		 for(int i=0;i<words.length;i++) {
			 babble = babble.replaceAll(words[i], String.valueOf(i));
		 }
		 
		 return babble;
	 }
	 
	 private static boolean isContinuity(String babble) {
		 for(int i=0;i<babble.length()-1;i++) {
			 if(babble.charAt(i) == babble.charAt(i+1)) return false;
		 }
		 
		 return true;
	 }
}
