package collection;

import java.util.List; 
import java.util.ArrayList;

public class GenericListMethods {

	public static void main(String[] args) {
		List <String> s = new ArrayList <String> (); 
		//add ()  ; 
		s.add("apple"); 
		s.add("orange"); 
		s.add("banana"); 
		s.add ("guava"); 
		s.add("kiwi"); 
		s.add("orange");
		System.out.println(s); 
		System.out.println(s.get(2)); 
	s.set(1, " watermelon "); 
		System.out.println(s);  
		System.out.println(s.indexOf("orange")); 
		System.out.println(s.lastIndexOf("guava"));  
		s.remove(" watermelon ");
		System.out.println(s); 
		System.out.println(s.contains("strawberry")); 
		System.out.println(s.isEmpty());
		System.out.println(s.size());
	}

}
