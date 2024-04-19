import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String NP = reader.readLine();
        StringTokenizer tokenizer = new StringTokenizer(NP);
        int count = 0;

        int N = Integer.parseInt(tokenizer.nextToken());
        Stack<Integer>[] array = new Stack[N];

        for (int i = 0; i < N; i++) {
            array[i] = new Stack<Integer>();
        }

        for (int i = 0; i < N; i++) {
            String MEL = reader.readLine();
            StringTokenizer Mtokenizer = new StringTokenizer(MEL);
            int NN = Integer.parseInt(Mtokenizer.nextToken()) - 1;
            int FLAT = Integer.parseInt(Mtokenizer.nextToken());

            if (array[NN].isEmpty()){
                array[NN].push(FLAT);
                count++;
            }else{
                int NFLAT = array[NN].peek();
                if (NFLAT < FLAT) {
                    array[NN].push(FLAT);
                    count++;
                }
                //NFLAT : 기존 스택에 있던 flat, FLAT : 새로운 flat
                //기존 플랫이 클 경우, 손가락을 하나씩 떼고 다시 대소 비교
                if (NFLAT > FLAT){
                    while (!array[NN].isEmpty() && array[NN].peek() > FLAT){
                        array[NN].pop();
                        count++;
                    }
                    if (array[NN].isEmpty() || array[NN].peek() < FLAT){
                        array[NN].push(FLAT);
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}