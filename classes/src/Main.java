import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter three numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int higher = max(a, b, c);

		sowResult(higher);

		sc.close();
	}

	private static void sowResult(int value) {
		System.out.println("Higher: " + value);
	}

	private static int max(int x, int y, int z) {
		
		int maior;
		if (x > y && x > z) {
			maior = x;
		} else if (y > z) {
			maior = y;
		} else {
			maior = z;
		}
		
		return maior;
	}
	

}
