/**
 * 
 */
package shapes;

/**
 * Octagonal Prism shape
 * 
 * @author Jaeyoung Kim
 *
 */
public class OctagonalPrism extends Polygon {
	private double edgeLength;

	/**
	 * User-defined constructor for OctagonalPrism
	 *  	 
	 * @param height Octagonal prism's height
	 * @param edgeLength Octagonal prism's edge length
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
