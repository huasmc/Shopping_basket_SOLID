package com.example.huascar.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by huascar on 02/12/2017.
 */

public class ShoppingBasketTest {

    ShoppingBasket shoppingBasket;

    @Before
    public void before() {
        ShoppingBasket shoppingBasket = new ShoppingBasket();
    }

    @Test
    public void testCountItems() {
        assertEquals(0, shoppingBasket.countItems());
    }
}
