package mil.nga.giat.geowave.core.index;

import java.nio.ByteBuffer;

public class MultiDimensionalCoordinateRangesArray implements
		Persistable
{
	private MultiDimensionalCoordinateRanges[] rangesArray;

	public MultiDimensionalCoordinateRangesArray() {}

	public MultiDimensionalCoordinateRangesArray(
			final MultiDimensionalCoordinateRanges[] rangesArray ) {
		this.rangesArray = rangesArray;
	}

	public MultiDimensionalCoordinateRanges[] getRangesArray() {
		return rangesArray;
	}

	@Override
	public byte[] toBinary() {
		final byte[][] rangesBinaries = new byte[rangesArray.length][];
		int binaryLength = 4;
		for (int i = 0; i < rangesArray.length; i++) {
			rangesBinaries[i] = rangesArray[i].toBinary();
			binaryLength += (4 + rangesBinaries[i].length);
		}
		final ByteBuffer buf = ByteBuffer.allocate(binaryLength);
		buf.putInt(rangesBinaries.length);
		for (final byte[] rangesBinary : rangesBinaries) {
			buf.putInt(rangesBinary.length);
			buf.put(rangesBinary);
		}
		return buf.array();
	}

	@Override
	public void fromBinary(
			final byte[] bytes ) {
		final ByteBuffer buf = ByteBuffer.wrap(bytes);
		rangesArray = new MultiDimensionalCoordinateRanges[buf.getInt()];
		for (int i = 0; i < rangesArray.length; i++) {
			final byte[] rangesBinary = new byte[buf.getInt()];
			buf.get(rangesBinary);
			rangesArray[i] = new MultiDimensionalCoordinateRanges();
			rangesArray[i].fromBinary(rangesBinary);
		}
	}

	public static class ArrayOfArrays implements
			Persistable
	{
		private MultiDimensionalCoordinateRangesArray[] coordinateArrays;

		public ArrayOfArrays() {

		}

		public ArrayOfArrays(
				MultiDimensionalCoordinateRangesArray[] coordinateArrays ) {
			this.coordinateArrays = coordinateArrays;
		}

		public MultiDimensionalCoordinateRangesArray[] getCoordinateArrays() {
			return coordinateArrays;
		}

		@Override
		public byte[] toBinary() {
			final byte[][] rangesBinaries = new byte[coordinateArrays.length][];
			int binaryLength = 4;
			for (int i = 0; i < coordinateArrays.length; i++) {
				rangesBinaries[i] = coordinateArrays[i].toBinary();
				binaryLength += (4 + rangesBinaries[i].length);
			}
			final ByteBuffer buf = ByteBuffer.allocate(binaryLength);
			buf.putInt(rangesBinaries.length);
			for (final byte[] rangesBinary : rangesBinaries) {
				buf.putInt(rangesBinary.length);
				buf.put(rangesBinary);
			}
			return buf.array();
		}

		@Override
		public void fromBinary(
				byte[] bytes ) {
			final ByteBuffer buf = ByteBuffer.wrap(bytes);
			coordinateArrays = new MultiDimensionalCoordinateRangesArray[buf.getInt()];
			for (int i = 0; i < coordinateArrays.length; i++) {
				final byte[] rangesBinary = new byte[buf.getInt()];
				buf.get(rangesBinary);
				coordinateArrays[i] = new MultiDimensionalCoordinateRangesArray();
				coordinateArrays[i].fromBinary(rangesBinary);
			}
		}

	}
}