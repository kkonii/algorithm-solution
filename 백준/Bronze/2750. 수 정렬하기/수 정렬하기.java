import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        List<Integer> numbers = new ArrayList<>();

        for(int i=0;i<N;i++){
            int number = scanner.nextInt();
            numbers.add(number);
        }

        Collections.sort(numbers);

        for(int number : numbers){
            System.out.println(number);
        }
        
        scanner.close();
    }
}