import java.util.Scanner;

public class Main {
	private static final Integer QUARTER = 25;
	private static final Integer DIME = 10;
	private static  final Integer NICKEL = 5;
	private static final Integer PENNY = 1;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Integer T = sc.nextInt();
		
		for(int i=0;i<T;i++) {
			Integer money = sc.nextInt();
			
			Integer quarter = money / QUARTER;
			money %= QUARTER;
			
			Integer dime = money / DIME;
			money %= DIME;
			
			Integer nickel = money / NICKEL;
			money %= NICKEL;
			
			Integer penny = money / PENNY;
			
			System.out.println(quarter + " " + dime + " " + nickel + " " + penny);
		}
		
		sc.close();
	}
}