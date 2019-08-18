
public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String a = "datastructure";
		char b [] = "datastructure".toCharArray();
//		int i = 0;
//		int j = b.length-1;
		char temp = '\0';
		for(int i = 0,j = b.length-1; i<j; i++,j--) {
			temp = b[i];
			b[i] = b[j];
			b[j] = temp;
		}
//		while(i<j) {
//			temp = b[i];
//			b[i] = b[j];
//			b[j] = temp;
//			i++;
//			j--;
//		}
		System.out.println(new String(b));
//		for(int i = a.length()-1 ; i>=0; i--) {
//			char temp = a.charAt(i);
//			System.out.print(temp);
//		}
		

	}

}
