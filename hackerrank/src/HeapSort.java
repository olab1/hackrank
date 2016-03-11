import java.util.Arrays;

public class HeapSort {

	private static int[] data = Utils.nums;

	public static void main(String[] args) {
		HeapSort bs = new HeapSort();
		System.out.println(Arrays.toString(data));
		bs.sort();
		System.out.println(Arrays.toString(data));
	}

	public void sort() {
		int n = data.length - 1;
		for (int i = n / 2; i >= 0; i--) {
			maxHeap(data, i, n);
		}
		
		for(int i=n;i>0;i-- ){
			Utils.swap(data, 0,i);
			n= n-1;
			maxHeap(data, 0, n);
		}
	}

	private void maxHeap(int[] data, int current, int n) {
		
		int max = current;
		int left = 2 * current;
		int right = 2* current+1;
		
		if(left<=n && data[left] >data[max]){
			max = left;
		}
		
		if(right<=n && data[right] >data[max]){
			max = right;
		}
		
		Utils.swap(data, current, max);
		if(max != current){
			maxHeap(data,max,n);
		}
	
	}

}
