package pro.buildmysoftware.oop.creator;

import java.util.HashMap;
import java.util.Map;

class CachedItemFactory {

	private Map<String, Item> items;

	public CachedItemFactory() {
		items = new HashMap<>();
	}

	Item produceItem(String name) {
		if (items.containsKey(name)) {
			return items.get(name);
		}
		Item item = new Item(name);
		items.put(name, item);
		return item;
	}
}
