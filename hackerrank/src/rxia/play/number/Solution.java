package rxia.play.number;

import java.util.*;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

public class Solution {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		long N = 3;
		long[] base = {-1,2,-3};//getArray(N);
		long Q = 3;
		long[] array = {1,-2,3};
 
		long[] x = new long[(int) ((N+1)*Q*2)];
		for(int j=0,i=0; i<x.length;i++){
		   if(i % 2 ==0 && i< N*2){
			   
			   if(j == base.length){
				   j =0;
			   }
			   
			   x[i] = base[j++];
		   }
		}

		//boolean flag = false;
		for(int j=0,i=0; i<x.length;i++){
			
			
			
			if(i%2==1){
				if(j>=array.length  ){
					x[i] = 0;
				}else{
					x[i] = array[j];
				}
			}
			
			if( (i+1) % 6== 0 ){
				j++;
			}
		}
		
		
		for(int i=0; i<x.length-1;i=i+2){
			
// 			if( i % (N*2)== 0 && i!=0 ){
//				System.out.println(total);
//				total = 0;
//			}
 			 if(i+N*2 <x.length)
 			    x[(int) (i+N*2)] = x[i]+x[i+1];
 			//total += Math.abs(x[i]+x[i+1]);
 		}
		
		long total = 0;
		for(int i=(int) (N*2); i<x.length+1;i=i+2){
 			
			if(i % (N*2) ==0 && i !=(int) (N*2)){
			 	System.out.println(total);
 				total = 0;
 				
 				if(i==x.length){
 					break;
 				}
			}
			
			total += Math.abs(x[i]);
 		}
		
		System.out.println(Arrays.toString(x));
	}

	private static long getLength() {
		return scanner.nextLong();
	}

	private static long[] getArray() {
		long length = getLength();
		long[] Q = new long[(int) length];
		for (int i = 0; i < Q.length; i++) {
			Q[i] = scanner.nextLong();
		}
		return Q;
	}

	private static long[] getArray(long length) {
		long[] Q = new long[(int) length];
		for (int i = 0; i < Q.length; i++) {
			Q[i] = scanner.nextLong();
		}
		return Q;
	}

}