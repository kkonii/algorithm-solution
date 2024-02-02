import java.util.Stack;
import java.util.StringTokenizer;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

//클래스 이름은 무조건 Main - 컴파일 에러 방지
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer tokenizer;
        
        int commandCount = Integer.parseInt(reader.readLine());
        Stack<Integer> stack = new Stack<>();
        
        for(int i=0;i<commandCount;i++){
            tokenizer = new StringTokenizer(reader.readLine());
            int command = Integer.parseInt(tokenizer.nextToken());
            
            if (command == 1){
                int number = Integer.parseInt(tokenizer.nextToken());
                stack.push(number);
            }
            if (command == 2){
                if(stack.empty()){
                    writer.write(-1 + "\n");
                } else{
                    writer.write(stack.pop() + "\n");
                }
            }
            if (command == 3){
                writer.write(stack.size() + "\n");
            }
            if (command == 4){
                if(stack.empty()){
                    writer.write(1 + "\n");
                }else{
                    writer.write(0 + "\n");
                }
            }
            if (command == 5){
                if(!stack.empty()){
                    writer.write(stack.peek() + "\n");
                }else{
                    writer.write(-1 + "\n");
                }
            }
        }
        writer.flush();
        writer.close();
    }
}