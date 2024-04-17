import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder builder = new StringBuilder();
        Stack<Integer> stack = new Stack<>();

        int N = Integer.parseInt(reader.readLine());

        for (int i = 0; i < N; i++) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            String S = tokenizer.nextToken();

            if(S.equals("push")){
                stack.push(Integer.parseInt(tokenizer.nextToken()));
            }
            if (S.equals("pop")){
                if(stack.isEmpty()){
                    builder.append(-1).append("\n");
                }else{
                    builder.append(stack.pop()).append("\n");
                }
            }
            if (S.equals("size")){
                builder.append(stack.size()).append("\n");
            }
            if (S.equals("empty")){
                if (stack.isEmpty()){
                    builder.append(1).append("\n");
                }else{
                    builder.append(0).append("\n");
                }
            }
            if (S.equals("top")){
                if (stack.isEmpty()){
                    builder.append(-1).append("\n");
                }else{
                    builder.append(stack.peek()).append("\n");
                }
            }
        }
        System.out.println(builder);
    }
}