package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {

		String[] lines = new String[] { "Good morning", "Good afternoon", "Good night" };

		String path = "C:\\ws-sts\\Java\\017_3_FileWriter_e_BufferedWriter\\file.txt";

		try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path, true))) {
			
			for (String line : lines) {
				bufferedWriter.write(line);
				bufferedWriter.newLine();//FAZ UMA QUEBRA DE LINHA
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
