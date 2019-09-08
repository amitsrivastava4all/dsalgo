
public class StringToInt14 {
	static int strToInt(String str) {
		if(str.length()==1) {
			return str.charAt(0) - '0';
		}
		int result = strToInt(str.substring(1));
		double firstDigit = str.charAt(0) - '0';
		double finalNumber = firstDigit * Math.pow(10, str.length()-1) 
				+ result;
		return (int) finalNumber;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println('9'-'0'); // Convert Char to Digit
		int r = strToInt("1234");
		System.out.println(r);

	}

}
