package mil.nga.giat.geowave.format.avro;

import mil.nga.giat.geowave.core.index.persist.PersistableRegistrySpi;
import mil.nga.giat.geowave.format.avro.AvroIngestPlugin.IngestAvroFeaturesFromHdfs;

public class AvroPersistableRegistry implements
		PersistableRegistrySpi
{

	@Override
	public PersistableIdAndConstructor[] getSupportedPersistables() {
		return new PersistableIdAndConstructor[] {
			new PersistableIdAndConstructor(
					(short) 900,
					AvroIngestPlugin::new),
			new PersistableIdAndConstructor(
					(short) 901,
					IngestAvroFeaturesFromHdfs::new),
		};
	}
}
