package mil.nga.giat.geowave.test;

import mil.nga.giat.geowave.core.index.persist.PersistableRegistrySpi;
import mil.nga.giat.geowave.test.basic.GeoWaveBasicRasterIT.MergeCounter;
import mil.nga.giat.geowave.test.basic.GeoWaveBasicRasterIT.SumAndAveragingMergeStrategy;
import mil.nga.giat.geowave.test.basic.GeoWaveBasicRasterIT.SummingMergeStrategy;

public class IntegrationTestPersistableRegistry implements
		PersistableRegistrySpi
{

	@Override
	public PersistableIdAndConstructor[] getSupportedPersistables() {
		return new PersistableIdAndConstructor[] {
			new PersistableIdAndConstructor(
					(short) 10775,
					SummingMergeStrategy::new),
			new PersistableIdAndConstructor(
					(short) 10776,
					SumAndAveragingMergeStrategy::new),
			new PersistableIdAndConstructor(
					(short) 10777,
					MergeCounter::new),
		};
	}

}
