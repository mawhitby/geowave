package mil.nga.giat.geowave.format.gdelt;

import mil.nga.giat.geowave.core.index.persist.PersistableRegistrySpi;
import mil.nga.giat.geowave.format.gdelt.GDELTIngestPlugin.IngestGDELTFromHdfs;

public class GDELTPersistableRegistry implements
		PersistableRegistrySpi
{

	@Override
	public PersistableIdAndConstructor[] getSupportedPersistables() {
		return new PersistableIdAndConstructor[] {
			new PersistableIdAndConstructor(
					(short) 1000,
					GDELTIngestPlugin::new),
			new PersistableIdAndConstructor(
					(short) 1001,
					IngestGDELTFromHdfs::new),			
		};
	}
}
