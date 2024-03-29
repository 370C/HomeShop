package com.cursan.homeshop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RelayDeliveryTest {
    @Test
    public void Given_FreeRelay_WhenGettingDeliveryPrice_ThenGet0e() {
        Delivery delivery = new RelayDelivery(5);
        assertEquals(0.0, delivery.getPrice(), 0.1);
    }

    @Test
    public void Given_LowRelay_WhenGettingDeliveryPrice_ThenGet2e99() {
        Delivery delivery = new RelayDelivery(27);
        assertEquals(2.99, delivery.getPrice(), 0.1);
    }

    @Test
    public void Given_HightRelay_WhenGettingDeliveryPrice_ThenGet4e99() {
        Delivery delivery = new RelayDelivery(52);
        assertEquals(4.99, delivery.getPrice(), 0.1);
    }
}