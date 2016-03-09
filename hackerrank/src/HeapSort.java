import java.util.Arrays;

public class HeapSort {

	public static void maxheap(int[] a, int current, int n) {
		int largest;
		int left = 2 * current;
		int right = 2 * current + 1;
		if (left <= n && a[left] > a[current]) {
			largest = left;
		} else {
			largest = current;
		}

		if (right <= n && a[right] > a[largest]) {
			largest = right;
		}
		
		
		System.out.println(Arrays.toString(a));
		if (largest != current) {
			exchange(a, current, largest);
			maxheap(a, largest, n);
		}
		
		System.out.println("done "+current);

	} 

	public static void main(String[] args) {
		int[] a = { 4, 1, 3, 2, 9, 16, 10, 14, 8, 7 };
		int n = a.length - 1;
		for (int i = n / 2; i >= 0; i--) {
			maxheap(a, i, n);
		}

		//System.out.println("done "+Arrays.toString(a));
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
