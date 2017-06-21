package mil.nga.giat.geowave.format.stanag4676;

import mil.nga.giat.geowave.core.index.persist.PersistableRegistrySpi;
import mil.nga.giat.geowave.format.stanag4676.Stanag4676IngestPlugin.IngestWithReducerImpl;
import mil.nga.giat.geowave.format.stanag4676.image.ImageChipDataAdapter;

public class Stanag4676PersistableRegistry implements
		PersistableRegistrySpi
{

	@Override
	public PersistableIdAndConstructor[] getSupportedPersistables() {
		return new PersistableIdAndConstructor[] {
			new PersistableIdAndConstructor(
					(short) 800,
					IngestWithReducerImpl::new),
			new PersistableIdAndConstructor(
					(short) 801,
					ImageChipDataAdapter::new),

		};
	}
}
