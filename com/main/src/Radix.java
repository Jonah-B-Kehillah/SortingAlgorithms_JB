import java.util.Arrays;
import java.util.Collections;

public class Radix {
	/**
	 * A not-in-place implementation of the RadixSort algorithm
	 * @return A sorted copy of array {@code in}
	 * @see Radix#sort(Integer[] in)
	 */
	public static Integer[] sortNIP(Integer[] in) {
		Integer[] out = in.clone();
		sort(out);
		return out;
	}
	
	/**
	 * An in-place implementation of the RadixSort algorithm, based on example code by geeksforgeeks.org
	 * @param in The array to sort
	 * @see Radix#sortNIP(Integer[])
	 */
	public static void sort(Integer[] in) {
		int max = Collections.max(Arrays.asList(in));
		for(int exp = 1; max/exp > 0; exp*=10) countSort(in, in.length, exp);
	}
	
	@SuppressWarnings("ManualArrayCopy")
	private static void countSort(Integer[] in, int N, int exp) {
		Integer[] output = new Integer[N];
		Integer[] count = new Integer[10];
		Arrays.fill(count, 0);
		
		for(int i = 0; i < N ; i++) count[(in[i]/exp)%10]++;
		for(int i = 1; i < 10; i++) count[i] += count[i-1];
		for(int i=N-1; i >= 0; i--) {
			output[count[(in[i]/exp)%10]-1] = in[i];
			count[(in[i]/exp)%10] -= 1;
		}
		for(int i = 0; i < N ; i++) in[i] = output[i];
	}
	
}
