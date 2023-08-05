package programmers;

public class CodeProcessing {
	public String solution(String code) {
        String answer = "";
        
        char[] codeArr = code.toCharArray();
        
        //기본 시작 모드
        int mode = 0;
        
        for(int i=0;i<codeArr.length;i++){
            if(mode == 0){
                if(codeArr[i] != '1'){
                    if(i % 2 == 0 || i == 0) answer = answer + codeArr[i];
                }else{
                    mode = 1;
                }
            }else if(mode == 1){
                if(codeArr[i] != '1'){
                    if(i % 2 == 1) answer = answer + codeArr[i];
                }else{
                    mode = 0;
                }
            }
        }
        
        if(answer.equals("")) answer = "EMPTY";
        
        return answer;
    }
}
