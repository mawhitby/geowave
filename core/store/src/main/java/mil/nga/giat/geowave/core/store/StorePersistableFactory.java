package mil.nga.giat.geowave.core.store;

import mil.nga.giat.geowave.core.index.AbstractPersistableFactory;
import mil.nga.giat.geowave.core.store.adapter.MockComponents.IntegerRangeDataStatistics;
import mil.nga.giat.geowave.core.store.adapter.MockComponents.MockAbstractDataAdapter;
import mil.nga.giat.geowave.core.store.adapter.MockComponents.TestPersistentIndexFieldHandler;
import mil.nga.giat.geowave.core.store.adapter.statistics.CountDataStatistics;
import mil.nga.giat.geowave.core.store.adapter.statistics.DuplicateEntryCount;
import mil.nga.giat.geowave.core.store.adapter.statistics.RowRangeDataStatistics;
import mil.nga.giat.geowave.core.store.adapter.statistics.RowRangeHistogramStatistics;
import mil.nga.giat.geowave.core.store.data.visibility.DifferingFieldVisibilityEntryCount;
import mil.nga.giat.geowave.core.store.filter.BasicQueryFilter;
import mil.nga.giat.geowave.core.store.filter.DedupeFilter;
import mil.nga.giat.geowave.core.store.index.IndexMetaDataSet;
import mil.nga.giat.geowave.core.store.index.temporal.DateRangeFilter;

public class StorePersistableFactory extends
		AbstractPersistableFactory
{

	@Override
	protected PersistableIdAndConstructor[] getSupportedPersistables() {
		return new PersistableIdAndConstructor[] {
			new PersistableIdAndConstructor(
					(short) 200,
					MockAbstractDataAdapter::new),
			new PersistableIdAndConstructor(
					(short) 201,
					CountDataStatistics::new),
			new PersistableIdAndConstructor(
					(short) 202,
					TestPersistentIndexFieldHandler::new),
			new PersistableIdAndConstructor(
					(short) 203,
					IntegerRangeDataStatistics::new),
			new PersistableIdAndConstructor(
					(short) 204,
					RowRangeDataStatistics::new),
			new PersistableIdAndConstructor(
					(short) 205,
					DateRangeFilter::new),
			new PersistableIdAndConstructor(
					(short) 206,
					DedupeFilter::new),
			new PersistableIdAndConstructor(
					(short) 207,
					BasicQueryFilter::new),
			new PersistableIdAndConstructor(
					(short) 208,
					RowRangeHistogramStatistics::new),
			new PersistableIdAndConstructor(
					(short) 209,
					IndexMetaDataSet::new),
			new PersistableIdAndConstructor(
					(short) 210,
					DifferingFieldVisibilityEntryCount::new),
			new PersistableIdAndConstructor(
					(short) 211,
					DuplicateEntryCount::new),
		};
	}

}
