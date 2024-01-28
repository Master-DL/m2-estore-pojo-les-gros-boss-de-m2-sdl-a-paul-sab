package core.service;

import core.service.impl.Store;
import estorePojo.exceptions.UnknownItemException;

public interface IProvider {

    /**
     * Emit an order for items. The provider returns the delay for delivering the
     * items.
     *
     * @param store the store that emits the order
     * @param item  the item ordered
     * @param qty   the quantity ordered
     * @return the delay (in hours)
     */
    int order(Store store, Object item, int qty) throws UnknownItemException;
}
