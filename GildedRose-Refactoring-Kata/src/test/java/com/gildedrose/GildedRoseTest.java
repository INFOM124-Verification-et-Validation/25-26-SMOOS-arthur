package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    void foo1() {
        Item[] items = new Item[] { new Item("foo", 10, 10 ,"standard") };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("foo", app.items[0].name);
        assertEquals(9, app.items[0].sellIn);
        assertEquals(9, app.items[0].quality);
        assertEquals("standard", app.items[0].category);
    }
    @Test
    void foo2() {
        Item[] items = new Item[] { new Item("foo", 0, 10 ,"standard") };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("foo", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(9, app.items[0].quality);
        assertEquals("standard", app.items[0].category);
    }
    @Test
    void foo3() {
        Item[] items = new Item[] { new Item("foo", 10, 0 ,"standard") };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("foo", app.items[0].name);
        assertEquals(9, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
        assertEquals("standard", app.items[0].category);
    }
    @Test
    void testHand1(){
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", 10, 80, "special") };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(10, app.items[0].sellIn);
        assertEquals(80, app.items[0].quality);
        assertEquals("special", app.items[0].category);
    }
    @Test
    void conjured1() {
        Item[] items = new Item[]{new Item("conjuredFood", 10, 10, "conjured")};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("conjuredFood", app.items[0].name);
        assertEquals(9, app.items[0].sellIn);
        assertEquals(8, app.items[0].quality);
        assertEquals("conjured", app.items[0].category);
    }
    @Test
    void conjured2() {
        Item[] items = new Item[]{new Item("conjuredFood", 10, 1, "conjured")};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("conjuredFood", app.items[0].name);
        assertEquals(9, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
        assertEquals("conjured", app.items[0].category);
    }

    @Test
    void concert1() {
        Item[] items = new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20, "special")};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(14, app.items[0].sellIn);
        assertEquals(21, app.items[0].quality);
        assertEquals("special", app.items[0].category);
    }


}
