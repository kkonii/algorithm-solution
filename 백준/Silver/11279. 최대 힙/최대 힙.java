import java.util.Queue;
import java.util.Scanner;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main{
    public static void main(String[] args){
        Queue<Integer> integers = new PriorityQueue<>(Comparator.reverseOrder());
        Scanner scanner = new Scanner(System.in);
        
        int count = scanner.nextInt();
        
        for(int i=0; i<count; i++){
            int number = scanner.nextInt();
            
            if(number == 0){
                if (integers.isEmpty()){
                    System.out.println(0);
                }else{
                    int pollNum = integers.poll();
                    System.out.println(pollNum);
                }
            }
            if (number != 0){
                integers.add(number);
            }
        }
    }
}