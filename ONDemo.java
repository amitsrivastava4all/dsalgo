
public class ONDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int org [] = {10,20 , 30, 10,40};
		int max = org[0];
		for(int i = 0 ; i<org.length;i++) {
			if(org[i]>max) {
				max = org[i];
			}
		}
		int x [] = new int[max+1];
		for(int i = 0 ; i<org.length;i++) {
			x[org[i]]++;
		}
		max = 0;
		int j = 0;
		for(int i = 0 ; i<x.length;i++) {
			if(x[i]>max) {
				max = x[i];
				j = i;
			}
		}
		System.out.println("Duplicate is "+j+" Occur "+max);

	}

}
