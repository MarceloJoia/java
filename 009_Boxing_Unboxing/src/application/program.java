package application;

public class program {

	public static void main(String[] args) {

		int x = 20;
		
		Object obj = x;
		
		System.out.println(obj);
		
		int y = (Integer) obj;
		
		System.out.println(y);

	}

}
