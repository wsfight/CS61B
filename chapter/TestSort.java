import com.google.common.truth.Truth;
import org.junit.Assert;
import org.junit.Test;


public class TestSort {
    @Test
    public void testSort() {
        String[] input = {"i", "have", "an", "egg"};
        String[] expected = {"an", "egg", "have", "i"};
        SelectionSort.sort(input);
        for (int i = 0; i < input.length; i++) {
            if (!input[i].equals(expected[i])) {
                System.out.println("Mismatch in position " + i + ". expected:" + expected[i] + ". but:" + input[i]);
            }
        }

    }


    @Test
    public void TestFindTheSmallestItemIndex() {
        String[] input = {"i", "hava", "an", "egg"};
        int expected = 2;
        int actual = SelectionSort.findSmallestIndex(input, 0);
        org.junit.Assert.assertEquals(expected, actual);

    }

    /**
     * Test the sort method of the sort class.
     */
    @Test
    public void TestSelectionSort() {
        String[] input = {"i", "have", "an", "egg"};
        String[] expected = {"an", "egg", "have", "i"};
        SelectionSort.sort(input);
        org.junit.Assert.assertArrayEquals(expected, input);
    }

}
