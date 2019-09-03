
public class CountNumberOfZero07 {
	
	static int count(int num, int c) {
		if(num==0) {
			return c;
		}
		if(num%10==0) {
			c++;
		}
		return count(num/10,c);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = count(1007050204,0);
		System.out.println(result);

	}

}
