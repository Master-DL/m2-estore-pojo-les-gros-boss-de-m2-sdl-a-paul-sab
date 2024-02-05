package core.service.impl;

import java.util.HashMap;
import java.util.Map;

import core.service.IProvider;
import estorePojo.exceptions.UnknownItemException;

public class Provider implements IProvider {

	private Map<String, Double> itemPrices = new HashMap<>();

	/**
	 * Constructs a new ProviderImpl
	 */
	public Provider() {
		itemPrices.put("CD", 15d);
		itemPrices.put("DVD", 20d);
	}


	public double getPrice(Object item) throws UnknownItemException {

		if (!itemPrices.containsKey(item))
			throw new UnknownItemException("Item " + item + " is not an item delivered by this provider.");

		Double price = (Double) itemPrices.get(item);
		return price.doubleValue();
	}


	public int order(Store store, Object item, int qty) throws UnknownItemException {

		if (!itemPrices.containsKey(item))
			throw new UnknownItemException("Item " + item + " is not an item delivered by this provider.");

		// Actually the production process is quite chaotic
		// We only know that the production a random number of hours!!
		double r = Math.random() * 10 * qty;
		return (int) r;
	}

}
