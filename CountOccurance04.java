
public class CountOccurance04 {

	static int findFirstOccurance (int arr[], int low, int high, int search) {
		
		 int  mid = (low + high) /2 ;
		 if(low>high) {
			 return -1;
		 }
		 if((arr[mid]==search) && (mid==0 || arr[mid-1]!=search)) {
			 return mid;
		 }
		 if(arr[mid]>=search) {
			 return findFirstOccurance(arr, low, mid-1, search);
		 }
		 else {
			 return findFirstOccurance(arr, mid+1, high, search);
		 }
	}
	static int findLastOccurance (int arr[], int low, int high, int search, int sizeOfArray) {
		
		 int  mid = (low + high) /2 ;
		 if(low>high) {
			 return -1;
		 }
		 if((arr[mid]==search) && (mid==(sizeOfArray-1) || arr[mid-1]!=search)) {
			 return mid;
		 }
		 if(arr[mid]>search) {
			 return findLastOccurance(arr, low, mid-1, search,sizeOfArray);
		 }
		 else {
			 return findLastOccurance(arr, mid+1, high, search,sizeOfArray);
		 }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] = {10,20,30,30,30,60,70,70,90,100};
		int firstOccurance =  findFirstOccurance(arr, 0, arr.length-1, 30);
		int lastOccurance =  findLastOccurance(arr, 0, arr.length-1, 30,arr.length);
		System.out.println(firstOccurance);
		System.out.println(lastOccurance);
		if(firstOccurance>=0 && lastOccurance>=0) {
			System.out.println((lastOccurance-firstOccurance)+1);
		}

	}

}
