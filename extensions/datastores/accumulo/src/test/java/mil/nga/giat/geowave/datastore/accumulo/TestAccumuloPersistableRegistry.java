package mil.nga.giat.geowave.datastore.accumulo;

import mil.nga.giat.geowave.core.index.persist.PersistableRegistrySpi;
import mil.nga.giat.geowave.datastore.accumulo.AccumuloDataStoreStatsTest.GeoBoundingBoxStatistics;
import mil.nga.giat.geowave.datastore.accumulo.AccumuloDataStoreStatsTest.TestGeometryAdapter;
import mil.nga.giat.geowave.datastore.accumulo.AccumuloOptionsTest.AnotherAdapter;
import mil.nga.giat.geowave.datastore.accumulo.mapreduce.AccumuloSplitsProviderTest;
import mil.nga.giat.geowave.datastore.accumulo.query.AccumuloRangeQueryTest;

public class TestAccumuloPersistableRegistry implements
		PersistableRegistrySpi
{
	@Override
	public PersistableIdAndConstructor[] getSupportedPersistables() {
		return new PersistableIdAndConstructor[] {
			new PersistableIdAndConstructor(
					(short) 10250,
					GeoBoundingBoxStatistics::new),
			new PersistableIdAndConstructor(
					(short) 10251,
					TestGeometryAdapter::new),
			new PersistableIdAndConstructor(
					(short) 10252,
					AccumuloOptionsTest.TestGeometryAdapter::new),
			new PersistableIdAndConstructor(
					(short) 10253,
					AnotherAdapter::new),
			new PersistableIdAndConstructor(
					(short) 10254,
					AccumuloSplitsProviderTest.TestGeometryAdapter::new),
			new PersistableIdAndConstructor(
					(short) 10255,
					AccumuloSplitsProviderTest.GeoBoundingBoxStatistics::new),
			new PersistableIdAndConstructor(
					(short) 10256,
					AccumuloRangeQueryTest.TestGeometryAdapter::new),
		};
	}
}
