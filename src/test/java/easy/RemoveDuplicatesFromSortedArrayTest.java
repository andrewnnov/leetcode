package easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesFromSortedArrayTest {

    @Test
    public void when112then12AndReturn2() {
        RemoveDuplicatesFromSortedArray removeDupl = new RemoveDuplicatesFromSortedArray();
        int[] nums = {1,1,2};
        int actualResult = removeDupl.removeDuplicates(nums);
        Assertions.assertEquals(2, actualResult);
    }

    @Test
    public void when000111223344then01234AndReturn5() {
        RemoveDuplicatesFromSortedArray removeDupl = new RemoveDuplicatesFromSortedArray();
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int actualResult = removeDupl.removeDuplicates(nums);
        Assertions.assertEquals(5, actualResult);
    }

}