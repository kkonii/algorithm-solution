package beakjune;

import java.util.Arrays;
import java.util.Scanner;

public class beakjune_3003 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] chess= {1,1,2,2,2,8};
		
		int[] input = new int[6];
		
		for(int i=0;i<chess.length;i++) {
			input[i] = sc.nextInt();
		}
		
		int[] newChess = new int[6];
		
		for (int i=0;i<newChess.length;i++) {
			newChess[i] = chess[i] - input[i];
		}
		
		System.out.println(Arrays.toString(newChess));
	}
}