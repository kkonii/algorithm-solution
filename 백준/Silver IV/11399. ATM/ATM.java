import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int count = scanner.nextInt();
        int[] delayTimes = new int[count];
        
        for (int i = 0; i < count; i++){
            delayTimes[i] = scanner.nextInt();
        }
        
        Arrays.sort(delayTimes);
        
        int totalSum = 0;
        int cumulation = 0;
        
        for (int i = 0; i< count; i++){
            totalSum += cumulation + delayTimes[i];
            cumulation += delayTimes[i];
        }
        
        System.out.println(totalSum);
    }
}