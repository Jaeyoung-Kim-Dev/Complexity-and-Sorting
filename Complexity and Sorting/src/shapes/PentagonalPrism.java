/**
 * 
 */
package shapes;

/**
 * Pentagonal Prism shape
 * 
 * @author Jaeyoung Kim
 *
 */
public class PentagonalPrism extends Polygon {
	private double edgeLength;
	
	/**
	 * User-defined constructor for PentagonalPrism
	 * 
	 * @param height Pentagonal prism's height
	 * @param edgeLength Pentagonal prism's edge length
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
