package com.brainmentors;

class KeyValuePair<K,V>{
	K key;
	V value;
	public KeyValuePair(K key, V value) {
		this.key = key;
		this.value =value;
	}
	
}
class LinkedList<T>{
	LinkedList(T t){
		
	}
}
class HashMap<K,V>{
	int capacity=10;
	LinkedList<KeyValuePair> buckets [] ;
	
	HashMap(int capacity){
		buckets =(LinkedList<KeyValuePair>[]) new LinkedList[capacity];
	}
	private int hashFunction(K key) {
		int index = key.hashCode() % capacity;
		return index;
	}
	public void put(K key, V value) {
		int index = hashFunction(key);
		System.out.println("Index is "+index);
		if(buckets[index]==null) {
			KeyValuePair<String, Integer> keyValuePair = new KeyValuePair(key, value);
			buckets[index]= new LinkedList<KeyValuePair>(keyValuePair);
			System.out.println("Create a Linked List ");
		}
		else {
			System.out.println("Go inside the bucket , search the key in linkedlist");
		}
		
	}
}
public class HashingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// HashMap<String, Integer> phoneMap= new HashMap<>();
		HashMap<String, Integer> map= new HashMap<>(10);
		map.put("amit",21);
		map.put("amit",22);
	}

}
