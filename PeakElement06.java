
public class PeakElement06 {
	
	static int searchPeak(int arr[], int low, int high, int n) 
    { 
        // for bigger array size
        int mid = low + (high - low)/2;  /* (low + high)/2 */
  
        
        if ((mid == 0 || arr[mid-1] <= arr[mid]) && (mid == n-1 || 
             arr[mid+1] <= arr[mid])) 
            return arr[mid]; 
  
      
        else if (mid > 0 && arr[mid-1] > arr[mid]) 
            return searchPeak(arr, low, (mid -1), n); 
  
       
        else return searchPeak(arr, (mid + 1), high, n); 
    } 
  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,20,130,15,5,22,100,190};
		System.out.println(searchPeak(arr, 0, arr.length-1, arr.length));
		

	}

}
