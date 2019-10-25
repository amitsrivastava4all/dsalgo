
public class FindElemetsinInfiniteArray05 {
	
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
	  int arr [] = {10,20,30,40,50,60,70,80,90,100,110,120,130,140,150,160,170,180,190,200};
	  int search= 200;
	  if(arr[0]==search) {
		  System.out.println("Element Found at 0");
		  return;
	  }
	  int index = 1;
	  while(index<arr.length-1 && arr[index]<search) {
		  index = index * 2; // double the index
	  }
	  if(index<arr.length-1 && arr[index]==search) {
		  System.out.println("Found at "+index);
		  return ;
		  
	  }
	  else if(index<arr.length-1){
		  int finalIndex=  binarySearch(arr, index/2, index, search);
		  String result = finalIndex>=0?"Found at "+index:"Not Found";
		  System.out.println(result);
	  }
	  else {
		  System.out.println("Index "+index);
		  System.out.println("Not Found");
	  }

	}

}
