package mil.nga.giat.geowave.format.twitter;

import mil.nga.giat.geowave.core.index.persist.PersistableRegistrySpi;
import mil.nga.giat.geowave.format.twitter.TwitterIngestPlugin.IngestTwitterFromHdfs;

public class TwitterPersistableRegistry implements
		PersistableRegistrySpi
{

	@Override
	public PersistableIdAndConstructor[] getSupportedPersistables() {
		return new PersistableIdAndConstructor[] {
			new PersistableIdAndConstructor(
					(short) 600,
					TwitterIngestPlugin::new),
			new PersistableIdAndConstructor(
					(short) 601,
					IngestTwitterFromHdfs::new),
		};
	}
}
