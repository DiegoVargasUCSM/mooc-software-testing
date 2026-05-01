package tudelft.sum;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class TwoNumbersSumTest {

    @Test
    void testSimpleSum() {
        TwoNumbersSum sum = new TwoNumbersSum();

        ArrayList<Integer> first = new ArrayList<>(Arrays.asList(1,2));
        ArrayList<Integer> second = new ArrayList<>(Arrays.asList(3,4));

        ArrayList<Integer> result = sum.addTwoNumbers(first, second);

        assertEquals(Arrays.asList(4,6), result);
    }

    @Test
    void testCarrySum() {
        TwoNumbersSum sum = new TwoNumbersSum();

        ArrayList<Integer> first = new ArrayList<>(Arrays.asList(9));
        ArrayList<Integer> second = new ArrayList<>(Arrays.asList(1));

        ArrayList<Integer> result = sum.addTwoNumbers(first, second);

        assertEquals(Arrays.asList(1,0), result);
    }

    @Test
    void testDifferentSizes() {
        TwoNumbersSum sum = new TwoNumbersSum();

        ArrayList<Integer> first = new ArrayList<>(Arrays.asList(1,2,3));
        ArrayList<Integer> second = new ArrayList<>(Arrays.asList(4,5));

        ArrayList<Integer> result = sum.addTwoNumbers(first, second);

        assertEquals(Arrays.asList(1,6,8), result);
    }

    @Test
    void testFinalCarryBug() {
        TwoNumbersSum sum = new TwoNumbersSum();

        ArrayList<Integer> first = new ArrayList<>(Arrays.asList(9,9));
        ArrayList<Integer> second = new ArrayList<>(Arrays.asList(1));

        ArrayList<Integer> result = sum.addTwoNumbers(first, second);

        assertEquals(Arrays.asList(1,0,0), result);
    }
}