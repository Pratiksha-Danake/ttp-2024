package com.stringcalculator.test;

import com.stringcalculator.StringCalculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringCalculatorTest {
    //Arrange
    StringCalculator stringCalculator = new StringCalculator();

    @Test
    public void ShouldReturnZeroWhenStringIsEmpty() {
        //Act
        String result = StringCalculator.add("");
        //Assert
        assertEquals("0",result);
    }

    @Test
    public void ShouldReturnSumOfDigitsByIgnoringOtherDelimiter() {
        //Act
        String result = StringCalculator.add("//;\\n1;2");
        //Assert
        assertEquals("3",result);
    }

    @Test
    public void ShouldReturnErrorMessageIfOtherDelimiterFound() {
        //Act
        String result = StringCalculator.add("//;\\n1;2");
        //Assert
        assertEquals("'|' expected but ',' found at position 3.",result);
    }

    @Test
    public void ShouldReturnErrorMessageWhenStringContainsNegativeNumbers() {
        //Act
        String result = StringCalculator.add("-1,,2");
        //Assert
        assertEquals("Negative not allowed : -2",result);
    }

    @Test
    public void ShouldReturnErrorMessageWhenNoIsMissingAtTheEndOfString() {
        //Act
        String result = StringCalculator.add("-1,,2");
        //Assert
        assertEquals("Number expected but EOF found",result);
    }
}
