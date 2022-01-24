package test;


import java.util.ArrayList;
import java.util.List;

public class test {

	public static void main(String[] args) {
		
	List<String> a = new ArrayList();
	
	a.add("hello");
	
	String [] b = new String[10];
	
	b[2]= "hello";
	
	System.out.println(b.length);
	System.out.println(a.size());
	
	System.out.println(b[3]);
	System.out.println(a.get(2));
	
	

	}

}
