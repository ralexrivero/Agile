package com.agile.kata;

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
        int arabic = Roman.convert("I");
        assertEquals(1, arabic);
    }

}
