package application;

import java.io.File;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o caminho do arquivo: ");
		String strPath  = sc.nextLine();
		File path = new File(strPath);
		
		System.out.println("getPath: " + path.getPath());
		System.out.println("getParent: " + path.getParent());
		System.out.println("getName: " + path.getName());

		sc.close();
	}
}
