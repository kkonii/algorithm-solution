import java.util.Scanner;
import java.util.Stack;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        Stack<Integer> Nstack = new Stack<>();
        int summary = 0;
        
        for(int i=0; i<N; i++){
            int number = scanner.nextInt();
            
            if(number != 0){
                Nstack.push(number);
            }else{
                Nstack.pop();
            }
        }
        
        for(Integer num : Nstack) {
            summary += num;
        }
        
        System.out.println(summary);
        
        scanner.close();
    }
}