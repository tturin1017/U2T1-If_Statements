package com.example.project;

public class IfProblems {

    // You are driving a little too fast, and a police officer stops you.
    // Write code to compute the result, encoded as an int value: 0=no ticket,
    // 1=small ticket, 2=big ticket. If speed is 60 or less, the result is 0.
    // If speed is between 61 and 80 inclusive, the result is 1. If speed is 81 or
    // more,
    // the result is 2. Unless it is your birthday -- on that day, your speed
    // can be 5 higher in all cases.
    // caughtSpeeding(60, false) → 0
    // caughtSpeeding(65, false) → 1
    // caughtSpeeding(65, true) → 0
    public static int caughtSpeeding(int speed, boolean isBirthday) {
        return -1;

    }

    // Given a number n, return true if n is in the range 1..10, inclusive.
    // Unless outsideMode is true, in which case return true if the number is
    // less or equal to 1, or greater or equal to 10.

    // in1To10(5, false) → true
    // in1To10(11, false) → false
    // in1To10(11, true) → true

    public static boolean in1To10(int n, boolean outsideMode) {
       return false;

    }

    // Given a non-negative number "num", return true if num is within 2
    // of a multiple of 10. Note: (a % b) is the remainder of dividing a by b,
    // so (7 % 5) is 2. See also: Introduction to Mod
    // nearTen(12) → true
    // nearTen(17) → false
    // nearTen(19) → true

    public static boolean nearTen(int num) {
        return false;

    }

}