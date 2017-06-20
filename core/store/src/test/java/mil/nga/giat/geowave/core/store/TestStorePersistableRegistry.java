package mil.nga.giat.geowave.core.store;

import mil.nga.giat.geowave.core.index.persist.PersistableRegistrySpi;
import mil.nga.giat.geowave.core.store.adapter.MockComponents.IntegerRangeDataStatistics;
import mil.nga.giat.geowave.core.store.adapter.MockComponents.MockAbstractDataAdapter;
import mil.nga.giat.geowave.core.store.adapter.MockComponents.MockIndexStrategy;
import mil.nga.giat.geowave.core.store.adapter.MockComponents.TestDimensionField;
import mil.nga.giat.geowave.core.store.adapter.MockComponents.TestIndexModel;
import mil.nga.giat.geowave.core.store.adapter.MockComponents.TestPersistentIndexFieldHandler;
import mil.nga.giat.geowave.core.store.memory.MemoryStoreUtilsTest.TestStringAdapter;
import mil.nga.giat.geowave.core.store.query.BasicQueryTest.ExampleDimensionOne;
import mil.nga.giat.geowave.core.store.query.BasicQueryTest.ExampleNumericIndexStrategy;

public class TestStorePersistableRegistry implements
		PersistableRegistrySpi
{

	@Override
	public PersistableIdAndConstructor[] getSupportedPersistables() {
		return new PersistableIdAndConstructor[] {
			new PersistableIdAndConstructor(
					(short) 20000,
					MockAbstractDataAdapter::new),
			new PersistableIdAndConstructor(
					(short) 20001,
					IntegerRangeDataStatistics::new),
			new PersistableIdAndConstructor(
					(short) 20002,
					TestPersistentIndexFieldHandler::new),
			new PersistableIdAndConstructor(
					(short) 20003,
					TestDimensionField::new),
			new PersistableIdAndConstructor(
					(short) 20004,
					MockIndexStrategy::new),
			new PersistableIdAndConstructor(
					(short) 20005,
					TestIndexModel::new),
			new PersistableIdAndConstructor(
					(short) 20006,
					TestStringAdapter::new),
			new PersistableIdAndConstructor(
					(short) 20007,
					ExampleNumericIndexStrategy::new),
			new PersistableIdAndConstructor(
					(short) 20008,
					ExampleDimensionOne::new)
		};
	}

}
