package mil.nga.giat.geowave.analytic;

import mil.nga.giat.geowave.analytic.clustering.DistortionGroupManagement.BatchIdFilter;
import mil.nga.giat.geowave.analytic.clustering.DistortionGroupManagement.DistortionDataAdapter;
import mil.nga.giat.geowave.analytic.store.PersistableStore;
import mil.nga.giat.geowave.core.index.persist.PersistableRegistrySpi;

public class AnalyticPersistableRegistry implements
		PersistableRegistrySpi
{
	@Override
	public PersistableIdAndConstructor[] getSupportedPersistables() {
		return new PersistableIdAndConstructor[] {
			new PersistableIdAndConstructor(
					(short) 700,
					GeoObjectDimensionValues::new),
			new PersistableIdAndConstructor(
					(short) 701,
					BatchIdFilter::new),
			new PersistableIdAndConstructor(
					(short) 702,
					DistortionDataAdapter::new),
			new PersistableIdAndConstructor(
					(short) 703,
					PersistableStore::new)
		};
	}
}
