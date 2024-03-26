import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(reader.readLine());

        PriorityQueue<Integer> minNumbers = new PriorityQueue<>();

        for (int i=0;i<N;i++){
            int number = Integer.parseInt(reader.readLine());

            if (number > 0){
                minNumbers.add(number);
            }else{
                if (minNumbers.isEmpty()){
                    System.out.println(0);
                }else{
                    System.out.println(minNumbers.poll());
                }
            }
        }
        
        reader.close();
    }
}