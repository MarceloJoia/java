package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas linhas? ");
		int m = sc.nextInt();
		System.out.print("Quantas colunas? ");
		int n = sc.nextInt();

		Integer[][] mat = new Integer[m][n];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		System.out.println();
		System.out.print("Digite uma das possões: ");
		int x = sc.nextInt();
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == x) {
					System.out.print("\n");
					System.out.println("Positon " + mat[i][j]);

					System.out.print("\n");
					System.out.println("colunas adjacentes:");
					if (j > 0) {
						System.out.println("Left: " + mat[i][j - 1]);
					}

					if (j < mat[i].length - 1) {
						System.out.println("Right: " + mat[i][j + 1]);
					}

					if (i > 0) {
						System.out.println("Up: " + mat[i - 1][j]);
					}

					if (i < mat.length - 1) {
						System.out.println("Down: " + mat[i + 1][j]);
					}
				}
			}
		}

		sc.close();
	}
}
