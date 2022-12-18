import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		
		// Validate functions
		Integer[] test = new Integer[] {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
		Integer[] correct = new Integer[]{1, 1, 2, 3, 3, 4, 5, 5, 5, 6, 9};
		
		if(Arrays.equals(Quick.sort(test), correct)) {
			System.out.println("QuickSort passed validation");
		} else {
			System.err.println("QuickSort failed validation");
		}
		if(Arrays.equals(Heap.sortNIP(test), correct)) {
			System.out.println("HeapSort passed validation");
		} else {
			System.err.println("HeapSort failed validation");
		}
		if(Arrays.equals(Radix.sortNIP(test), correct)) {
			System.out.println("RadixSort passed validation\n");
		} else {
			System.err.println("RadixSort failed validation\n");
		}
		
		test(0, TestingArrays.LARGE_1);
		test(0, TestingArrays.LARGE_2);
		test(0, TestingArrays.LARGE_3);
		test(0, TestingArrays.MEDIUM_1);
		test(0, TestingArrays.MEDIUM_2);
		test(0, TestingArrays.MEDIUM_3);
		
		test(1, TestingArrays.LARGE_1);
		test(1, TestingArrays.LARGE_2);
		test(1, TestingArrays.LARGE_3);
		test(1, TestingArrays.MEDIUM_1);
		test(1, TestingArrays.MEDIUM_2);
		test(1, TestingArrays.MEDIUM_3);
		
		test(2, TestingArrays.LARGE_1);
		test(2, TestingArrays.LARGE_2);
		test(2, TestingArrays.LARGE_3);
		test(2, TestingArrays.MEDIUM_1);
		test(2, TestingArrays.MEDIUM_2);
		test(2, TestingArrays.MEDIUM_3);
		
	}
	
	private static void test (int i, Integer[] toTest) {
		long start, end;
		switch (i) {
			case 0:
				start = System.nanoTime();
				Quick.sort(toTest);
				end = System.nanoTime();
				System.out.printf("Quicksort took %sns to sort%n", end-start);
				break;
			case 1:
				start = System.nanoTime();
				Heap.sortNIP(toTest);
				end = System.nanoTime();
				System.out.printf("Heapsort took %sns to sort%n", end-start);
				break;
			case 2:
				start = System.nanoTime();
				Radix.sortNIP(toTest);
				end = System.nanoTime();
				System.out.printf("Radixsort took %sns to sort%n", end-start);
				break;
		}
	}
	
}
