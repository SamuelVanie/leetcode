import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import org.junit.Test;
import org.junit.Assert;

/* 400_000 */
class Insertion {
    /**
    This sorting algorithm has a complexity of O(n^2)
    How it works :
    - Starts from the second element of the list
    - Compare that element to the ones at left (the sorted list)
    - If one element at left is greater than toInsert (ascending order)
    - create space for toInsert by moving the elements to the right
    - Add the element to the position left
     */
    static void sort(List<Integer> arr) {
	var k = 0;
	for(var j = 1; j < arr.size() - 1; j++) {
	    var toInsert = arr.get(j);
	    k = j-1;
	    while(k >= 0 && toInsert < arr.get(k)){
		arr.set(k+1, arr.get(k));
		k -= 1;
	    }
		arr.set(k + 1, toInsert);
	}
    }
}

public class InsertionSort {
    @Test
    public void testNormalArrayIsSorted() {
	var arr = Arrays.asList(1, 0, -3, 5, 4, 9);
	Insertion.sort(arr);
	Assert.assertEquals(Arrays.asList(-3, 0, 1, 4, 5, 9), arr);
    }
}

