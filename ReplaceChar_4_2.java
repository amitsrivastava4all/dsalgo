
public class ReplaceChar_4_2 {
	static String replaceChar(char str[], char find, char replace) {
		if(str.length==0) {
			return "";
		}
		String output = "";
		if(str[0]==find) {
			str[0] = replace;
			
		}
		output = new String(str);
		
		return  str[0] + replaceChar(output.substring(1).toCharArray(), find, replace);
		
	}
	public static void main(String[] args) {
		System.out.println(replaceChar("Hello".toCharArray(), 'l', 'w'));

	}

}
