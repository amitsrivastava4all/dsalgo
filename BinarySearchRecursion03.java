
public class BinarySearchRecursion03 {

	static int binarySearch (int arr[], int low, int high, int search) {
		
		 int  mid = (low + high) /2 ;
		 if(low>high) {
			 return -1;
		 }
		 if(arr[mid]==search) {
			 return mid;
		 }
		 if(arr[mid]>search) {
			 return binarySearch(arr, low, mid-1, search);
		 }
		 else {
			 return binarySearch(arr, mid+1, high, search);
		 }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] = {10,20,30,40,50,60,70,80,90,100};
		String result = binarySearch(arr, 0, arr.length-1, 90)>=0?"Found":"Not Found";
		System.out.println(result);

	}

}
