package aplication;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[][] mat = new int[n][n];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		System.out.println();
		System.out.println("Main diagonal:");
		for (int i = 0; i < mat.length; i++) {
			System.out.println(mat[i][i]);
		}
		System.out.println();

		int negative = 0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] < 0) {
					negative++;
				}
			}
		}

		System.out.println("Negative numbers: " + negative);

		sc.close();

	}

}
