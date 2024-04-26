import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    static Deque<Integer> deque = new LinkedList<Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder builder = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            StringTokenizer tokenizer =  new StringTokenizer(br.readLine());
            //명령 번호 M, 요소 K
            int M = Integer.parseInt(tokenizer.nextToken());

            if (M == 1){
                deque.addFirst(Integer.parseInt(tokenizer.nextToken()));
            }
            if (M == 2){
                deque.addLast(Integer.parseInt(tokenizer.nextToken()));
            }
            if (M == 3){
                if (!deque.isEmpty()){
                    builder.append(deque.pollFirst()).append("\n");
                }else{
                    builder.append(-1).append("\n");
                }
            }
            if (M == 4){
                if (!deque.isEmpty()){
                    builder.append(deque.pollLast()).append("\n");
                }else{
                    builder.append(-1).append("\n");
                }
            }
            if (M == 5){
                builder.append(deque.size()).append("\n");
            }
            if (M == 6){
                if(deque.isEmpty()){
                    builder.append(1).append("\n");
                }else{
                    builder.append(0).append("\n");
                }
            }
            if (M == 7){
                if (!deque.isEmpty()){
                    builder.append(deque.peek()).append("\n");
                }else{
                    builder.append(-1).append("\n");
                }
            }
            if (M == 8){
                if (!deque.isEmpty()){
                    builder.append(deque.peekLast()).append("\n");
                }else{
                    builder.append(-1).append("\n");
                }
            }
        }
        System.out.println(builder);
    }
}