package mil.nga.giat.geowave.format.gpx;

import mil.nga.giat.geowave.core.index.persist.PersistableRegistrySpi;
import mil.nga.giat.geowave.format.gpx.GpxIngestPlugin.IngestGpxTrackFromHdfs;

public class GpxPersistableRegistry implements
		PersistableRegistrySpi
{

	@Override
	public PersistableIdAndConstructor[] getSupportedPersistables() {
		return new PersistableIdAndConstructor[] {
			new PersistableIdAndConstructor(
					(short) 1200,
					GpxIngestPlugin::new),
			new PersistableIdAndConstructor(
					(short) 1201,
					IngestGpxTrackFromHdfs::new),
		};
	}
}
