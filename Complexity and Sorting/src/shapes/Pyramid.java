/**
 * 
 */
package shapes;

/**
 * @author Jaeyoung Kim
 *
 */
public class Pyramid extends Polygon {
	private double edgeLength;
	
	/**
	 * User-defined constructor for Pyramid
	 * 
	 * @param height
	 * @param edgeLength
	 */
	public Pyramid(double height, double edgeLength) {
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
		return this.getHeight() * getBaseArea() / 3;
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
