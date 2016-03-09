import java.util.*;


public class BucketSort {
	public static void main(String[] args) {
		BucketSort bs = new BucketSort();
		bs.sort();
	}
	
	private int[] data = new int[]
		 {3,4,5,6,7,5,4,3,2,10,5,4,3,2,1};
	
	public void sort(){
		Utils.print();
		int max =10;
		int[] bucket = new int[max+1];
 		for(int i=0; i<data.length; i++){
			int index = data[i];
			int value = bucket[index];
			bucket[index] = value +1 ;
		}
		System.out.println(  Arrays.toString(bucket));
		
		int pos = 0;
		for(int i=0; i<bucket.length;i++){
			for(int j=0; j<bucket[i];j++){
				data[pos++] = i;
				//System.out.println(data[pos]);
			}
		}
		System.out.println( Arrays.toString(data));
		Utils.print();
	}
}
