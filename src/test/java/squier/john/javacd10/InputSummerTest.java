package squier.john.javacd10;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by johnsquier on 1/12/17.
 */
public class InputSummerTest {

    InputSummer inputsummer;

    @Before
    public void setup() { inputsummer = new InputSummer(); }

    @Test
    public void inputSummerTest() {
        int expected = 55;
        int actual = inputsummer.sumUpToInput(10);
        Assert.assertEquals("I expect actual to be 55", expected, actual);
    }

}
