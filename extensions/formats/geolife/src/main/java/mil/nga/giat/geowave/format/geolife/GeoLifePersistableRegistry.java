package mil.nga.giat.geowave.format.geolife;

import mil.nga.giat.geowave.core.index.persist.PersistableRegistrySpi;
import mil.nga.giat.geowave.format.geolife.GeoLifeIngestPlugin.IngestGeoLifeFromHdfs;

public class GeoLifePersistableRegistry implements
		PersistableRegistrySpi
{

	@Override
	public PersistableIdAndConstructor[] getSupportedPersistables() {
		return new PersistableIdAndConstructor[] {
			new PersistableIdAndConstructor(
					(short)1100,
					GeoLifeIngestPlugin::new),
			new PersistableIdAndConstructor(
					(short) 1101,
					IngestGeoLifeFromHdfs::new),
		};
	}
}
