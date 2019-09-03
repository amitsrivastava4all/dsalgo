
public class PalindromString03 {
	static boolean palindrome(String str, int start , int end) {
		if(start>end) { // case if string length is even
			return true;
		}
		if(start==end) {  // Case if string length is odd
			return true;
		}
		if(str.charAt(start)!=str.charAt(end)) {
			return false;
		}
		return palindrome(str, ++start, --end);
		
	}
public static void main(String[] args) {
	String str = "nitin";
	String result = palindrome(str, 0, str.length()-1)?"Palindrome":"Not ";
	System.out.println(result);
}	

}
