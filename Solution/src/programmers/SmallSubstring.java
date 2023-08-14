package programmers;

import java.util.*;

public class SmallSubstring {
    public int solution(String t, String p) {
        int answer = 0;
        //p의 문자열 길이
        int arrlen = t.length()-p.length()+1;
        String parr[] = new String[arrlen];
        
        //길이만큼 t에서 뽑아내서 p와 크기 비교
        for(int i=0;i<arrlen;i++){
            //더 작으면 answer++
            parr[i] = t.substring(i,i+p.length());
            if(Long.parseLong(parr[i]) <= Long.parseLong(p)){
                answer++;
            }
        }
        
        return answer;
    }
}
