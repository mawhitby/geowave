package mil.nga.giat.geowave.analytic.mapreduce;

import mil.nga.giat.geowave.analytic.mapreduce.kmeans.TestObjectDataAdapter;
import mil.nga.giat.geowave.core.index.persist.PersistableRegistrySpi;

public class TestMapReducePersistableRegistry implements
		PersistableRegistrySpi
{
	@Override
	public PersistableIdAndConstructor[] getSupportedPersistables() {
		return new PersistableIdAndConstructor[] {
			new PersistableIdAndConstructor(
					(short) 10750,
					TestObjectDataAdapter::new),
		};
	}
}
