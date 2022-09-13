package com.playtika.test;

import com.playtika.slot.Slot;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertArrayEquals;

public class SlotTest {
    @Test
    public void getJackpotTest() {
        Slot slot = new Slot(100);
        int result = slot.getJackpot();
        assertEquals("The get method of slot object isn't working", 100, result);
    }
    @Test
    public void setJackpotTest() {
        Slot slot = new Slot(100);
        slot.setJackpot(150);
        assertEquals("The set method of slot object isn't working", 150, slot.getJackpot());
    }
    @Test
    public void coinsTest() {
        Slot slot = new Slot(1999);
        int[] coins = {0, 2, 1, 0, 2, 1, 1, 9};
        assertArrayEquals("The coins method of slot object isn't working", coins, slot.coins());
    }
}
