import java.util.Arrays;

public class HeapSortTest {

	public static void maxheap(int[] a, int current, int n) {
		int max = current;
		
		int left = 2 * current;
		int right = 2 * current + 1;
		
		if (left <= n && a[left] > a[max]) {
			max = left;
		} 

		if (right <= n && a[right] > a[max]) {
			max = right;
		}
		
		
		//System.out.println(Arrays.toString(a));
		exchange(a, current, max);
		if (max != current) {
			maxheap(a, max, n);
		}
		
		//System.out.println("done "+current);

	} 

	public static void main(String[] args) {
		int[] a = Utils.nums; 
				
		a = new int[]{ 4, 1, 3, 2, 9, 16, 10, 14, 8, 7 };
		int n = a.length - 1;
		for (int i = n / 2; i >= 0; i--) {
			maxheap(a, i, n);
		}

		System.out.println("done "+Arrays.toString(a));
		for (int i = n; i > 0; i--) {
			exchange(a, 0, i);
			n = n - 1;
			maxheap(a, 0, n);
		}
		System.out.println(Arrays.toString(a));
	}

	public static void exchange(int[] a, int i, int j) {
		int t = a[i];
		a[i] = a[j];
		a[j] = t;
	}

}
