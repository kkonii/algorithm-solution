import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static Queue<Integer> queue = new LinkedList<Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder builder = new StringBuilder();
        String NK = br.readLine();
        StringTokenizer tokenizer = new StringTokenizer(NK);

        int N = Integer.parseInt(tokenizer.nextToken());
        int K = Integer.parseInt(tokenizer.nextToken());

        builder.append("<");

        for (int i=1; i <= N; i++) {
            queue.add(i);
        }

        while (queue.size() > 1) {
            for (int i=0; i<K-1; i++){
                int num = queue.poll();
                queue.add(num);
            }
            int num2 = queue.poll();
            builder.append(num2).append(", ");
        }

        builder.append(queue.poll()).append(">");
        
        System.out.println(builder);
    }
}