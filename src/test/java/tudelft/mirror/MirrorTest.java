package tudelft.mirror;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MirrorTest {

    @Test
    void testExampleOne() {
        Mirror mirror = new Mirror();

        assertEquals("ab", mirror.mirrorEnds("abXYZba"));
    }

    @Test
    void testExampleTwo() {
        Mirror mirror = new Mirror();

        assertEquals("a", mirror.mirrorEnds("abca"));
    }

    @Test
    void testOddLengthPalindrome() {
        Mirror mirror = new Mirror();

        assertEquals("aba", mirror.mirrorEnds("aba"));
    }

    @Test
    void testEvenLengthMirror() {
        Mirror mirror = new Mirror();

        assertEquals("ab", mirror.mirrorEnds("abba"));
    }

    @Test
    void testNoMirror() {
        Mirror mirror = new Mirror();

        assertEquals("", mirror.mirrorEnds("abc"));
    }
}
