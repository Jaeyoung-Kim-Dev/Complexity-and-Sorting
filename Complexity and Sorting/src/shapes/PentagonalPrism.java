/**
 * 
 */
package shapes;

/**
 * @author Jaeyoung Kim
 *
 */
public class PentagonalPrism extends Polygon {
	private double edgeLength;
	
	/**
	 * User-defined constructor for PentagonalPrism
	 * 
	 * @param height
	 * @param edgeLength
	 */
	public PentagonalPrism(double height, double edgeLength) {
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
		return 5 * Math.pow(this.edgeLength, 2) * Math.tan(Math.toRadians(54)) / 4;
	}
}
