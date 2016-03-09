package rxia.missing.max.number;

import java.util.*;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

public class Solution {

	static Scanner scanner = new Scanner(System.in);
	
	  
	
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
     	long length = 5;
    	long modulo = 7;
    	long[] Q = new long[]{3,3,9,9,5};
//    	for(int i = 0; i <Q.length; i++){
//    		Q[i] =scanner.nextLong();
//    	}
//    	
    	//long[] A =  getArray();
    	
//    	 
    	  int inc = 1;
    	  while(modulo>0){
    		  long total = 0;
    		  for(int i=0; i<Q.length-1;i=i+inc){
    			  total += Q[i]+Q[i+1];
    			  if(total % modulo == modulo-1 ){
    				  System.out.println( modulo-1);
    				  return;
    			  }
    		  }
    		  
    		  modulo--;
    	  }
    	
    //	  System.out.println(BTSum(0,Q,modulo));
    }//
    
    
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
     static long result = -1L;
     static ArrayList<Long> list = new ArrayList<Long>();
//     public static long BTSum(int n, long[] numbers, long modulo) {
//        if (n == numbers.length) {
//        	long total = 0;
//            for (Long integer : list) {
//                total += integer;
//                System.out.print(integer+" ");
//            }
//             System.out.println("***********"+(total % modulo)+"********************");
//            list.removeAll(list);
//            result = total % modulo > result? total % modulo: result;
//            //return result;
//        } else {
//            for (int i = n; i < numbers.length; i++) {
//                if (i == numbers.length - 1) {
//                    list.add(numbers[i]);
//                    BTSum(i + 1, numbers,modulo);
//                } else {
//                    list.add(numbers[i]);
//                    for (int j = i+1; j < numbers.length; j++)
//                    BTSum(j, numbers,modulo);
//                }
//            }
//        }
//        return result;
//    }
}