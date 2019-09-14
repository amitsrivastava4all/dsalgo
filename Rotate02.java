
public class Rotate02 {
	
	/*
	 * int arr [] = {90, 1, 20,2, 4, 6,100};
	 * int rotateTimes = 2;
	 * {20,2,4,6,100,90,1}
	 */
	
	static void reverse(int arr[], int start, int end){
		int temp = 0;
		while(start<end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
	static void print(int arr[]) {
		for(int i: arr) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int arr [] = {90, 1, 20,2, 4, 6,100};
		int rotateTimes = 2;
		reverse(arr, 0,rotateTimes-1);
		//1 90 20 2 4 6 100 
		print(arr);
		reverse(arr, rotateTimes, arr.length-1);
		// 1 90 100 6 4 2 20 
		print(arr);
		reverse(arr, 0, arr.length-1);
		print(arr);
		

	}

}
