package swaptwonumbers;

public class swaptwonumbers {

	public static void main(String[] args) {
		
		int first = 120 , second = 220;
		System.out.println("-- before swap --");
		System.out.println("first number = "+ first);
		System.out.println("second number = "+ second);
		float temporary = first;
		second = (int) temporary;
		System.out.println("-- after swap --");
		System.out.println("first number = "+ first);
		System.out.println("second number = "+ second);
		
		
	}
	
}
