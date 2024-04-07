import java.io.*;
import java.util.*;
 
public class Main {
	public static void main(String[] args) throws IOException {
    
		BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
		StringBuilder builder = new StringBuilder();
        
		int N = Integer.parseInt(reader.readLine());
		int[] arr = new int[N];
        
		for(int i = 0; i < N; i++){
			arr[i] = Integer.parseInt(reader.readLine());
		}
        
		Arrays.sort(arr);
        
		for(int i = 0; i < N; i++){
			builder.append(arr[i]).append('\n');
		}
 
		System.out.println(builder);
	}
}