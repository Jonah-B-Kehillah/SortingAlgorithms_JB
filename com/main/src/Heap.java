public class Heap {
	
	/**
	 * A not-in-place implementation of the HeapSort algorithm
	 * @return A sorted copy of the input array
	 * @see Heap#sort(Integer[])
	 */
	public static Integer[] sortNIP(Integer[] in) {
		Integer[] out = in.clone();
		sort(out);
		return out;
	}
	
	/**
	 * An in-place version of the HeapSort algorithm, based on example code by geeksforgeeks.org
	 * @param in The array to be sorted
	 */
	public static void sort(Integer[] in) {
		int N = in.length;
		for(int i = (N/2)-1; i>=0; i--) {
			heapify(in, N, i);
		}
		for(int i = N-1; i > 0; i--) {
			int tmp = in[0];
			in[0] = in[i];
			in[i] = tmp;
			heapify(in, i, 0);
		}
	}
	
	private static void heapify(Integer[] in, int N, int i) { // based on example code by geeksforgeeks.org
		int largest = i;
		int left = 2 * i + 1;
		int right= 2 * i + 2;
		
		if(left < N && in[left] > in[largest]) {
			largest = left;
		}
		if(right< N && in[right]> in[largest]) {
			largest = right;
		}
		if(largest != i) {
			int tmp = in[i];
			in[i] = in[largest];
			in[largest] = tmp;
			heapify(in, N, largest);
		}
		
	}
	
}
