package easy.task_27;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RemoveElementTest {

    @Test
    public void testBasicCase() {
        RemoveElement solution = new RemoveElement();
        int[] nums = {3, 2, 2, 3};
        int val = 3;

        int result = solution.removeElement(nums, val);

        // Check return value
        assertEquals(2, result);

        // Check modified array (first k elements)
        int[] expected = {2, 2};
        assertArrayEquals(expected, Arrays.copyOf(nums, result));
    }

    @Test
    public void testMultipleOccurrences() {
        RemoveElement solution = new RemoveElement();
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;

        int result = solution.removeElement(nums, val);

        // Check return value
        assertEquals(5, result);

        // Check that no remaining elements equal val
        for (int i = 0; i < result; i++) {
            assertNotEquals(val, nums[i]);
        }

        // Check that all expected elements are present
        // (Order may vary, so we sort before comparing)
        int[] actualSorted = Arrays.copyOf(nums, result);
        Arrays.sort(actualSorted);
        int[] expectedSorted = {0, 0, 1, 3, 4};
        assertArrayEquals(expectedSorted, actualSorted);
    }

    @Test
    public void testEmptyArray() {
        RemoveElement solution = new RemoveElement();
        int[] nums = {};
        int val = 5;

        int result = solution.removeElement(nums, val);

        assertEquals(0, result);
    }

    @Test
    public void testAllElementsEqualToVal() {
        RemoveElement solution = new RemoveElement();
        int[] nums = {7, 7, 7, 7};
        int val = 7;

        int result = solution.removeElement(nums, val);

        assertEquals(0, result);
    }

    @Test
    public void testNoElementsEqualToVal() {
        RemoveElement solution = new RemoveElement();
        int[] nums = {1, 2, 3, 4};
        int val = 5;

        int result = solution.removeElement(nums, val);

        assertEquals(4, result);
        assertArrayEquals(nums, Arrays.copyOf(nums, result));
    }

    @Test
    public void testSingleElementEqualToVal() {
        RemoveElement solution = new RemoveElement();
        int[] nums = {5};
        int val = 5;

        int result = solution.removeElement(nums, val);

        assertEquals(0, result);
    }

    @Test
    public void testSingleElementNotEqualToVal() {
        RemoveElement solution = new RemoveElement();
        int[] nums = {3};
        int val = 5;

        int result = solution.removeElement(nums, val);

        assertEquals(1, result);
        assertEquals(3, nums[0]);
    }

    @Test
    public void testConsecutiveVals() {
        RemoveElement solution = new RemoveElement();
        int[] nums = {1, 2, 3, 3, 3, 4, 5};
        int val = 3;

        int result = solution.removeElement(nums, val);

        assertEquals(4, result);

        // Check that no remaining elements equal val
        for (int i = 0; i < result; i++) {
            assertNotEquals(val, nums[i]);
        }

        // Sort and check expected elements
        int[] actualSorted = Arrays.copyOf(nums, result);
        Arrays.sort(actualSorted);
        int[] expectedSorted = {1, 2, 4, 5};
        assertArrayEquals(expectedSorted, actualSorted);
    }

    @Test
    public void testLargeArray() {
        RemoveElement solution = new RemoveElement();

        // Create array with 1000 elements
        int[] nums = new int[1000];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i % 10; // Numbers from 0-9
        }

        int val = 5;
        int expectedCount = 900; // 900 elements should remain after removing all 5s

        int result = solution.removeElement(nums, val);

        assertEquals(expectedCount, result);

        // Check that no remaining elements equal val
        for (int i = 0; i < result; i++) {
            assertNotEquals(val, nums[i]);
        }
    }

    @Test
    public void testNegativeNumbers() {
        RemoveElement solution = new RemoveElement();
        int[] nums = {-1, -2, -3, -1, 0, 1, -1};
        int val = -1;

        int result = solution.removeElement(nums, val);

        assertEquals(4, result);

        // Check that no remaining elements equal val
        for (int i = 0; i < result; i++) {
            assertNotEquals(val, nums[i]);
        }

        // Sort and check expected elements
        int[] actualSorted = Arrays.copyOf(nums, result);
        Arrays.sort(actualSorted);
        int[] expectedSorted = {-3, -2, 0, 1};
        assertArrayEquals(expectedSorted, actualSorted);
    }
}