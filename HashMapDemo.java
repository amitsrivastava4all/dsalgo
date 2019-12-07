import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<String, Integer> phoneMap= new HashMap<>();
		phoneMap.put("delhi",12);
		phoneMap.put("mumbai",22);
		System.out.println(phoneMap.get("delhi"));
		
		HashMap<String,java.util.LinkedList<String>> lib = new HashMap<>();
		java.util.LinkedList<String> books = new java.util.LinkedList<>();
		books.add("let us c");
		books.add("head first java");
		lib.put("it", books);
		System.out.println(lib);
		java.util.LinkedList<String> books2 = new java.util.LinkedList<>();
		books2.add("let us c++");
		books2.add("head first sql");
		lib.put("it", books2);
		System.out.println(lib);
		String w = "TIM";
		System.out.println(w.hashCode()%5);

	}

}
