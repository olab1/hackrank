package rxia.missing.numbers;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

public class Solution {

	static Scanner scanner = new Scanner(System.in);
	
	  
	
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	long[] A =  getArray();
    	long[] B = getArray();
    	 
         Map<Long,Integer> aMap = new LinkedHashMap<Long, Integer>();
         Map<Long,Integer> bMap = new LinkedHashMap<Long, Integer>();
       //Close
     	scanner.close();
         for(Long a: A){
        	 if(!aMap.containsKey(a)){
        		 aMap.put(a, 1);
        	 }else{
        		 int total = aMap.get(a);
        		 total++;
        		 aMap.put(a, total);
        	 }
         }
         
         for(Long b: B){
        	 if(!bMap.containsKey(b)){
        		 bMap.put(b, 1);
        	 }else{
        		 int total = bMap.get(b);
        		 total++;
        		 bMap.put(b, total);
        	 }
         }
         
         StringBuilder sb = new StringBuilder();
         for(long x:new TreeSet<Long>(aMap.keySet())){
        	 int aTime = aMap.get(x);
        	 int bTime = bMap.get(x);
        	 if(aTime !=bTime){
        		 sb.append(x+" ");
        	 }
         }
         System.out.println(sb.toString().trim());
    	
    }
    
    
    private static long getLength(){
    	return scanner.nextLong();
    }
    
    private static long[] getArray(){
    	long length = getLength();
    	long[] Q = new long[(int) length];
    	for(int i = 0; i <Q.length; i++){
    		Q[i] =scanner.nextLong();
    	}
    	return Q;
    } 
}