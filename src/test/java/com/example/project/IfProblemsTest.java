package com.example.project;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class IfProblemsTest{

    // Tests for caughtSpeeding
    @Test
    public void caughtSpeeding_noTicket_at60_notBirthday() {
        assertEquals(0, IfProblems.caughtSpeeding(60, false));
    }

    @Test
    public void caughtSpeeding_smallTicket_at65_notBirthday() {
        assertEquals(1, IfProblems.caughtSpeeding(65, false));
    }

    @Test
    public void caughtSpeeding_birthday_allows_higher_speed() {
        assertEquals(0, IfProblems.caughtSpeeding(65, true));
    }

    // Tests for in1To10
    @Test
    public void in1To10_insideRange_returnsTrue() {
        assertTrue(IfProblems.in1To10(5, false));
    }

    @Test
    public void in1To10_outsideRange_returnsFalse() {
        assertFalse(IfProblems.in1To10(11, false));
    }

    @Test
    public void in1To10_outsideMode_allowsOutside_returnsTrue() {
        assertTrue(IfProblems.in1To10(11, true));
    }

    // Tests for nearTen
    @Test
    public void nearTen_12_returnsTrue() {
        assertTrue(IfProblems.nearTen(12));
    }

    @Test
    public void nearTen_17_returnsFalse() {
        assertFalse(IfProblems.nearTen(17));
    }

    @Test
    public void nearTen_19_returnsTrue() {
        assertTrue(IfProblems.nearTen(19));
    }

}