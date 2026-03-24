package tudelft.chocolate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ChocolateBagsBeforeBoundaryTest {

    @Test
    public void totalIsBiggerThanAmountOfBars() {
        ChocolateBags bags = new ChocolateBags();
        int result = bags.calculate(1, 1, 10);
        Assertions.assertEquals(-1, result);
    }

    @Test
    public void onlyBigBars() {
        int result = new ChocolateBags().calculate(5, 3, 10);
        Assertions.assertEquals(0, result);
    }

    @Test
    public void bigAndSmallBars() {
        int result = new ChocolateBags().calculate(5, 3, 17);
        Assertions.assertEquals(2, result);
    }

    @Test
    public void onlySmallBars() {
        int result = new ChocolateBags().calculate(4, 2, 3);
        Assertions.assertEquals(3, result);
    }

    @Test
    public void boundary_totalJustEnoughBars() {
        int result = new ChocolateBags().calculate(1, 1, 6);
        Assertions.assertEquals(1, result);
    }

    @Test
    public void boundary_totalJustAboveLimit() {
        int result = new ChocolateBags().calculate(1, 1, 7);
        Assertions.assertEquals(-1, result);
    }

    @Test
    public void boundary_needSmallBars() {
        int result = new ChocolateBags().calculate(5, 2, 11);
        Assertions.assertEquals(1, result);
    }

    @Test
    public void boundary_onlySmallLimit() {
        int result = new ChocolateBags().calculate(2, 0, 3);
        Assertions.assertEquals(-1, result);
    }
}