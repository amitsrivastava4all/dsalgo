
public class BinarySearch02 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		int search = 9;
		int low = 0;
		int high = arr.length-1;
		
		while(low<high) {
			int mid = (low + high) / 2;
			if (arr[mid] == search) {
                System.out.println("Element Found ");
                return;
			}
			if (arr[mid] < search) 
                low = mid + 1; 
  
            
            else
                high = mid - 1;
		}
		System.out.println("Not Found");

	}

}
