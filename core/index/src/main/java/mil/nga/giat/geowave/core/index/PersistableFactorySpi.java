package mil.nga.giat.geowave.core.index;

import java.util.Map;

public interface PersistableFactorySpi
{
	public Persistable newInstance(
			short id );

	public Map<Class<Persistable>, Short> getRegistry();
}
