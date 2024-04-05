import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String brackets = reader.readLine();
        Stack<Character> stack = new Stack<>();
        
        int answer = 0;
        
        for(int i=0; i<brackets.length(); i++){
            char ch = brackets.charAt(i);
            
            if(ch == '('){
                stack.add(ch);
            }else{
                if(stack.empty()){
                    answer++;
                }else{
                    stack.pop();
                }
            }
        }
        answer += stack.size();
        
        System.out.println(answer);
    }
}