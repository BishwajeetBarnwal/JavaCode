package com.acme.mytrader.price;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class PriceListenerTest {

	@Test
	
	void checkdoubleprice() {
			PriceListener pricelistener = new PriceListener();
			double expected;
			assertEquals(456.30,pricelistener.add(456.30));
	}
}
