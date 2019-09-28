import java.util.Arrays;

public class AnagramString09 {
	
	// sort and compare
	static void approach1(String str1, String str2) {
		if(str1.length()!=str2.length()) {
			System.out.println("Not Anagram String");
			return;
		}
		char arr [] = str1.toCharArray();
		char arr2[] = str2.toCharArray();
		Arrays.sort(arr);
		Arrays.sort(arr2);
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]!=arr2[i]) {
				System.out.println("Not Anagram String");
				return ;
			}
		}
		System.out.println("Anagram String");
	}
	
	// Use Hashing
	static void approach2(String str1, String str2) {
		if(str1.length()!=str2.length()) {
			System.out.println("Not Anagram String");
			return;
		}
		char arr [] = str1.toCharArray();
		char arr2[] = str2.toCharArray();
		int hash1 [] = new int[255];
		int hash2[] = new int[255];
		for(int i = 0 ; i<arr.length; i++) {
			++hash1[arr[i]];
		}
		for(int i = 0 ; i<arr2.length; i++) {
			++hash2[arr2[i]];
		}
		for(int i = 0; i<hash1.length; i++) {
			if(hash1[i]!=hash2[i]) {
				System.out.println("Not Anagram String");
				return ;
			}
		}
		System.out.println("Anagram String");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		approach1("listen", "silent");
		approach1("hello", "holla");
		approach2("listen", "silent");
		approach2("hello", "holla");
		
		

	}

}
