
public class SumOfDigit04 {

	static int sumOfDigit(int n, int sum) {
		if(n==0) {
			return sum;
		}
		
		sum +=n%10;
		n = n /10;
		return sumOfDigit(n, sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = sumOfDigit(123456,0);
		System.out.println(result);
		

	}

}
