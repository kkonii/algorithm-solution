import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder builder = new StringBuilder();
        Deque<Integer> deque = new LinkedList<Integer>();
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            StringTokenizer tokenizer = new StringTokenizer(br.readLine());
            String M = tokenizer.nextToken();

            if (M.equals("push_back")){
                int S = Integer.parseInt(tokenizer.nextToken());
                deque.addLast(S);
            }
            if (M.equals("push_front")){
                int S = Integer.parseInt(tokenizer.nextToken());
                deque.addFirst(S);
            }
            if (M.equals("pop_front")){
                if (deque.isEmpty()){
                    builder.append(-1).append("\n");
                }else{
                    builder.append(deque.pop()).append("\n");
                }
            }
            if (M.equals("pop_back")){
                if (deque.isEmpty()){
                    builder.append(-1).append("\n");
                }else{
                    builder.append(deque.pollLast()).append("\n");
                }
            }
            if (M.equals("size")){
                builder.append(deque.size()).append("\n");
            }
            if (M.equals("empty")){
                if (deque.isEmpty()){
                    builder.append(1).append("\n");
                }else{
                    builder.append(0).append("\n");
                }
            }
            if (M.equals("front")){
                if (deque.isEmpty()){
                    builder.append(-1).append("\n");
                }else{
                    builder.append(deque.peek()).append("\n");
                }
            }
            if (M.equals("back")){
                if (deque.isEmpty()){
                    builder.append(-1).append("\n");
                }else{
                    builder.append(deque.peekLast()).append("\n");
                }
            }
        }
        System.out.println(builder);
    }
}