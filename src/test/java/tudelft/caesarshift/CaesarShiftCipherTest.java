package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CaesarShiftCipherTest {

    @Test
    public void simpleShift() {
        CaesarShiftCipher c = new CaesarShiftCipher();
        String result = c.CaesarShiftCipher("abc", 3);
        Assertions.assertEquals("def", result);
    }

    @Test
    public void wrapAround() {
        CaesarShiftCipher c = new CaesarShiftCipher();
        String result = c.CaesarShiftCipher("xyz", 3);
        Assertions.assertEquals("abc", result);
    }

    @Test
    public void negativeShift() {
        CaesarShiftCipher c = new CaesarShiftCipher();
        String result = c.CaesarShiftCipher("abc", -3);
        Assertions.assertEquals("xyz", result);
    }

    @Test
    public void withSpaces() {
        CaesarShiftCipher c = new CaesarShiftCipher();
        String result = c.CaesarShiftCipher("abc xyz", 3);
        Assertions.assertEquals("def abc", result);
    }

    @Test
    public void invalidCharacters() {
        CaesarShiftCipher c = new CaesarShiftCipher();
        String result = c.CaesarShiftCipher("abc1", 3);
        Assertions.assertEquals("invalid", result);
    }
}