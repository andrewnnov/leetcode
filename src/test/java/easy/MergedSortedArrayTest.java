package easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;



class MergedSortedArrayTest {

    @Test
    public void when123And256Then122356() {
        MergedSortedArray mergedSortedArray = new MergedSortedArray();
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int[] arrExp = {1, 2, 2, 3, 5, 6};
        int[] actualResult = mergedSortedArray.merge(nums1, 3, nums2, 3);

        Assertions.assertArrayEquals(arrExp, actualResult);
    }

    @Test
    public void when1AndEmptyThen1() {
        MergedSortedArray mergedSortedArray = new MergedSortedArray();
        int[] nums1 = {1};
        int[] nums2 = {};
        int[] arrExp = {1};
        int[] actualResult = mergedSortedArray.merge(nums1, 1, nums2, 0);

        Assertions.assertArrayEquals(arrExp, actualResult);
    }

    @Test
    public void when0And1Then1() {
        MergedSortedArray mergedSortedArray = new MergedSortedArray();
        int[] nums1 = {0};
        int[] nums2 = {1};
        int[] arrExp = {1};
        int[] actualResult = mergedSortedArray.merge(nums1, 0, nums2, 1);

        Assertions.assertArrayEquals(arrExp, actualResult);
    }

}