package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

import entities.Directory;
import entities.Product;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Directory dir = new Directory();

		System.out.print("Criar diretório(digite_nome): ");
		String dirName = sc.nextLine();
		dir.setName(dirName);
		// System.out.println(dir);

		System.out.print("Nome do artivo (exp.: lista_pedido): ");
		String fileName = sc.next();
		String path = dir + "\\" + fileName + ".csv";

		System.out.print("Quantos produtos deseja cadastrar? ");
		int n = sc.nextInt();
		Product[] products = new Product[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();

			System.out.print("Preço: ");
			Double price = sc.nextDouble();

			System.out.print("Quantidade: ");
			int quantity = sc.nextInt();

			products[i] = new Product(name, price, quantity);
		}

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {

			for (Product product : products) {
				bw.write(product.toString());
				bw.newLine();
				// System.out.println(product);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}


		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			while (line != null) {
				String s = line.toString();
				String[] vect = s.split(",");
				String name = vect[0];
				Double price = Double.parseDouble(vect[1]);
				Double quantity = Double.parseDouble(vect[2]);
				Double result = price * quantity;
				System.out.println(name + ", " +result);
				
				line = br.readLine();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

		sc.close();
	}
}
