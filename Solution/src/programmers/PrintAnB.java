package programmers;

import java.util.Scanner;

public class PrintAnB {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        //System.out.printf("a = %d\nb = %d",a,b);
        
        sc.close();
    }
}
