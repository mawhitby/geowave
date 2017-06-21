package mil.nga.giat.geowave.core.index;

import mil.nga.giat.geowave.core.index.PersistenceUtilsTest.APersistable;
import mil.nga.giat.geowave.core.index.persist.PersistableRegistrySpi;

public class TestIndexPersistableRegistry implements
		PersistableRegistrySpi
{

	@Override
	public PersistableIdAndConstructor[] getSupportedPersistables() {
		return new PersistableIdAndConstructor[] {
			new PersistableIdAndConstructor(
					(short) 10100,
					APersistable::new),
		};
	}
}
