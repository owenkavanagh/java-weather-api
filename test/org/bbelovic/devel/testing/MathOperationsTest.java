package org.bbelovic.devel.testing;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

@Test(enabled = true)
public class MathOperationsTest {

    @Test(enabled = true)
    public void testStringToInteger() throws Exception {
        Integer actual = MathOperations.stringToInteger("125");
        assertEquals(actual.intValue(), 125);
        actual = MathOperations.stringToInteger("0");
        assertEquals(actual.intValue(), 0);
        actual = MathOperations.stringToInteger("7");
        assertEquals(actual.intValue(), 7);
        actual = MathOperations.stringToInteger("13");
        assertEquals(actual.intValue(), 13);
        actual = MathOperations.stringToInteger("-29");
        assertEquals(actual.intValue(), -29);
    }
    
    @Test(enabled = true)
    public void testIntegerToString() throws Exception {
        String actual = MathOperations.integerToString(125);
        assertEquals(actual, "125");
        actual = MathOperations.integerToString(0);
        assertEquals(actual, "0");
        actual = MathOperations.integerToString(7);
        assertEquals(actual, "7");
        actual = MathOperations.integerToString(13);
        assertEquals(actual, "13");
        actual = MathOperations.integerToString(1818);
        assertEquals(actual, "1818");
        actual = MathOperations.integerToString(-15);
        assertEquals(actual, "-15");
        actual = MathOperations.integerToString(-8);
        assertEquals(actual, "-8");
        actual = MathOperations.integerToString(-111);
        assertEquals(actual, "-111");
        actual = MathOperations.integerToString(-1222);
        assertEquals(actual, "-1222");
    }
}
