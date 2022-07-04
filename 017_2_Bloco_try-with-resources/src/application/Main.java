package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		
		String path = "C:\\ws-sts\\Java\\017_2_Bloco_try-with-resources\\file.txt";
		
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
			
			String line = bufferedReader.readLine();
			
			while(line != null) {
				System.out.println(line);
				line = bufferedReader.readLine();
			}	
		}
		catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
