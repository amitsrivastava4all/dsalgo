
public class FindTheMaxSumOfConsecutiveElements013 {

	public static int total(int arr[], int n, int k) {
		 if (n < k) 
	        { 
	           System.out.println("Invalid"); 
	           return -1; 
	        } 
	       
	        // Compute sum of first window of size k 
	        int res = 0; 
	        for (int i=0; i<k; i++) 
	           res += arr[i]; 
	       
	        // Compute sums of remaining windows by 
	        // removing first element of previous 
	        // window and adding last element of  
	        // current window. 
	        int curr_sum = res; 
	        for (int i=k; i<n; i++) 
	        { 
	           curr_sum += arr[i] - arr[i-k]; 
	           res = Math.max(res, curr_sum); 
	        } 
	       
	        return res;
	}
	public static void main(String[] args) {
		int arr[] = {1,2,3,10,5,6,1,2,3};
		
        int k = 3; 
        int n = arr.length; 
        System.out.println(total(arr, n, k));
		

	}

}
