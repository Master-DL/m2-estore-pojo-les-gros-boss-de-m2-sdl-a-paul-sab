package main;

import core.service.impl.Bank;
import core.service.impl.Client;
import core.service.impl.Provider;
import core.service.impl.Store;

public class Main {

	public static void main(String[] args) {
		Provider prov = new Provider();
		Bank bank = new Bank();
		Store store = new Store(prov,bank);
		Client cl = new Client(store);
		
		cl.run();

	}

}
