public class Quick {
	
	/**
	 * An implementation of the QuickSort algorithm based on pseudocode by geeksforgeeks.org
	 * @param in The array to be sorted
	 * @see Quick#sortIP(Integer[])
	 */
	public static Integer[] sort(Integer[] in) {
		Integer[] out = in.clone();
		sort(out, 0, out.length-1);
		return out;
	}
	
	/**
	 * An in-place implementation of the QuickSort algorithm
	 * @see Quick#sort(Integer[])
	 */
	public static void sortIP(Integer[] in) {
		sort(in, 0, in.length-1);
	}
	
	private static void sort(Integer[] in, int start, int stop) {
		if(start < stop) {
			int partitionIndex = partition(in, start, stop);
			sort(in, start, partitionIndex-1);
			sort(in, partitionIndex+1, stop);
		}
	}
	
	private static int partition(Integer[] in, int start, int stop){
		int pivot = in[stop];
		int i = (start - 1);
		
		for(int j = start; j <= stop - 1; j++){
			if(in[j] < pivot) {
				i++;
				int tmp = in[i];
				in[i] = in[j];
				in[j] = tmp;
				
			}
		}
		int tmp = in[i+1];
		in[i+1] = in[stop];
		in[stop] = tmp;
		return (i+1);
	}
	
}
