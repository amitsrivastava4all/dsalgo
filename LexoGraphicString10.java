
public class LexoGraphicString10 {
	
	static void swap(char arr[], int left, int right) {
		char temp = '\0';
		temp = arr[left];
		arr[left]= arr[right];
		arr[right] = temp;
	}
	static void lexo(char[] str, int left, int right) {
		
		if(str.length==0) {
			System.out.println("");
			return ;
		}
		if(str.length==1) {
			System.out.println( new String(str));
			return;
		}
		if(left == right) {
			System.out.println(new String(str));
			return;
		}
		
		for(int i = 0; i<=right; i++) {
			swap(str, left,i );
			lexo(str,left+1,right);
			swap(str, left,i );
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc";
		lexo(str.toCharArray(),0,str.length()-1);
		
	}

}
