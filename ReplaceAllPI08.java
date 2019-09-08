
public class ReplaceAllPI08 {
	//static String s = "2 * pi + 3 * pi = 5 * pi";
	static String s = "pippppiiiipi";
	static String replaceAllPI(int i) {
        if(i == s.length()) return "";
        if(i+1 < s.length() && s.charAt(i) == 'p' && s.charAt(i+1) == 'i') {
            return "3.14" + replaceAllPI(i+2);
        } else {
            return s.charAt(i) + replaceAllPI(i+1);
        }
}
	public static void main(String[] args) {
		String result = replaceAllPI(0);
		System.out.println(result);

	}

}
