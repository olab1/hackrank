package test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestList {
	
	public static void main(String[] args) {
		
		 List<Integer> list = 
				new ArrayList<Integer>();
				//new LinkedList<Integer>();
		for(int i=0; i<40000;i++){
			list.add(i);
		}
		long start = System.currentTimeMillis();
		
//		for(int i=0; i<40000;i++){
//			list.add(0,i);
//		}
		
//		for(int i=0; i<list.size();i++){
//			System.out.println(list.get(i));
//		}
		
		for(int x: list){
			System.out.println(x);
		}
		
		long end = System.currentTimeMillis();
		System.out.println(end-start);
	}
}
