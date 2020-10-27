/**
 * 
 */
package shapes;

/**
 * Square Prism shape
 * 
 * @author Jaeyoung Kim
 *
 */
public class SquarePrism extends Polygon {
	private double edgeLength;
	
	/**
	 * User-defined constructor for SquarePrism
	 * 
	 * @param height Square prism's height
	 * @param edgeLength Square prism's edge length
	 */
	public SquarePrism(double height, double edgeLength) {
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
		return Math.pow(this.edgeLength, 2);
	}
}
