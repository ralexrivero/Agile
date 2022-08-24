package com.agile.kata;

import jdk.jfr.StackTrace;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RomanTests {
    @Test
    public void junitWorks() {
        assertTrue(true);
    }

    @Test
    public void convertSingleDigitRoman() {
        int arabic = convert("I");
        assertEquals(1, arabic);
    }

    private int convert(String romanNumeral) {
        return 1;
    }
}
