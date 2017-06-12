package mil.nga.giat.geowave.core.index;

import java.util.HashMap;
import java.util.Map;

public class IndexPersistableFactory implements
		PersistableFactorySpi
{
	private static final Map<Class<Persistable>, Short> MY_REGISTRY = createRegistry();
	private static final Map<Short, > INITIALIZER = createRegistry();

	private static Map<Class<Persistable>, Short> createRegistry() {
		final Map<Class<Persistable>, Short> myRegistry = new HashMap<Class<Persistable>, Short>();
		myRegistry.put(
				"a",
				"b");
		myRegistry.put(
				"c",
				"d");
		return myRegistry;
	}

	@Override
	public Persistable newInstance(
			final short id ) {
		switch (id) {
			case 1:
		}
		return null;
	}

	@Override
	public Map<Class<Persistable>, Short> getRegistry() {
		return MY_REGISTRY;
	}

}
