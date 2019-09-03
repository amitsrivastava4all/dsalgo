
public class ReverseAString02_1 {
	static String reverse(String str) {
		if(str.length()==1) {
			return String.valueOf(str.charAt(0));
		}
		return reverse(str.substring(1)) + str.charAt(0);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String result = reverse("hello");
		System.out.println(result);

	}

}
