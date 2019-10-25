
public class FindTheFirstOccuranceOFElement03 {



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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] = {10,20,30,30,30,60,70,70,90,100};
		int index =  findFirstOccurance(arr, 0, arr.length-1, 30);
		String result =index>=0?"Found First Occurance "+index:"Not Found";
		System.out.println(result);

	}



	

}
