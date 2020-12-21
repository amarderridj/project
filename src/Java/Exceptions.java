package Java;

public class Exceptions {

	public static void main(String[] args) {
		
		
		try {
			String welcome="welcome!";
			char chars[]=welcome.toCharArray();
			char lastchar= chars[chars.length];
			System.out.println("The last charatcer of our array is "+lastchar);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("my code run without any issue");
	}

}
