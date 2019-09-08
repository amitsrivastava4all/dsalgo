
public class RemoveChar04_1 {
	
	static String removeChar(String str, char removeChar) {
		if(str.length()==0) {
			return "";
		}
		String output = "";
		if(str.charAt(0)!=removeChar) {
			output +=str.charAt(0);
		}
		return output + removeChar(str.substring(1),removeChar);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String result = removeChar("Hello",'l');
		System.out.println(result);
		

	}

}
