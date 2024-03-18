import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Integer> numbers = new Stack<>();
        
        int count = Integer.parseInt(bf.readLine());
        int startNum = 0;
        
        //count만큼의 반복
        for(int i=0; i<count; i++){
            //입력한 숫자
            int number = Integer.parseInt(bf.readLine());
            
            if(number > startNum){
                for(int j=startNum + 1; j<=number; j++){
                    numbers.push(j);
                    sb.append("+").append("\n");
                }    
                startNum = number;
            }else if(numbers.peek() != number){
                System.out.println("NO");
                return;
            }
            
            numbers.pop();
            sb.append("-").append("\n");
        }
        System.out.println(sb);
    }
}