package easy;

/**
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/?envType=study-plan-v2&envId=top-interview-150
 */

public class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {

        int unElPos = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[unElPos]) {
                unElPos++;
                nums[unElPos] = nums[j];
            }
        }

        return unElPos + 1;

    }
}
