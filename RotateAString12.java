
public class RotateAString12 {

	static void reverse(char arr[], int start, int end){
		char temp = '\0';
		while(start<end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
	static void print(char arr[]) {
		for(char i: arr) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "HelloFriends";
		char arr [] = str.toCharArray();
		int noOfRotations = 3;
		print(arr);
		reverse(arr, 0,noOfRotations-1);
		
		print(arr);
		reverse(arr, noOfRotations, arr.length-1);
		
		print(arr);
		reverse(arr, 0, arr.length-1);
		print(arr);
		

	}

}
