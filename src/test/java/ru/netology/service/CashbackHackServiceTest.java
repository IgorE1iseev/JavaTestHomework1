package ru.netology.service;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @org.junit.Test
    public void testRemainBelow1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 950;
        int actual = service.remain(amount);
        int expected = 50;
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void testRemain1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void testRemainAbove1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1050;
        int actual = service.remain(amount);
        int expected = 950;
        assertEquals(expected, actual);
    }
}