import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> queue = new LinkedList<Integer>();
        int N = Integer.parseInt(reader.readLine());

        for (int i = 1; i <= N; i++) {
            //add()는 exception을 발생시킬 수 있으므로 사용하지 않았다
            queue.offer(i);
        }

        while (!queue.isEmpty() && queue.size() > 1) {
            queue.poll();
            queue.offer(queue.peek());
            queue.poll();
        }
        System.out.println(queue.peek());
    }
}