package easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RemoveElementTest {

    @Test
    public void whenFourElementAndTwoDeleteThenReturnTwo() {
        RemoveElement element = new RemoveElement();
        int[] num = {3,2,2,3};
        int val = 3;

        int actualResult = element.removeElement(num, val);
        Assertions.assertEquals(2, actualResult);
    }

    @Test
    public void whenEightElementAndThreeDeleteThenReturnFive() {
        RemoveElement element = new RemoveElement();
        int[] num = {0,1,2,2,3,0,4,2};
        int val = 2;

        int actualResult = element.removeElement(num, val);
        Assertions.assertEquals(5, actualResult);
    }




}