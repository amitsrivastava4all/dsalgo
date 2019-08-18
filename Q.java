
public class Q {

	public static void main(String[] args) {
		String msg = "Hello";
		
		int ascii [] = new int[255];
		for(int i = 0 ; i<msg.length(); i++) {
			char single = msg.charAt(i);
			int index = single;
			ascii[index] = ++ascii[index];
		}
		int max = ascii[0];
		char temp = '\0';
		for(int i = 0 ; i<ascii.length; i++) {
			if(ascii[i]>max) {
				max = ascii[i];
				temp = (char)i;
			}
		}
		System.out.println("Max Frequency "+max+" Char "+temp);
		

	}

}
