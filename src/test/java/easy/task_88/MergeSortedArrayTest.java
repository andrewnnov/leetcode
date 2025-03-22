package easy.task_88;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortedArrayTest {
    private final MergeSortedArray solution = new MergeSortedArray();

    @Test
    public void testExample1() {
        // Example 1 from the problem statement
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        solution.merge(nums1, m, nums2, n);

        assertArrayEquals(new int[]{1, 2, 2, 3, 5, 6}, nums1);
    }

    @Test
    public void testExample2() {
        // Example 2 from the problem statement
        int[] nums1 = {1};
        int m = 1;
        int[] nums2 = {};
        int n = 0;

        solution.merge(nums1, m, nums2, n);

        assertArrayEquals(new int[]{1}, nums1);
    }

    @Test
    public void testExample3() {
        // Example 3 from the problem statement
        int[] nums1 = {0};
        int m = 0;
        int[] nums2 = {1};
        int n = 1;

        solution.merge(nums1, m, nums2, n);

        assertArrayEquals(new int[]{1}, nums1);
    }

    @Test
    public void testEmptyArrays() {
        int[] nums1 = {};
        int m = 0;
        int[] nums2 = {};
        int n = 0;

        solution.merge(nums1, m, nums2, n);

        assertArrayEquals(new int[]{}, nums1);
    }

    @Test
    public void testAllElementsFromNums2Smaller() {
        int[] nums1 = {4, 5, 6, 0, 0, 0};
        int m = 3;
        int[] nums2 = {1, 2, 3};
        int n = 3;

        solution.merge(nums1, m, nums2, n);

        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, nums1);
    }

    @Test
    public void testAllElementsFromNums2Larger() {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {4, 5, 6};
        int n = 3;

        solution.merge(nums1, m, nums2, n);

        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, nums1);
    }

    @Test
    public void testInterleaving() {
        int[] nums1 = {1, 3, 5, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 4, 6};
        int n = 3;

        solution.merge(nums1, m, nums2, n);

        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, nums1);
    }

    @Test
    public void testWithNegativeNumbers() {
        int[] nums1 = {-3, -1, 0, 0, 0, 0};
        int m = 3;
        int[] nums2 = {-4, -2, 5};
        int n = 3;

        solution.merge(nums1, m, nums2, n);

        assertArrayEquals(new int[]{-4, -3, -2, -1, 0, 5}, nums1);
    }

    @Test
    public void testWithDuplicates() {
        int[] nums1 = {1, 2, 2, 0, 0, 0};
        int m = 3;
        int[] nums2 = {1, 2, 3};
        int n = 3;

        solution.merge(nums1, m, nums2, n);

        assertArrayEquals(new int[]{1, 1, 2, 2, 2, 3}, nums1);
    }

    @Test
    public void testLargerFirstArray() {
        int[] nums1 = {1, 3, 5, 7, 9, 0, 0, 0};
        int m = 5;
        int[] nums2 = {2, 4, 6};
        int n = 3;

        solution.merge(nums1, m, nums2, n);

        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 9}, nums1);
    }

    @Test
    public void testLargerSecondArray() {
        int[] nums1 = {1, 3, 0, 0, 0, 0, 0};
        int m = 2;
        int[] nums2 = {2, 4, 6, 8, 10};
        int n = 5;

        solution.merge(nums1, m, nums2, n);

        assertArrayEquals(new int[]{1, 2, 3, 4, 6, 8, 10}, nums1);
    }

}