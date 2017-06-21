package mil.nga.giat.geowave.core.ingest.hdfs.mapreduce;

import mil.nga.giat.geowave.core.index.persist.PersistableRegistrySpi;
import mil.nga.giat.geowave.core.ingest.hdfs.mapreduce.AbstractLocalIngestWithMapper.InternalIngestWithMapper;

public class IngestPersistableRegistry implements
		PersistableRegistrySpi
{

	@Override
	public PersistableIdAndConstructor[] getSupportedPersistables() {
		return new PersistableIdAndConstructor[] {
			new PersistableIdAndConstructor(
					(short) 400,
					InternalIngestWithMapper::new),
		};
	}
}
