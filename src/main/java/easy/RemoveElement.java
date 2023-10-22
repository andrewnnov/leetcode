package easy;


/**
 * https://leetcode.com/problems/remove-element/?envType=study-plan-v2&envId=top-interview-150
 */

public class RemoveElement {

    public int removeElement(int[] nums, int val) {

        int k = 0; // Количество элементов, которые остаются после удаления

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i]; // Перемещаем элемент, если он не равен val
                k++;
            }
        }

        return k;
    }
}
