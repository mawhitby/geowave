package mil.nga.giat.geowave.format.tdrive;

import mil.nga.giat.geowave.core.index.persist.PersistableRegistrySpi;
import mil.nga.giat.geowave.format.tdrive.TdriveIngestPlugin.IngestTdrivePointFromHdfs;

public class TdrivePersistableRegistry implements
		PersistableRegistrySpi
{

	@Override
	public PersistableIdAndConstructor[] getSupportedPersistables() {
		return new PersistableIdAndConstructor[] {
			new PersistableIdAndConstructor(
					(short) 1300,
					TdriveIngestPlugin::new),
			new PersistableIdAndConstructor(
					(short) 1301,
					IngestTdrivePointFromHdfs::new),
		};
	}
}
