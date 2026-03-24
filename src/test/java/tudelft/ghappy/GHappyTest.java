package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GHappyTest {

    @Test
    public void happyGsTogether() {
        GHappy gh = new GHappy();
        Assertions.assertTrue(gh.gHappy("xxggxx"));
    }

    @Test
    public void singleGNotHappy() {
        GHappy gh = new GHappy();
        Assertions.assertFalse(gh.gHappy("xxgxx"));
    }

    @Test
    public void mixedGsNotAllHappy() {
        GHappy gh = new GHappy();
        Assertions.assertFalse(gh.gHappy("xxggyygxx"));
    }

    @Test
    public void noGs() {
        GHappy gh = new GHappy();
        Assertions.assertTrue(gh.gHappy("abcdef"));
    }

    @Test
    public void gAtBeginning_bugCase() {
        GHappy gh = new GHappy();
        Assertions.assertFalse(gh.gHappy("gxx"));
    }

    @Test
    public void gAtEnd() {
        GHappy gh = new GHappy();
        Assertions.assertFalse(gh.gHappy("xxg"));
    }
}