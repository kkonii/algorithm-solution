import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

        int V = Integer.parseInt(reader.readLine());
        int count = 0;
        
        for (int i=0;i<N;i++){
            int number = Integer.parseInt(tokenizer.nextToken());

            if (number == V) count++;
        }
        
        System.out.println(count);
        
        reader.close();
    }
}