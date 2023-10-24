package easy;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/merge-sorted-array/?envType=study-plan-v2&envId=top-interview-150
 */

public class MergedSortedArray {

    public int[] merge(int[] nums1, int m, int[] nums2, int n) {

        System.out.println(Arrays.toString(nums1));

        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        //[1, 2, 3, 0, 0, 0]    [2, 5, 6]
        //

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }

        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }

        System.out.println(Arrays.toString(nums1));

        return nums1;

    }
}
