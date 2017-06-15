package mil.nga.giat.geowave.core.index;

import mil.nga.giat.geowave.core.index.CompoundIndexStrategy.CompoundIndexMetaDataWrapper;
import mil.nga.giat.geowave.core.index.MultiDimensionalCoordinateRangesArray.ArrayOfArrays;
import mil.nga.giat.geowave.core.index.dimension.BasicDimensionDefinition;
import mil.nga.giat.geowave.core.index.dimension.UnboundedDimensionDefinition;
import mil.nga.giat.geowave.core.index.sfc.SFCDimensionDefinition;
import mil.nga.giat.geowave.core.index.sfc.data.BasicNumericDataset;
import mil.nga.giat.geowave.core.index.sfc.data.BinnedNumericDataset;
import mil.nga.giat.geowave.core.index.sfc.data.NumericRange;
import mil.nga.giat.geowave.core.index.sfc.data.NumericValue;
import mil.nga.giat.geowave.core.index.sfc.hilbert.HilbertSFC;
import mil.nga.giat.geowave.core.index.sfc.tiered.SingleTierSubStrategy;
import mil.nga.giat.geowave.core.index.sfc.tiered.TieredSFCIndexStrategy;
import mil.nga.giat.geowave.core.index.sfc.tiered.TieredSFCIndexStrategy.TierIndexMetaData;
import mil.nga.giat.geowave.core.index.sfc.xz.XZHierarchicalIndexFactory;
import mil.nga.giat.geowave.core.index.sfc.xz.XZHierarchicalIndexStrategy;
import mil.nga.giat.geowave.core.index.sfc.xz.XZOrderSFC;
import mil.nga.giat.geowave.core.index.sfc.zorder.ZOrderSFC;
import mil.nga.giat.geowave.core.index.simple.HashKeyIndexStrategy;
import mil.nga.giat.geowave.core.index.simple.RoundRobinKeyIndexStrategy;
import mil.nga.giat.geowave.core.index.simple.SimpleIntegerIndexStrategy;
import mil.nga.giat.geowave.core.index.simple.SimpleLongIndexStrategy;
import mil.nga.giat.geowave.core.index.simple.SimpleShortIndexStrategy;

public class IndexPersistableFactory implements 
		PersistableRegistrySpi
{

	@Override
	public PersistableIdAndConstructor[] getSupportedPersistables() {
		return new PersistableIdAndConstructor[] {
			new PersistableIdAndConstructor(
					(short) 100,
					CompoundIndexMetaDataWrapper::new),
			new PersistableIdAndConstructor(
					(short) 101,
					CompoundIndexStrategy::new),
			new PersistableIdAndConstructor(
					(short) 102,
					CoordinateRange::new),
			new PersistableIdAndConstructor(
					(short) 103,
					MultiDimensionalCoordinateRanges::new),
			new PersistableIdAndConstructor(
					(short) 103,
					ArrayOfArrays::new),
			new PersistableIdAndConstructor(
					(short) 104,
					MultiDimensionalCoordinateRangesArray::new),
			new PersistableIdAndConstructor(
					(short) 105,
					NullNumericIndexStrategy::new),
			new PersistableIdAndConstructor(
					(short) 106,
					NumericIndexStrategyWrapper::new),
			new PersistableIdAndConstructor(
					(short) 107,
					BasicDimensionDefinition::new),
			new PersistableIdAndConstructor(
					(short) 108,
					UnboundedDimensionDefinition::new),
			new PersistableIdAndConstructor(
					(short) 109,
					SFCDimensionDefinition::new),
			new PersistableIdAndConstructor(
					(short) 110,
					BasicNumericDataset::new),
			new PersistableIdAndConstructor(
					(short) 111,
					BinnedNumericDataset::new),
			new PersistableIdAndConstructor(
					(short) 112,
					NumericRange::new),
			new PersistableIdAndConstructor(
					(short) 113,
					NumericValue::new),
			new PersistableIdAndConstructor(
					(short) 114,
					HilbertSFC::new),
			new PersistableIdAndConstructor(
					(short) 115,
					SingleTierSubStrategy::new),
			new PersistableIdAndConstructor(
					(short) 116,
					TieredSFCIndexStrategy::new),
			new PersistableIdAndConstructor(
					(short) 117,
					XZHierarchicalIndexStrategy::new),
			new PersistableIdAndConstructor(
					(short) 118,
					XZOrderSFC::new),
			new PersistableIdAndConstructor(
					(short) 119,
					ZOrderSFC::new),
			new PersistableIdAndConstructor(
					(short) 120,
					HashKeyIndexStrategy::new),
			new PersistableIdAndConstructor(
					(short) 121,
					RoundRobinKeyIndexStrategy::new),
			new PersistableIdAndConstructor(
					(short) 122,
					SimpleIntegerIndexStrategy::new),
			new PersistableIdAndConstructor(
					(short) 123,
					SimpleLongIndexStrategy::new),
			new PersistableIdAndConstructor(
					(short) 124,
					SimpleShortIndexStrategy::new),
		};
	}

}
