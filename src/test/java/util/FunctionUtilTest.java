package util;

import org.junit.Test;


public class FunctionUtilTest {

    @Test(expected = IllegalArgumentException.class)
    public void validateNumberTest_NumberIsZero() { FunctionUtil.validateNumber("0"); }

    @Test
    public void validateNumberTest_NumberIsNormal() { FunctionUtil.validateNumber("123"); }

    @Test(expected = IllegalArgumentException.class)
    public void validateNumberTest_NumLessThenZero() { FunctionUtil.validateNumber("-123"); }

    @Test(expected = NumberFormatException.class)
    public void validateNumberTest_InputString() { FunctionUtil.validateNumber("Assembler"); }

    @Test(expected = IllegalArgumentException.class)
    public void validateNumberTest_InputNULL() { FunctionUtil.validateNumber(""); }
}