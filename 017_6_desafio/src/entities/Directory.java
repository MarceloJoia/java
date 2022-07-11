package entities;

import java.io.File;

public class Directory {

	final String DIR_PATH = "C:\\ws-sts\\Java\\017_6_desafio";
	private String name;
	
	public Directory() {}

	public Directory(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String dirPath() {
		String dir = DIR_PATH + "\\" + name;
		
		File directory = new File(dir);
		
		if(!directory.exists()) {
			directory.mkdir();
		}
		return directory.toString();
	}
	
	public String toString() {
		return dirPath();
		
	}
}
