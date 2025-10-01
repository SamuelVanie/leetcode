import java.util.Arrays;
import org.junit.Test;
import org.junit.Assert;


/**
{@summary}
Bubble sort is an algorithm that is not really efficient
It just loop through the elements of the unsorted part of the array, then swap the elements if the order is not respected
If no swapped where made in the unsorted part, this mean that the array is sorted so we could just stopped the algorithm
It's not really efficient because there's nested loops O(n^2)
 */
class Bubble {
	static void swap(int[] arr, int indx1, int indx2) {
		arr[indx1] = arr[indx1] - arr[indx2];
		arr[indx2] = arr[indx1] + arr[indx2];
		arr[indx1] = arr[indx2] - arr[indx1];
	}

	static void sort(int[] arr) {
		boolean swapped;
		for (var i = 0; i < arr.length - 1; i++) {
			swapped = false;
			for (var j = 0; j < arr.length - i - 1; j++) {
				if (arr[j + 1] < arr[j]) {
					swap(arr, j + 1, j);
					swapped = true;
				}
			}
			if (!swapped) {
				break;
			}
		}
	}
}

public class BubbleSort {

	int[] unSorted = { 3, 4, 1, 10, 8 };

	@Test
	public void bubbleSortWorksOnNormalArray() {
		int[] expected = { 1, 3, 4, 8, 10 };
		Bubble.sort(unSorted);
		Assert.assertTrue(Arrays.equals(expected, unSorted));
	}
}
