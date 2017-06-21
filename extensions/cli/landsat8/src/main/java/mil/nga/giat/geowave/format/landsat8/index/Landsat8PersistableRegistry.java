package mil.nga.giat.geowave.format.landsat8.index;

import mil.nga.giat.geowave.core.index.persist.PersistableRegistrySpi;

public class Landsat8PersistableRegistry implements
		PersistableRegistrySpi
{

	@Override
	public PersistableIdAndConstructor[] getSupportedPersistables() {
		return new PersistableIdAndConstructor[] {
			new PersistableIdAndConstructor(
					(short) 1500,
					Landsat8TemporalBinningStrategy::new),
		};
	}
}
