/**
 * 
 */
package shapes;

/**
 * @author Jaeyoung Kim
 *
 */
public class OctagonalPrism extends Polygon {
	private double edgeLength;

	/**
	 * User-defined constructor for OctagonalPrism
	 * 
	 * @param height
	 * @param edgeLength
	 */
	public OctagonalPrism(double height, double edgeLength) {
		super(height);
		this.edgeLength = edgeLength;
	}

	/**
	 * Get the volume
	 * 
	 * @return the volume
	 */
	@Override
	public double getVolume() {
		return getBaseArea() * this.getHeight();
	}

	/**
	 * Get the base area
	 * 
	 * @return the base area
	 */
	@Override
	public double getBaseArea() {
		return 2 * (1 + Math.sqrt(2)) * Math.pow(this.edgeLength, 2);
	}
}
