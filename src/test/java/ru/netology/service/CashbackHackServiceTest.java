package ru.netology.service;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @org.testng.annotations.Test
    public void testRemainBelow1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 950;
        int actual = service.remain(amount);
        int expected = 50;
        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void testRemain1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void testRemainAbove1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1050;
        int actual = service.remain(amount);
        int expected = 950;
        assertEquals(actual, expected);
    }
}